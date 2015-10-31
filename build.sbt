name := "scelsx"

version := "1.0"

scalaVersion := "2.11.7"

mainClass in assembly := Some("scelsx.Scelsx")

libraryDependencies ++= Seq(
  "org.apache.poi" % "poi" % "3.9",
  "org.apache.poi" % "poi-ooxml" % "3.9"
)

scalacOptions ++= Seq("-unchecked", "-deprecation")