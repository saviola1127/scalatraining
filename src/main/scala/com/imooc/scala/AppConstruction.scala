package com.imooc.scala

/**
  * Created by savypan
  * On 2018/10/2 19:08
  */
object AppConstruction {
  def main(args: Array[String]): Unit = {

//    val person = new Person1("Savy", 37)
//    println(person.name + ":" + person.age + ":" + person.school)
//
//    val person2 = new Person1("Sli", 19, "Male")
//    println(person2.name + ":" + person2.age + ":" + person2.gender)

    val student = new Student("Sly", 10, "Math")
    println(student.name + ":" + student.age + ":" + student.major + ":" + student.school)
    println(student.toString)

    val newStu = new Person2Impl()
    println(newStu.toString)
  }
}

class Person1(val name:String, val age:Int) {

  println("Person1 enter...")

  val school = "ustc"
  var gender:String = _

  def this(name:String, age:Int, gender:String) {
    this(name, age)
    this.gender = gender
  }

  println("Person1 left...")
}

class Student(name:String, age:Int, var major:String) extends Person1(name, age) {

  println("Student enter...")

  override val school: String = "Peking"

  override def toString: String = {
    "Savy is testing!!" + school
  }
  println("Student left...")
}

abstract class Person2 {
  def speak
  val name:String
  val age:Int
}

class Person2Impl extends Person2 {
  override def speak: Unit = {
    println("practise person2")
  }

  override val name: String = "PK"
  override val age: Int = 1
}