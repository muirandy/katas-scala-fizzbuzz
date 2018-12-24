package com.github.muirandy.katas.scala.fizzbuzz

import PartialFunction._

object FizzBuzz {

  val fizz = (x: Int) => if (x % 3 == 0) "fizz" else ""
  val buzz = (x: Int) => if (x % 5 == 0) "buzz" else ""
  val nothing = (x: Int) => if (fizz(x).length == 0 && buzz(x).length == 0) x else ""

  def getResult(i: Int): String = {
    i match {
      case x if (i % 15 == 0) => "fizzbuzz"
      case x if (i % 5 == 0) => "buzz"
      case x if (i % 3 == 0) => "fizz"
      case _ => "" + i
    }
  }
}

