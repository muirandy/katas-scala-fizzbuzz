package com.github.muirandy.katas.scala.fizzbuzz

import org.scalatest.{FlatSpec, Matchers}

class FizzBuzzSpec extends FlatSpec with Matchers {

  it should "Fizz when a number is divisable by 3" in {
    FizzBuzz.getResult(3) should be ("fizz")
    FizzBuzz.getResult(6) should be ("fizz")
    FizzBuzz.getResult(9) should be ("fizz")
    FizzBuzz.getResult(12) should be ("fizz")
  }

}
