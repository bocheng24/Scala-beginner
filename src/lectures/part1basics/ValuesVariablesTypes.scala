package lectures.part1basics

object ValuesVariablesTypes extends App {

  //  Immutable variable

  //  Integers
  val x1: Int = 35
  val x2 = 32

  //  Strings
  val str: String = "Hello"

  //  Boolean
  val bool1: Boolean = true
  val bool2: Boolean = false

  //  Chars
  val cha: Char = 'b'

  //  2 bytes Integer
  val short: Short = 1000

  // 8 bytes Integer
  val long: Long = 892989023489230L

  //  decimals
  val float_pi: Float = 3.14f
  val double_pi: Double = 3.14

  //  Mutable varibles
  var var_x: Int = 5
  var_x = 7

  var var_y = 10
  var_y += 1

  println("x1: " + x1)
  println("x2: " + x2)
  println(str)
  println(bool1)
  println(bool2)
  println(cha)
  println("Var_X: " + var_x)
  println("Var_Y: " + var_y)

}
