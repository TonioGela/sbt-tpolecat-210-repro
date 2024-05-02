package com.test

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class MainSpec extends AnyFreeSpec with Matchers {
  "unused value warnings" in {
    "3".toInt shouldBe 3
    "4".toInt shouldBe 4
  }
}
