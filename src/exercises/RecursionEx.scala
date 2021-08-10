package exercises

object RecursionEx extends App {

  def strCon(str: String, n: Int): String = {
    def strConHelp(str:String, n: Int, strAcc: String): String = {
      if (n == 1) strAcc
      else strConHelp(str, n - 1, str + strAcc)
    }

    strConHelp(str, n, str)
  }

  def isPrime(n: Int): Boolean = {
    def primeCheck(n: Int, i: Int, acc: Boolean): Boolean = {
      if (i < 2) acc
      else primeCheck(n, i - 1, n % i != 0 && acc)
    }

    primeCheck(n, n - 2, true)
  }

  def fibonacci(n: Int): BigInt = {
    def fibAcc(i: Int, last: Int, nextToLast: Int): BigInt = {
      if (i >= n) last
      else fibAcc(i + 1, last + nextToLast, last)
    }

    if (n <= 2) 1
    else fibAcc(2, 1, 1)

  }

  println(fibonacci(8))
}

