package com.imooc.scala

import java.io.File

/**
  * Created by savypan
  * On 2018/10/3 13:34
  */
object ImplicityAspect extends App {

  implicit def man2superman(man:Man):Superman = new Superman(man.name)
  implicit def file2RichFile(file:File):RichFile = new RichFile(file)
}

class Man(val name:String) {

  def eat(): Unit = {
    println(s"man:[$name] eat...")
  }
}
class Superman(val name:String) {

  def fly(): Unit = {
    println(s"superman:[$name] fly ...")
  }
}


class RichFile(val file:File) {
  def read() = {
    scala.io.Source.fromFile(file.getPath).mkString
  }
}