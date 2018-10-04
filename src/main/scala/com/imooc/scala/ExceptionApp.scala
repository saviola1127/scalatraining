package com.imooc.scala

/**
  * Created by savypan
  * On 2018/10/3 11:58
  */
object ExceptionApp extends App {

  try {
    var i = 10/0
    println(i)
  } catch {
    case e : ArithmeticException => println("by zero is not allowed")
    case e : Exception => println(e.toString)
      println("you need to check your input")
  }

  finally {
    println("release resource")
  }

}
