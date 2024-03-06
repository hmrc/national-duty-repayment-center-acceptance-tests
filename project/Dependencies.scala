import sbt._

object Dependencies {

  val dependencies = Seq(
    "uk.gov.hmrc"           %% "ui-test-runner"         % "0.21.0"   % Test,
    "org.scalatest"         %% "scalatest"              % "3.2.17"   % Test,
    "org.scalatestplus"     %% "selenium-4-12"          % "3.2.17.0" % Test,
    "org.scalactic"         %% "scalactic"              % "3.2.15"   % Test,
    "io.cucumber"           %% "cucumber-scala"         % "8.20.0"   % Test,
    "io.cucumber"            % "cucumber-junit"         % "7.15.0"   % Test,
    "io.cucumber"            % "cucumber-picocontainer" % "7.11.1"   % Test,
    "junit"                  % "junit"                  % "4.13.2"   % Test,
    "com.novocode"           % "junit-interface"        % "0.11"     % Test,
    "org.apache.commons"     % "commons-lang3"          % "3.12.0"   % Test,
    "com.typesafe"           % "config"                 % "1.4.3"    % Test
  )
}
