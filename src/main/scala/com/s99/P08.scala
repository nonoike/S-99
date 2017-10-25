package com.s99

object P08 {
  def compress(list: List[Any]): List[Any] = list match {
    case Nil => Nil
    case x :: Nil => x :: Nil
    case x :: xs if (x == xs.head) => compress(xs)
    case x :: xs if (x != xs.head) => x :: compress(xs)
  }
}
