package com.s99

import org.scalatest.FlatSpec

class P01Spec extends FlatSpec {
  "P01" should "lastで空のリストはNoSuchElementExceptionを投げる" in {
    intercept[NoSuchElementException] {
      P01.last(Nil)
    }
  }

  it should "lastで{1}は1を返す" in {
    assert(P01.last(List(1)) == 1)
  }

  it should "lastで{1,2,3}は3を返す" in {
    assert(P01.last(List(1, 2, 3)) == 3)
  }
}
