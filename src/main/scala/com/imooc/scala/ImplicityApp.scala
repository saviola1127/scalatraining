package com.imooc.scala

import java.io.File
import ImplicityAspect._

/**
  * Created by savypan
  * On 2018/10/3 13:22
  */
object ImplicityApp extends App {

  //define an implicity function

//  var man = new Man("PK")
//  man.eat()
//  man.fly()
//
//  val file = new File("/Users/savypan/Downloads/scalatraining/src/main/scala/com/imooc/scala/hello.txt")
//  var txt = file.read()
//  println(txt)


  def testParam(implicit name:String): Unit = {
    println(name + ":------->")
  }

//  testParam("zhangsan")
//
//  implicit val name = "implicity_name"
//  testParam

  implicit val s1 = "s1"
  //implicit val s2 = "s2"
  testParam
}

