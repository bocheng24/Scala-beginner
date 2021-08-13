package lectures.part2oop

object MethodNotations extends App {

  class Person(val name: String, val age: Int = 0, favMovie: String) {

    def likes(movie: String): Boolean = movie == favMovie

    //  Scala method can be named as anything
    def +(friend: Person): String = s"${friend.name} is hanging out with ${this.name}!"
    def +(nickname: String): Person = new Person(s"${name} (${nickname})", age, favMovie)
    //  Unary prefix naming method
    def unary_~ : String = s"Yes, this is ${this.name}"
    def unary_+ : Person = new Person(name, age + 1, favMovie)

    def isAlive: Boolean = true
    def learns(skill: String): String = s"$name is learning $skill"
    def learnScala: String = this.learns("Scala")

    def apply(): String = s"Hi, my name is ${this.name}, my favorite movie is ${this.favMovie}"
    def apply(n: Int): String = s"${this.name} watched ${this.favMovie} $n times"
  }

  var anna = new Person("Anna", favMovie = "Inception")

  println(anna.likes("Inception"))
  // Infix notation(operator notation), only for one parameter method
  println(anna likes "Inception")

  var fanny = new Person("Fanny", favMovie = "Fight Club")

  //  Below 2 syntaxes are the same
  println(anna + fanny)
  println(anna.+(fanny))

  //  unary prefix notation
  val x = -1
  val y = 1.unary_-

  println(s"x: $x, y: $y")

  //  unary prefix only works with - + ~ !
  println(~anna)
  println(anna.unary_~)

  //  Postfix
  println(anna.isAlive)
  println(fanny.isAlive)

  //  Special property: apply
  println(anna.apply())
  println(fanny())  //  Same

  anna = anna + "The Rockstar"
  println(anna.name)
  anna = +anna
  println(anna.age)
  println(anna.learnScala)
  println(anna.apply(3))

}
