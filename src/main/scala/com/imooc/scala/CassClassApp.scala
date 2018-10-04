package com.imooc.scala

/**
  * Created by savypan
  * On 2018/10/2 22:15
  */
object CassClassApp {
  def main(args: Array[String]): Unit = {

    println(Dog("wangcai").name)
  }
}

case class Dog(name:String)
