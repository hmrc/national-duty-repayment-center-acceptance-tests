error id: file://<WORKSPACE>/build.sbt:
file://<WORKSPACE>/build.sbt
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -Test.
	 -Test#
	 -Test().
	 -scala/Predef.Test.
	 -scala/Predef.Test#
	 -scala/Predef.Test().
offset: 537
uri: file://<WORKSPACE>/build.sbt
text:
```scala
lazy val testSuite = (project in file("."))
  .disablePlugins(JUnitXmlReportPlugin) // Required to prevent https://github.com/scalatest/scalatest/issues/1427
  .settings(
    name := "national-duty-repayment-center-acceptance-tests",
    version := "0.1.0",
    scalaVersion := "2.13.16",
    scalacOptions ++= Seq("-feature"),
    libraryDependencies ++= Dependencies.dependencies,
    // The testOptions from SbtAutoBuildPlugin supports only ScalaTest. Resetting testOptions for Cucumber Tests.
    Test / testOptions := Seq.empty
    @@Test / unmanagedSources / excludeFilter := (HiddenFileFilter || new FileFilter {
  def accept(f: File) = f.getAbsolutePath.contains("src/test/scala/ndrcApplication/specs")
})
    
  )

```


#### Short summary: 

empty definition using pc, found symbol in pc: 