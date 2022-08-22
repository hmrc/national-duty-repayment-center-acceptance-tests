import sbt._

object Dependencies {

  val dependencies = Seq(
    "uk.gov.hmrc"             %% "webdriver-factory"        % "0.35.0"    % Test,
    "org.scalatest"           %% "scalatest"                % "3.2.13"    % Test,
    "org.scalactic"           %% "scalactic"                % "3.2.13",
    "org.pegdown"             %  "pegdown"                  % "1.6.0",
    "io.cucumber"             %% "cucumber-scala"           % "8.6.0"     % Test,
    "io.cucumber"             %  "cucumber-junit"           % "7.5.0"     % Test,
    "io.cucumber"             %  "cucumber-picocontainer"   % "7.5.0",
    "junit"                   %  "junit"                    % "4.13.2"    % Test,
    "com.novocode"            %  "junit-interface"          % "0.11"      % Test,
    "org.apache.commons"      %  "commons-lang3"            % "3.12.0",
    "com.typesafe"            %  "config"                   % "1.4.2"     % Test,
    "com.github.tomakehurst"  %  "wiremock-standalone"      % "2.27.2"    % Test
  )
}