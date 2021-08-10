package lectures.part1basics

object Functions extends App {

  def func(str: String, num: Int): String = {
    str + ' ' + num
  }

  def parameterlessFunc(): Int = 3 * 7

  def recursionFunc(str: String, num: Int): String = {
    if (num == 1) str
    else str + "+" + recursionFunc(str, num - 1)
  }

  def funcWithSideEffects(str: String): Unit = println(str)

  def func2(num: Int): Int = {
    def add(x: Int, y: Int) = x + y

    add(num, num - 1)
  }

  println(func("Hello", 3))
  println(parameterlessFunc())
  println(parameterlessFunc)
  println(recursionFunc("Hello", 3))
  funcWithSideEffects("Hello with side effects")
  println(func2(20))

}
