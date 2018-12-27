package com.github.muirandy.katas.scala.fizzbuzz

object ComposedCurriedInline {
  private def fizz(i: Int)(result: String) = if (i % 3 == 0) result + "fizz" else result
  private def buzz(i: Int)(result: String) = if (i % 5 == 0) result + "buzz" else result
  private def other(i: Int)(result: String) = if (result.length == 0) "" + i else result

  def getResult(i: Int): String = {
    other(i) _ compose buzz(i) _ compose fizz(i) _ apply ""
  }
}
