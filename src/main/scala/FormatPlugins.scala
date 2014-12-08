package markschaake.plugins

import sbt._
import sbt.Keys._
import sbt.plugins._
import com.typesafe.sbt.SbtScalariform._
import scalariform.formatter.preferences._

object FormatPlugin extends AutoPlugin {
  override def requires = JvmPlugin
  override def trigger = allRequirements
  override def projectSettings =
    scalariformSettings ++ Seq(
      ScalariformKeys.preferences := ScalariformKeys.preferences.value
        .setPreference(AlignSingleLineCaseStatements, true)
        .setPreference(DoubleIndentClassDeclaration, true)
    )
}
