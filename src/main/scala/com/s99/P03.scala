package com.s99

object P03 {
  //  def nth[A](n: Int, list: List[A]): A = list match {
  //    case x :: _ if (n == 0) => x
  //    case _ :: xs if (1 <= n) => nth(n - 1, xs)
  //    case _ => throw new NoSuchElementException
  //  }

  def nth[A](n: Int, list: List[A]): A = (n, list) match {
    case (0, x :: _) => x
    case (n, _ :: xs) => nth(n - 1, xs)
    case _ => throw new NoSuchElementException
  }

}
