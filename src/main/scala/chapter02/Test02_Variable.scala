package chapter02

import chapter01.Scala02_Student

/**
  * author     : ZWH
  * date       : Created in 2022/6/27 17:47
  * function   : 
  * description: 变量
  */
object Test02_Variable {
  def main(args: Array[String]): Unit = {
    // 通用方法
    val a: Int = 10

    // 自动类型推断
    val b = 10
    val c = "String"

    // 声明变量必须有初值
//    var d

    // var和val
    var e = 10
    val f = 11

    e = 12
//  f = 13

    // val修饰的引用类型时，对象不可变，成员变量可变
    val ls = new Scala02_Student("zs", 20)
//    ls = new Scala02_Student("ww", 21)
    ls.age = 21
    ls.printMessage()
  }
}
