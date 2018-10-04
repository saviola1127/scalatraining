package com.imooc.scala

/**
  * Created by savypan
  * On 2018/10/3 13:44
  */
object ImplicityClass extends App {

  println(1.add(3))


  implicit class Calculator(x:Int) {
    def add (a:Int) = a + x
  }


  println("3".xxx(20))

  implicit class Calc(name:String) {
    def xxx(x:Int) = name + x
  }
}

