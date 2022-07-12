package chapter02

import scala.io.StdIn

/**
  * author     : ZWH
  * date       : Created in 2022/7/1 10:38
  * function   : 
  * description: 键盘输入
  */
object Test05_StdIn {
  def main(args: Array[String]): Unit = {
//    StdIn
    println("请输入您的姓名：")
    val name: String = StdIn.readLine()

    println("请输入您的年龄：")
    val age: Int = StdIn.readInt()

    println(s"录入成功，姓名：$name，年龄：$age")
  }
}
