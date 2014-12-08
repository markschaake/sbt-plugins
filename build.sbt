import bintray.{ Keys => BintrayKeys }

organization := "markschaake"
name := "markschaake-sbt-plugins"
scalaVersion := "2.10.4"
sbtPlugin := true
scalacOptions ++= Seq("-target:jvm-1.7", "-Xlint", "-deprecation", "-feature")

resolvers += "spray repo" at "http://repo.spray.io"

publishMavenStyle := false
licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html"))

releaseSettings
bintrayPublishSettings

BintrayKeys.repository in BintrayKeys.bintray := "sbt-plugins"
BintrayKeys.bintrayOrganization in BintrayKeys.bintray := Some("marks")

addSbtPlugin("com.gilt" % "sbt-dependency-graph-sugar" % "0.7.4")
addSbtPlugin("io.spray" % "sbt-revolver" % "0.7.2")
addSbtPlugin("com.danieltrinh" % "sbt-scalariform" % "1.3.0")
addSbtPlugin("com.github.gseitz" % "sbt-release" % "0.8.5")
