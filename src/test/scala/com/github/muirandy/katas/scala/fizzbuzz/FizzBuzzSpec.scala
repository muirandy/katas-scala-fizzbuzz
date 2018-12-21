package com.github.muirandy.katas.scala.fizzbuzz

import org.scalatest.{FlatSpec, Matchers}

class FizzBuzzSpec extends FlatSpec with Matchers {

  it should "Fizz when a number is divisable by 3" in {
    FizzBuzz.getResult(3) should be ("fizz")
    FizzBuzz.getResult(6) should be ("fizz")
    FizzBuzz.getResult(9) should be ("fizz")
    FizzBuzz.getResult(12) should be ("fizz")
  }

  it should "Buzz when a number is divisable by 5" in {
    FizzBuzz.getResult(5) should be("buzz")
    FizzBuzz.getResult(10) should be("buzz")
  }

  it should "FizzBuzz when a number is divisable by 3 and 5" in {
    FizzBuzz.getResult(15) should be("fizzbuzz")
  }

  it should "return input when a number is neither divisable by 3 nor 5" in {
    FizzBuzz.getResult(1) should be("1")
    FizzBuzz.getResult(2) should be("2")
    FizzBuzz.getResult(4) should be("4")
    FizzBuzz.getResult(7) should be("7")
  }
}
