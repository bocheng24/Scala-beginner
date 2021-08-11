package lectures.part1basics

object CBNvsCBV extends App {

  def calledByValue(x: Long): Unit = {
    println("By Value: " + x)
    println("By Value: " + x)
  }

  def calledByName(x: => Long): Unit = {
    println("By Name: " + x)
    println("By Name: " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())
}
