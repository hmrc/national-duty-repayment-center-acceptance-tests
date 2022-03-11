import sbt._

object Dependencies {

  val dependencies = Seq(
    "uk.gov.hmrc"         %% "webdriver-factory"        % "0.25.0"    % Test,
    "org.scalatest"       %% "scalatest"                % "3.0.8"     % Test,
    "org.scalactic"       %% "scalactic"                % "3.0.8",
    "org.pegdown"         %  "pegdown"                  % "1.6.0",
    "io.cucumber"         %% "cucumber-scala"           % "8.2.2"     % Test,
    "io.cucumber"         %  "cucumber-junit"           % "7.2.0"     % Test,
    "io.cucumber"         %  "cucumber-picocontainer"   % "7.2.0",
    "junit"               %  "junit"                    % "4.12"      % Test,
    "com.novocode"        %  "junit-interface"          % "0.11"      % Test,
    "org.apache.commons"  %  "commons-lang3"            % "3.11",
    "com.typesafe"        %  "config"                   % "1.3.2"     % Test,
    "org.mock-server"     %  "mockserver-client-java"   % "5.12.0"    % Test,
    "org.mock-server"     %  "mockserver-netty"         % "5.12.0"    % Test
  )

  val dependencyOverrides = Seq(
    "com.google.guava"    %  "guava" % "25.0-jre"  % Test
  )
}