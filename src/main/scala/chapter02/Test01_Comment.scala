package chapter02

/**
  * author     : ZWH
  * date       : Created in 2022/6/27 11:52
  * function   : 
  * description: 注释
  */
object Test01_Comment {
  // 这是一个单行注释

  /*
  这是一个多行注释
   */

  /**
    * @deprecated 过期
    * @example
    *          a=1,b=2 return 3
    * @param a
    * @param b
    * @return
    *
    * 这是文档注释一般放在类名和方法名之前
    */
  def sum(a: Int, b: Int): Int ={
    a + b
  }

  /**
    *
    * @param args 程序运行时参数
    */
  def main(args: Array[String]): Unit = {
    println(sum(1, 2))
  }
}
