ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.14"

lazy val root = (project in file("."))
  .settings(
    name := "CS474-HW1"
  )

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.16" % Test
)