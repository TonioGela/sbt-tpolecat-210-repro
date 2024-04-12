import sbt._

object Dependencies {
  // Core deps
  val catsEffectV     = "3.5.4"
  val catsV           = "2.10.0"

  // Test deps
  val scalaCheckV          = "1.17.0"
  val scalaTestScalacheckV = "3.2.18.0"
  val scalaTestV           = "3.2.18"

  lazy val coreLibraries = Seq(
    "org.typelevel"       %% "cats-core"                % catsV,
    "org.typelevel"       %% "cats-effect"              % catsEffectV // Concurrency and Pure FP
  )

  lazy val testLibraries = Seq(
    "org.scalacheck"    %% "scalacheck"       % scalaCheckV          % Test,
    "org.scalatest"     %% "scalatest"        % scalaTestV           % Test,
    "org.scalatestplus" %% "scalacheck-1-17"  % scalaTestScalacheckV % Test
  )

}
