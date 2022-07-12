package chapter02

/**
  * author     : ZWH
  * date       : Created in 2022/7/1 9:38
  * function   : 
  * description:  测试字符串
  */
object Test04_String {
  def main(args: Array[String]): Unit = {
//    + * % 差值表达式
    val name = "张三"
    val age = 18
    println(name + " " + age)
    println(name * 3)
    printf("%d %s学习\n", age, name)
    println(s"$name $age 在学习")
    val num: Double = 16.2222
    println(f"$num%.2f")

//    三引号
    println(
      s"""
        |Select *
        |From student
        |Where name = $name
         And age > $age
      """.stripMargin)
  }
}
