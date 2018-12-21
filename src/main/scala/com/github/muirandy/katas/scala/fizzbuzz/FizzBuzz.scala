package com.github.muirandy.katas.scala.fizzbuzz

object FizzBuzz {

  val fizz = (x: Int) => if (x % 3 == 0) "fizz" else ""
  val buzz = (x: Int) => if (x % 5 == 0) "buzz" else ""
  val nothing = (x: Int) => if (fizz(x).length == 0 && buzz(x).length == 0) x else ""

  def getResult(i: Int): String = {
    return fizz(i) + buzz(i) + nothing(i)
  }
}

