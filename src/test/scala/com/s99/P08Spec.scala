package com.s99

import org.scalatest.FlatSpec

class P08Spec extends FlatSpec {
  "compress" should "NilはNilを返す" in {
    assert(P08.compress(Nil) == Nil)
  }

  it should "List('a')はList('a')を返す" in {
    assert(P08.compress(List('a')) == List('a'))
  }

  it should "List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)はList('a, 'b, 'c, 'a, 'd, 'e)を返す" in {
    assert(P08.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List('a, 'b, 'c, 'a, 'd, 'e))
  }

}
