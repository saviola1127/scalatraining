package com.imooc.scala

import scala.util.Random

/**
  * Created by savypan
  * On 2018/10/3 13:05
  */
object PartitionFunctionApp extends App {

//  val names = Array("Savy", "Akiho", "Cangj")
//  val name = names(Random.nextInt(names.length))
//
//  name match {
//    case "Savy" => println("hello")
//    case "Akiho" => println("bo")
//    case "Cangj" => println("Bye")
//    case _ => println("I have no idea!")
//  }

  println(sayChinese("Savy"))

  //A是输入，B是输出参数类型
  def sayChinese:PartialFunction[String, String] = {

    case "Savy" => ("hello")
    case "Akiho" => ("bo")
    case "Cangj" => ("Bye")
    case _ => ("I have no idea!")
  }
}
