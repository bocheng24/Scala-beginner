package lectures.part2oop

object OOPBasics extends App {
  val person = new Person("Steph", 26)

  println(person.age)
  println(person.birthYear)

  person.greet("Klay")
  person.greet()

  println(person.getNameAge())
}

class Person(val name: String, val age: Int)  { // Constructor

  val birthYear = 1992

  println("This will run first")

  def greet(name: String): Unit = println(s"${this.name} says hi to $name")

  // overloading, same function name but different function parameters
  def greet(): Unit = println(s"Hi, this is $name")

  def getNameAge() = (name, age)

}
