package lectures.part1basics

object Recursion extends App {

  //  Not a tail recursion, the method can only calculate and return result for small number
  def smallFactorial(n: Int): Int = {
    if (n <= 1) 1
    else n * smallFactorial(n - 1)
  }

  //  Use tail recursion to  calculate and return result for big number
  def bigFactorial(n: Int): BigInt = {
    def factHelper(num: Int, accum: BigInt): BigInt = {
      if (num == 1) accum
      else factHelper(num - 1, num * accum)
    }

    factHelper(n, 1)
  }

  println(smallFactorial(5))
  println(bigFactorial(2000))
}
