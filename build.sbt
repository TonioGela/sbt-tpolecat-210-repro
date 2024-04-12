lazy val root: Project = (project in file(".")).settings(
  name                := "test-app",
  scalaVersion := "3.3.3",
  organization := "com.test",
  scalacOptions := Seq("-Wunused:nowarn", "-Wnonunit-statement", "-Werror"),
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.18" % Test,
)