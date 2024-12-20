resolvers += MavenRepository("HMRC-open-artefacts-maven2", "https://open.artefacts.tax.service.gov.uk/maven2")
resolvers += Resolver.url("HMRC-open-artefacts-ivy", url("https://open.artefacts.tax.service.gov.uk/ivy2"))(Resolver.ivyStylePatterns)

addSbtPlugin("uk.gov.hmrc"   % "sbt-auto-build"  % "3.22.0")
addSbtPlugin("org.scalameta" % "sbt-scalafmt"    % "2.4.6")
addSbtPlugin("uk.gov.hmrc"   % "sbt-test-report" % "1.2.0")