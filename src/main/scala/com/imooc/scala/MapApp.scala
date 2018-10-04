package com.imooc.scala

import scala.collection.mutable
import scala.collection.mutable._

/**
  * Created by savypan
  * On 2018/10/2 23:22
  */
object MapApp extends App {

  self =>

//  val a = Map("PK" -> 19, "Savy" -> 30)
//  println(a("PK"))
//
//  val b = Map("PK" -> 19, "Savy" -> 30, "mamy" -> 82)
//  println(b("PK"))
//  println(b.get("PK"))
//
//  b("list") = 8
//
//  println(b)
//
//  val c = mutable.HashMap()
//  println(c)
//
//
//  println(b.get("Savy").getOrElse(null))
//  println(b.getOrElse("PK", null))
//
//  println(b.getOrElse("listy", 0))
//
//
//  for ((key, value) <- b) {
//    println(key + ":" + value)
//  }
//
//  for (key <- b.keySet) {
//    println(key + ":" + b.getOrElse(key, 0))
//  }
//
//  for (value <- b.values) {
//    println(value)
//  }

  val abc = (1,2,3,4,5)

  for (i <- 0 until  (abc.productArity)) {
    println(abc.productElement(i))
  }

  var host = ("102.1.2.3", 80)
  println(host._1)//host._1
  host._2
}
