package com.s99

import org.scalatest.FlatSpec

class P07Spec extends FlatSpec {
  "flatten" should "NilはNilを返す" in {
    assert(P07.flatten(Nil) == Nil)
  }

  it should "List(List())はNilを返す" in {
    assert(P07.flatten(List(List())) == Nil)
  }

  it should "List(List(1, 1), 2, List(3, List(5, 8)))はList(1, 1, 2, 3, 5, 8)を返す" in {
    assert(P07.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) == List(1, 1, 2, 3, 5, 8))
  }

}
