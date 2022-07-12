package chapter02

import java.io.{File, PrintWriter}

import scala.io.Source

/**
  * author     : ZWH
  * date       : Created in 2022/7/1 10:45
  * function   : 
  * description: 文件的输入输出
  */
object Test06_FileIO {
  def main(args: Array[String]): Unit = {
    //文件输入
    Source.fromFile("src/main/resources/Test06_FileInput").foreach(print)

    //文件输出，依靠JavaIo
    val write = new PrintWriter(new File("src/main/resources/Test06_FileOutput.txt"))
    write.write("This is a test file from javaIO!")
    write.close()
  }
}
