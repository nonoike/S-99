package com.s99

import org.scalatest.FlatSpec

class P05Spec extends FlatSpec {
  "reverse" should "NilはNilを返す" in {
    assert(P05.reverse(Nil) == Nil)
  }

  it should "{1}は{1}を返す" in {
    assert(P05.reverse(List(1)) == List(1))
  }

  it should "{1,2,3}は{3,2,1}を返す" in {
    assert(P05.reverse(List(1, 2, 3)) == List(3, 2, 1))
  }
}
