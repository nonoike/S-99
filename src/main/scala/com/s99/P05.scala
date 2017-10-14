package com.s99

import scala.annotation.tailrec

object P05 {
  //  def reverse[A](list: List[A]): List[A] = list match {
  //    case Nil => Nil
  //    case x :: xs => reverse(xs) ::: List(x)
  //  }
  def reverse[A](list: List[A]): List[A] = {
    @tailrec
    def loop(results: List[A], currents: List[A]): List[A] = currents match {
      case Nil => results
      case x :: xs => loop(x :: results, xs)
    }

    loop(Nil, list)
  }

}
