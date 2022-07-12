package chapter01

/**
  * author: Zwh
  * create: 2022-06-27 10:43
  * version: 1.0
  * desc 用来解释伴生类和伴生对象, 公共成员变量写入伴生对象中
  *      伴生类和伴生对象可以相互访问成员变量
  **/
class Scala02_Student(var name: String, var age: Int) {
  def printMessage(): Unit ={
    println(name + " " + age + " " + Scala02_Student.location)
  }
}

object Scala02_Student{
  val location: String = "双汇"

  def main(args: Array[String]): Unit = {
    val zs = new Scala02_Student("张三", 18)
    val ls = new Scala02_Student("里斯", 20)

    zs.printMessage()
    ls.printMessage()
  }
}
