package com.imooc.scala

import scala.util.Random

/**
  * Created by savypan
  * On 2018/10/3 11:37
  */
object MatchApp extends App {

  val names = Array("Savy", "Akiho", "Cangj")
  val name = names(Random.nextInt(names.length))

  name match {
    case "Savy" => println("hello")
    case "Akiho" => println("bo")
    case "Cangj" => println("Bye")
    case _ => println("I have no idea!")
  }


  judgeGrade("Iani", "D")

  def judgeGrade(name:String, grade:String): Unit = {
    grade match {
      case "A" => println("very good")
      case "B" => println("good")
      case "C" => println("just so so ")
      case _ if (name != "Savy") => println(name + ", need to work hard!")
    }
  }

  greeting(Array("hi", "hili", "lihh"))


  def greeting(array: Array[String]): Unit = {
    array match {
      case Array("Savy") => println("hi Savy")
      case Array(x, y) => println(x +":" + y)
      case Array("hi", _*) => println("Wonderful!!")
      case _ => println("Bye")
    }
  }

  greetingList(List("savypan", "hslfi", "ssss"))

  def greetingList(list: List[String]): Unit = {
    list match {
      case "savypan"::Nil => println("savypan only")
      case x::y::Nil => println("hi" + x + ":" + y)
      case "savypan"::tail => println("hi savypan and other firends")
      case _ => println("hi everyone")
    }
  }

  matchType(876)
  matchType("String")
  matchType(Map("Savy" -> 1, "helo" -> 2))
  matchType(3.2)

  def matchType(obj:Any): Unit = {
    obj match {
      case x:Int => println("Int:" + obj)
      case x:String => println("string")
      case m:Map[_, _] => m.foreach(println)
      case _ => println("other type")
    }
  }


  caseClassMatch(CTO("Savy", "7"))

  def caseClassMatch(person:Per): Unit = {
    person match {
      case CTO(name, floor) => println("CTO name is " + name + ": floor is " + floor)
      case Employee(name, floor) => println("Employee name is " + name + ": floor is " + floor)
      case Other(name) => println("Other name is " + name)
    }
  }


  class Per
  case class CTO(name:String, floor:String) extends Per
  case class Employee(name:String, floor:String) extends Per
  case class Other(name:String) extends Per

  var grades = Map("OK" -> 34, "PK" -> 98)

  def getGrade(name:String): Unit = {

    val grade = grades.get(name)
    grade match {
      case Some(grade) => println("Your grade is " + grade)
      case None => println("Savy I love you")
    }
  }

  getGrade("OKq")
}


