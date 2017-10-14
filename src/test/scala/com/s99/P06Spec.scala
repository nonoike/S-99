package com.s99

import org.scalatest.FlatSpec

class P06Spec extends FlatSpec {
  "isPalindrome" should "Nilはtrueを返す" in {
    assert(P06.isPalindrome(Nil) == true)
  }

  it should "{1,2,3,2,1}はtrueを返す" in {
    assert(P06.isPalindrome(List(1, 2, 3, 2, 1)) == true)
  }

  it should "{1,2,3,2}はfalseを返す" in {
    assert(P06.isPalindrome(List(1, 2, 3, 2)) == false)
  }
}
