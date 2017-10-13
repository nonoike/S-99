package com.s99

import scala.annotation.tailrec

object P04 {
  //  def length[A](list: List[A]): Int = list match {
  //    case Nil => 0
  //    case _ :: xs => length(xs) + 1
  //  }

  def length[A](list: List[A]): Int = {
    @tailrec
    def loop[A](result: Int, list: List[A]): Int = list match {
      case Nil => result
      case _ :: xs => loop(result + 1, xs)
    }

    loop(0, list)
  }
}
