package com.s99

object P08 {
  def compress(list: List[Any]): List[Any] = list match {
    case Nil => Nil
    case x :: Nil => x :: Nil
    case x1 :: x2 :: xs if (x1 == x2) => compress(x2 :: xs)
    case x :: xs => x :: compress(xs)
  }
}
