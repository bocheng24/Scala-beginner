package lectures.part1basics

object Expressions extends App {

  var x = 1 + 2

  println(x)
  println(5 / 2)
  println(5 % 2)
  println(x == 1)
  println(!(x == 1))

  x += 1
  println(x)
  x *= 2
  println(x)

  // Code blocks
  val codeBlock = {
    var x1 = 3

    val result = if(x1 < 5) "Pass" else "Failed"
    println("Result is: " + result)
  }

  val someValue = {
    2 < 3
  }

  val someOtherValue = {
    if (someValue) 239 else 39
    90
  }

  println(someValue)
  println(someOtherValue)
}
