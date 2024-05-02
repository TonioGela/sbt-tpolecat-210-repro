lazy val root: Project = (project in file(".")).settings(
  name                := "test-app",
  scalaVersion := "3.3.3",
  organization := "com.test",
  scalacOptions := Seq("-Wunused:nowarn", "-Wnonunit-statement", "-Werror",
    // From https://gist.github.com/Daenyth/a008964c61b1740974767b833064cc5e
    // Allow using -Wnonunit-statement to find bugs in tests without exploding from scalatest assertions
    "-Wconf:msg=unused value of type org.scalatest.Assertion:s",
    "-Wconf:msg=unused value of type org.scalamock:s"
  ),
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.18" % Test,
)
