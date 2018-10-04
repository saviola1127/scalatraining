package com.imooc.scala

import org.apache.spark

/**
  * Created by savypan
  * On 2018/10/3 12:22
  */
object FunctionApp extends App {

//  def sayHellos(name:String): Unit ={
//    println("hi:" + name)
//  }
//
//  sayHellos("OK")
//
//
//  val m1 = (x:Int) => x + 1
//  println(m1(19))
//
//  def add = (x:Int, y:Int) => x + y
//  println(add(10, 20))
//
//  def sum(a:Int, b:Int) = b + a
//  println(sum(10, 2))
//
//  def sum2(a:Int)(b:Int) = a + b
//  println(sum2(2)(3))


  var file = scala.io.Source.fromFile("/Users/savypan/Downloads/scalatraining/src/main/scala/com/imooc/scala/hello.txt").mkString
  println(file)

  var list = List(file)

  list.flatMap(_.split(",")).map(x => (x, 1))//.reduce(_+_)
  .foreach(println)

  println("~~~~~~~~~~~~~~~~~~~~~~~~~~")


//  var f = List(List(1,2), List(3,4), List(5,6))
//  f.flatten.foreach(println)
//  f.map(_.map(_*2)).foreach(println)
//
//  f.flatMap(_.map(_*2)).foreach(println)
//
//  println("~~~~~~~~~~~~~~~~~~~~~~~~")
//
//  var list = List(21,12,32,41,5,36)
//  var s = list.reduce(_+_)
//  //map
//  println(s)
//  println(list.max)
//
//  list.map((x:Int) => x + 1).map(x=> x*x).map(_ + 1).foreach(println)
//  //println(list)
//
//  list.filter(_ > 8).foreach(println)
}
