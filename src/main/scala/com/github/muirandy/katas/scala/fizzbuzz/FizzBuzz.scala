package com.github.muirandy.katas.scala.fizzbuzz

object FizzBuzz {
  def getResult(i: Int): String = {
    i match {
      case x if i % 15 == 0 => "fizzbuzz"
      case x if i % 5 == 0 => "buzz"
      case x if i % 3 == 0 => "fizz"
      case _ => "" + i
    }
  }
}

