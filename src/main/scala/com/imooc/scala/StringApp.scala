package com.imooc.scala

/**
  * Created by savypan
  * On 2018/10/3 12:17
  */
object StringApp extends App {

  val s = "Hello, "
  val name = "PK"
  println(s + name)

  println(s"Hello, $name")

  val team = "AC Milan"
  println(s"Hello $name, welcome to $team")

  val b =
    """
      |this is a multi-line
      |hello
      |world,
      |Savy
    """.stripMargin

  println(b)
}
