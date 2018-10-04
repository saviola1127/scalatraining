package com.imooc.scala

/**
  * Created by savypan
  * On 2018/10/2 22:56
  */
object ListApp extends App {

  val l = List(1,2,3,4,5)
  print(l.head + "-" + l.tail + "\n")


  val list = 1::Nil
  println(list)

  val lis = 2::list
  println(lis)

  val muList = scala.collection.mutable.ListBuffer[Int]()
  muList += 2

  println(muList)

  println(sum(3,2,3,4))


  def sum(nums:Int*): Int = {
    if (nums.length == 0) {
      0
    } else {
      nums.head + sum(nums.tail:_*)
    }
  }
}
