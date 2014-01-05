name := "barcode-sample"

version := "1.0-SNAPSHOT"


libraryDependencies ++= Seq(
  "barcode" % "barcode_2.10" % "0.1-SNAPSHOT",
  jdbc,
  anorm,
  cache
)     

play.Project.playScalaSettings
