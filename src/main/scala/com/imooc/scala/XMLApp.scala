package com.imooc.scala

import java.io.FileInputStream

import scala.xml.XML

/**
  * Created by savypan
  * On 2018/10/3 14:27
  */
object XMLApp extends App  {

  loadXML()


  def loadXML(): Unit = {
//    val xml = XML.load(this.getClass.getClassLoader.getResource("pom.xml"))
//    println(xml)
    val xml = XML.load(new FileInputStream("/Users/savypan/Downloads/scalatraining/src/main/resources/pom.xml"))
    //println(xml)

    val headerFields = xml \ "dependencies" \ "dependency"
    //println(headerFields)

    for (field <- headerFields) {
      println(field)
    }


//    var fields = xml \\ "field"
//    for (field <- fields) {
//      println(field)
//    }
  }

}
