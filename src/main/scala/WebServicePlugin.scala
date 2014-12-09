package markschaake.plugins

import sbt._
import sbt.Keys._
import sbt.plugins._
import sbtrelease.ReleasePlugin

object WebServicePlugin extends AutoPlugin {
  override def requires = CoreSettingsPlugin

  override def projectSettings: Seq[Setting[_]] = {
    ReleasePlugin.releaseSettings ++
    Seq(
      resolvers += "spray repo" at "http://repo.spray.io",
      libraryDependencies ++= Seq(
        "com.typesafe.akka" %% "akka-stream-experimental" % "1.0-M1",
        "com.typesafe.akka" % "akka-http-core-experimental" % "1.0-M1"
      )
    )
  }
}
