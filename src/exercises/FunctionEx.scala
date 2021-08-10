package exercises

object FunctionEx extends App {

  def greeting(name: String, age: Int): Unit = println("Hi my name is " + name + "and I am " + age + " years old!")

  def factorial(n: Int): Int = {
    if (n < 2) 1
    else n * factorial(n - 1)
  }

  def fibonacci(n: Int): Int = {
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  greeting("Judy", 5)
  println(factorial(4))
  println(fibonacci(4))
}
