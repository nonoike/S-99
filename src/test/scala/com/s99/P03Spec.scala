package com.s99

import org.scalatest.FlatSpec

class P03Spec extends FlatSpec {
  "nth" should "(-1,{10,11,12,13})はNoSuchElementExceptionを投げる" in {
    intercept[NoSuchElementException] {
      P03.nth(0, Nil)
    }
  }

  it should "(2,{10,11,12,13})は12を返す" in {
    assert(P03.nth(2, List(10, 11, 12, 13)) == 12)
  }

  it should "(4,{10,11,12,13})はNoSuchElementExceptionを投げる" in {
    intercept[NoSuchElementException] {
      P03.nth(4, List(10, 11, 12, 13))
    }
  }

}
