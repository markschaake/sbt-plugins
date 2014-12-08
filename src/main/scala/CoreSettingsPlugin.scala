package markschaake.plugins

import sbt._
import sbt.Keys._
import sbt.plugins._

object CoreSettingsPlugin extends AutoPlugin {
  override def requires = FormatPlugin
  override def trigger = allRequirements
  override def projectSettings = Seq(
    scalaVersion := "2.10.4",
    scalacOptions ++= Seq("-target:jvm-1.7", "-Xlint", "-deprecation", "-feature")
  )
}
