import sbt._

object Dependencies {

  val dependencies = Seq(
    "uk.gov.hmrc"           %% "webdriver-factory"      % "0.38.0"   % Test,
    "org.scalatest"         %% "scalatest"              % "3.2.14"   % Test,
    "org.scalatestplus"     %% "selenium-4-2"           % "3.2.13.0" % Test,
    "org.scalactic"         %% "scalactic"              % "3.2.14",
    "io.cucumber"           %% "cucumber-scala"         % "8.12.0"   % Test,
    "io.cucumber"            % "cucumber-junit"         % "7.8.1"    % Test,
    "io.cucumber"            % "cucumber-picocontainer" % "7.8.1",
    "junit"                  % "junit"                  % "4.13.2"   % Test,
    "com.novocode"           % "junit-interface"        % "0.11"     % Test,
    "org.apache.commons"     % "commons-lang3"          % "3.12.0",
    "com.typesafe"           % "config"                 % "1.4.2"    % Test,
    "com.github.tomakehurst" % "wiremock-standalone"    % "2.27.2"   % Test
  )
}
