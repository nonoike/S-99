package com.s99

import org.scalatest.FlatSpec

class P04Spec extends FlatSpec {
  "length" should "空のリストは0を返す" in {
    assert(P04.length(Nil) == 0)
  }

  it should "{1,2,3}は3を返す" in {
    assert(P04.length(List(1, 2, 3)) == 3)
  }
}
