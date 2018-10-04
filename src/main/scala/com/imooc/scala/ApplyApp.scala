package com.imooc.scala

/**
  * Created by savypan
  * On 2018/10/2 22:01
  */
object ApplyApp {

  def main(args: Array[String]): Unit = {
//    for ( i <- 1 to 10) {
//      ApplyAppTest.incr()
//    }
//
//    println(ApplyAppTest.count)

    val b = ApplyAppTest()
    b()

//    println("~~~~~~~~~~~~~~~~")
//    val c = new ApplyAppTest()
//    println(c)
//    c()
  }
}

class ApplyAppTest {

  def apply(): Unit = {
    println("enter Class:ApplyAppTest-Apply...")

    new ApplyAppTest
  }
}

object ApplyAppTest {

  println("enter Obj:ApplyAppTest...")

  var count = 0
  def incr(): Unit = {
    count = count + 1
  }

  def apply(): ApplyAppTest = {
    println("enter Obj:ApplyAppTest-Apply...")

    new ApplyAppTest
  }

  println("leave Obj:ApplyAppTest...")
}