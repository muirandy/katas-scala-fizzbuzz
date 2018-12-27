package com.github.muirandy.katas.scala.fizzbuzz

import org.scalatest.{FlatSpec, Matchers}

class FizzBuzzSpec extends FlatSpec with Matchers {

//  private val fizzBuzz = SimpleDeclarative.getResult _
//  private val fizzBuzz = Switch.getResult _
//  private val fizzBuzz = PatternMatching.getResult _
//  private val fizzBuzz = ComposedCurried.getResult _
//  private val fizzBuzz = ComposedCurriedInline.getResult _
  private val fizzBuzz = ComposedCurriedAndThen.getResult _

  it should "Fizz when a number is divisable by 3" in {
    fizzBuzz(3) should be ("fizz")
    fizzBuzz(6) should be ("fizz")
    fizzBuzz(9) should be ("fizz")
    fizzBuzz(12) should be ("fizz")
  }

  it should "Buzz when a number is divisable by 5" in {
    fizzBuzz(5) should be("buzz")
    fizzBuzz(10) should be("buzz")
  }

  it should "FizzBuzz when a number is divisable by 3 and 5" in {
    fizzBuzz(15) should be("fizzbuzz")
  }

  it should "return input when a number is neither divisable by 3 nor 5" in {
    fizzBuzz(1) should be("1")
    fizzBuzz(2) should be("2")
    fizzBuzz(4) should be("4")
    fizzBuzz(7) should be("7")
  }
}
