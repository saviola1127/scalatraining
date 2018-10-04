package com.imooc.scala

import scala.io.Source

/**
  * Created by savypan
  * On 2018/10/3 13:50
  */
object FileApp {

  def main(args: Array[String]): Unit = {

    val file = Source.fromFile("/Users/savypan/Downloads/scalatraining/src/main/scala/com/imooc/scala/hello.txt")(scala.io.Codec.UTF8)

    def readLine(): Unit = {
      for (line <- file.getLines()) {
        println(line)
      }
    }

    //readLine()

    def readChar(): Unit = {
      for (ele <- file) {
        println(ele)
      }
    }

    //readChar()

    def readNetwork(): Unit = {
      val file = Source.fromURL("http://www.baidu.com")
      for (line <- file.getLines()) {
        println(line)
      }
    }

    readNetwork()
  }
}
