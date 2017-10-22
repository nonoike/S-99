package com.s99

object P07 {
  //  def flatten[A](list: List[A]): List[A] = list match {
  //    case Nil => Nil
  //    case (x: List[A]) :: xs => flatten(x) ::: flatten(xs)
  //    case x :: xs => x :: flatten(xs)
  //  }

  def flatten(list: List[Any]): List[Any] = list flatMap {
    case xs: List[_] => flatten(xs)
    case x => List(x)
  }
}
