import Dependencies.*
import org.typelevel.scalacoptions.ScalacOptions
import sbt.Keys.libraryDependencies

val scalaV = "3.3.3"

val commonSettings = Seq(
  scalaVersion := scalaV,
  organization := "com.test",
  scalacOptions ++= Seq("-no-indent", "-Wunused:nowarn"),
  tpolecatScalacOptions += ScalacOptions.sourceFuture,
  libraryDependencies ++= coreLibraries,
  libraryDependencies ++= testLibraries
)

lazy val root: Project = (project in file("."))
  .settings(
    name                := "test-app",
    Compile / mainClass := Some("com.test.Main"),
    commonSettings,
    run / fork          := true
  )
  .enablePlugins(JavaAppPackaging)