package com.s99

import org.scalatest.FlatSpec

class P01Spec extends FlatSpec {
  "last" should "空のリストはNoSuchElementExceptionを投げる" in {
    intercept[NoSuchElementException] {
      P01.last(Nil)
    }
  }

  it should "{1}は1を返す" in {
    assert(P01.last(List(1)) == 1)
  }

  it should "{1,2,3}は3を返す" in {
    assert(P01.last(List(1, 2, 3)) == 3)
  }
}
