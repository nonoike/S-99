package com.s99

import org.scalatest.FlatSpec

class P02Spec extends FlatSpec {
  "penultimate" should "空のリストはNoSuchElementExceptionを投げる" in {
    intercept[NoSuchElementException] {
      P02.penultimate(Nil)
    }
  }

  it should "{1}はNoSuchElementExceptionを投げる" in {
    intercept[NoSuchElementException] {
      P02.penultimate(List(1))
    }
  }

  it should "{1,2,3,4}は3を返す" in {
    assert(P02.penultimate(List(1, 2, 3, 4)) == 3)
  }
}
