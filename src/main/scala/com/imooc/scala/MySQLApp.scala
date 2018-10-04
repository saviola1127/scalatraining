package com.imooc.scala

import java.sql.{Connection, DriverManager}

/**
  * Created by savypan
  * On 2018/10/3 13:59
  */
object MySQLApp extends {

  def main(args: Array[String]): Unit = {

    //val driver = "com.mysql.jdbc.Driver"
    val url = "jdbc:mysql://localhost:3306/mysql?useSSL=false"
    val username = "root"
    val password = "saviola1127"

    var connection : Connection = null

    try {

      classOf[com.mysql.jdbc.Driver]

      connection = DriverManager.getConnection(url, username, password)
      val statement = connection.createStatement()
      val sql = "select host, user from user"

      val resultSet = statement.executeQuery(sql)

      while (resultSet.next()) {
        val host = resultSet.getString("host")
        val user = resultSet.getString("user")

        println(s"$host, $user")
      }
    }
    catch {
      case e:Exception => println(e.toString)
    } finally {
      if (connection != null) {
        connection.close()
      }
    }

  }

}
