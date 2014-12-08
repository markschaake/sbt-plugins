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
        "io.spray" %% "spray-routing" % "1.3.2"
      )
    )
  }
}
