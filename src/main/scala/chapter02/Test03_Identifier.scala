package chapter02

/**
  * author     : ZWH
  * date       : Created in 2022/6/28 11:02
  * function   : 
  * description: 标识符
  */
object Test03_Identifier {
  def main(args: Array[String]): Unit = {
//    （1）以字母和下划线开头，后接数字、字母、下划线。
    val zs123_ = 12
    val _zs = 13
//    val 123_s =14

//    （2）以操作符	开头，且只包含操作符（+ - * / # ! +=等）,一切皆为对象，包括基本运算符
    val -+*/% = 123
    println(-+*/%)
//    （3）可以用反引号	`....`包含任意字符串，即使是Scala关键字。
    val `if` =15
//    val if = 16
    println(`if`)
  }
}
