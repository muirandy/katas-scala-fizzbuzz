package com.github.muirandy.katas.scala.fizzbuzz

object ComposedCurried {
  private def fizz (i: Int)(result: String) = if (i % 3 == 0) result + "fizz" else result
  private def buzz (i: Int)(result: String) = if (i % 5 == 0) result + "buzz" else result
  private def other (i: Int)(result: String) = if (result.length == 0) "" + i else result

  def getResult(i: Int): String = {
    val f = fizz(i) _
    val b = buzz(i) _
    val o = other(i) _

    o compose b compose f apply ""
  }
}
