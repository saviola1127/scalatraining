package com.imooc.scala

/**
  * Created by savypan
  * On 2018/10/2 22:20
  */
object ArrayApp extends App {

  //println("test")

  var a = new Array[String](5)
  println(a.length)

  a(1) = "hello"
  println(a(1))

  val b = Array("hadoop", "spark", "storm")
  b(2) = "sql"
  println(b(2))

  var c = Array(1,2,2,2,2,3)
  println(c.sum)

  val cli = c.mkString(",")
  println(cli)

  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  val d = scala.collection.mutable.ArrayBuffer[Int]()
  d += 1
  d += 2
  d += (11,222,33,2)
  d ++= Array(1,22)
  d.insert(4, 888)
  d.remove(7)
  d.remove(1, 2)
  d.trimEnd(2)

  //d.toArray

  for ( i <- (0 until d.length).reverse) {
    println(i)
  }

  print(d.toArray.mkString(","))
}
