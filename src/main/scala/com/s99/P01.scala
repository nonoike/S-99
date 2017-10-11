package com.s99

object P01 {
  def last[A](list: List[A]): A = list match {
    case x :: Nil => x
    case _ :: xs => last(xs)
    case _ => throw new NoSuchElementException
  }
}
