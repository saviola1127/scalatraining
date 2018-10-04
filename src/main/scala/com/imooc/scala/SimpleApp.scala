package com.imooc.scala

/**
  * Created by savypan
  * On 2018/10/2 18:54
  */
object SimpleApp {
  def main(args: Array[String]): Unit = {

    val person = new Person()
    person.name = "Savy"
    person.age = 30
    println(person.name + ".." + person.age)

    println(person.eat())

    person.watchFootball("Real Madrid")
    person.printInfo()
    println(person.gender)
  }

}


class Person {
  var name:String = _
  var age:Int = 10

  private [scala] val gender = "male"

  def printInfo() = {
    println("gender : " + gender)
  }

  def eat():String = {
    name + " eat..."
  }

  def watchFootball(teamName:String) = {
    println(name + " is watching " + teamName)
  }
}

class User extends Person {

}