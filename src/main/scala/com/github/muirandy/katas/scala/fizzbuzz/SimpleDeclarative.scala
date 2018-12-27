package com.github.muirandy.katas.scala.fizzbuzz

object SimpleDeclarative {
  private val fizz = (x: Int) => if (x % 3 == 0) "fizz" else ""
  private val buzz = (x: Int) => if (x % 5 == 0) "buzz" else ""
  private val nothing = (x: Int) => if (fizz(x).length == 0 && buzz(x).length == 0) x else ""

  def getResult(i: Int): String = {
    fizz(i) + buzz(i) + nothing(i)
  }
}

