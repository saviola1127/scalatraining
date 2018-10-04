package com.imooc.scala

/**
  * Created by savypan
  * On 2018/10/2 00:31
  */
object HelloWorld {

  def main(args: Array[String]): Unit = {
//    println("Hello World")
//
//    println(add(5, 7));
//
//    println(three())
//    println(five)
//
//    sayHello("Savy")
//
//    println(speed(sev = 10, dis = 100))

    println(sum(1,2,3,4,5))

    println(Range(1, 10, 1))

    for (i <- 1 to 12 if i%2==0) {
      println(i)
    }

    val courses = Array("a", "b", "c")
//    for (course <- courses) {
//      println(course)
//    }

    courses.foreach(a => {
      println(a)
    })
  }


  def add(x:Int, y:Int):Int = {
    x+y
  }

  def three() = { 3 + 2 }
  def five() = 2 + 2

  def sayHello(name:String = "zhangsan") = {
    println("hello, " + name)
  }

  def speed(dis:Int, sev:Int) = {
    dis/sev
  }

  def sum(numbers:Int*): Int = {
    var ret = 0

    for (number <- numbers) {
      ret += number
    }

    ret
  }
}
