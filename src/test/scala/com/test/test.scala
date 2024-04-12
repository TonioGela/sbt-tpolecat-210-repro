package com.test

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers
import scala.annotation.nowarn

@nowarn("msg=unused value of type org.scalatest.Assertion")
class MainSpec extends AnyFreeSpec with Matchers {
  "unused value warnings" in {
    "3".toInt shouldBe 3
    "4".toInt shouldBe 4
  }
}