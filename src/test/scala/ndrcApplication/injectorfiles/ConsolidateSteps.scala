/*
 * Copyright 2026 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ndrcApplication.injectorfiles

import java.io.{File, PrintWriter}
import scala.io.Source
import scala.util.Using


case class MethodInfo(comment: String, methodDef: String)

object ConsolidateSteps extends App {
    // Configuration
    val sourceFolder = "src/test/scala/ndrcApplication/specsteps"  // Change this to your folder path
    val outputFile = "stepdefsSteps.scala"  // Output file name
    
    println(s"Starting consolidation from folder: $sourceFolder")
    
    // Get all Scala files from the source folder
    val folder = new File(sourceFolder)
    if (!folder.exists() || !folder.isDirectory) {
      println(s"Error: Folder '$sourceFolder' does not exist or is not a directory")
      System.exit(1)
    }
    
    val scalaFiles = folder.listFiles()
      .filter(_.isFile)
      .filter(_.getName.endsWith(".scala"))
      .sortBy(_.getName)
    
    println(s"Found ${scalaFiles.length} Scala files")
    
    // Extract imports and methods from all files
    val allImports = scala.collection.mutable.Set[String]()
    val allMethods = scala.collection.mutable.ArrayBuffer[MethodInfo]()
    var packageDeclaration = ""
    
    scalaFiles.foreach { file =>
      println(s"Processing: ${file.getName}")
      val (imports, methods, pkg) = extractFromFile(file)
      allImports ++= imports
      allMethods ++= methods
      if (packageDeclaration.isEmpty && pkg.nonEmpty) {
        packageDeclaration = pkg
      }
    }
    
    println(s"Extracted ${allMethods.length} methods and ${allImports.size} imports")
    
    // Write consolidated file
    writeConsolidatedFile(outputFile, packageDeclaration, allImports.toSeq.sorted, allMethods.toSeq)
    
    println(s"Successfully created $outputFile")
  
  def extractFromFile(file: File): (Seq[String], Seq[MethodInfo], String) = {
    val imports = scala.collection.mutable.ArrayBuffer[String]()
    val methods = scala.collection.mutable.ArrayBuffer[MethodInfo]()
    var packageDecl = ""
    
    Using(Source.fromFile(file)) { source =>
      val lines = source.getLines().toArray
      var i = 0
      
      while (i < lines.length) {
        val line = lines(i).trim
        
        // Extract package declaration
        if (line.startsWith("package ") && packageDecl.isEmpty) {
          packageDecl = line
        }
        
        // Extract imports
        if (line.startsWith("import ")) {
          imports += line
        }
        
        // Extract methods with their comments
        if (isMethodDefinition(line)) {
          val (methodInfo, nextIndex) = extractMethod(lines, i)
          methods += methodInfo
          i = nextIndex - 1  // -1 because we'll increment at the end of the loop
        }
        
        i += 1
      }
    }.getOrElse {
      println(s"Warning: Could not read file ${file.getName}")
    }
    
    (imports.toSeq, methods.toSeq, packageDecl)
  }
  
  def isMethodDefinition(line: String): Boolean = {
    val trimmed = line.trim
    // Check for method definitions (def keyword)
    trimmed.startsWith("def ") && 
    !trimmed.contains("//") && 
    !line.trim.isEmpty
  }
  
  def extractMethod(lines: Array[String], startIndex: Int): (MethodInfo, Int) = {
    val commentLines = scala.collection.mutable.ArrayBuffer[String]()
    val methodLines = scala.collection.mutable.ArrayBuffer[String]()
    
    // Look backwards for comments
    var commentIndex = startIndex - 1
    while (commentIndex >= 0) {
      val line = lines(commentIndex)
      val trimmed = line.trim
      
      if (trimmed.startsWith("//") || trimmed.startsWith("/*") || 
          trimmed.startsWith("*") || trimmed.endsWith("*/")) {
        commentLines.prepend(line)
        commentIndex -= 1
      } else if (trimmed.isEmpty) {
        commentIndex -= 1
      } else {
        // Stop when we hit non-comment, non-empty line
        commentIndex = -1
      }
    }
    
    // Extract method definition
    var methodIndex = startIndex
    var braceCount = 0
    var inMethod = false
    
    while (methodIndex < lines.length) {
      val line = lines(methodIndex)
      methodLines += line
      
      // Count braces to find method end
      braceCount += line.count(_ == '{')
      braceCount -= line.count(_ == '}')
      
      if (line.contains("{")) {
        inMethod = true
      }
      
      if (inMethod && braceCount == 0) {
        methodIndex += 1
        // Exit after closing brace
        return (MethodInfo(commentLines.mkString("\n"), methodLines.mkString("\n")), methodIndex)
      }
      
      methodIndex += 1
    }
    
    (MethodInfo(commentLines.mkString("\n"), methodLines.mkString("\n")), methodIndex)
  }
  
  def writeConsolidatedFile(
    filename: String, 
    packageDecl: String, 
    imports: Seq[String], 
    methods: Seq[MethodInfo]
  ): Unit = {
    Using(new PrintWriter(new File(filename))) { writer =>
      // Write package declaration
      if (packageDecl.nonEmpty) {
        writer.println(packageDecl)
        writer.println()
      }
      
      // Write imports
      if (imports.nonEmpty) {
        imports.foreach(writer.println)
        writer.println()
      }
      
      // Write class/object wrapper
      writer.println("object StepDefsSteps {")
      writer.println()
      
      // Write all methods
      methods.foreach { methodInfo =>
        if (methodInfo.comment.nonEmpty) {
          writer.println(s"  ${methodInfo.comment.replaceAll("\n", "\n  ")}")
        }
        writer.println(s"  ${methodInfo.methodDef.replaceAll("\n", "\n  ")}")
        writer.println()
      }
      
      writer.println("}")
    }.get
  }
}