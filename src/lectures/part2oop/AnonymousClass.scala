package lectures.part2oop

object AnonymousClass extends App {

  abstract class Animal {
    def eat: Unit
  }

  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("FUNNYYYY")
  }

  println(funnyAnimal.getClass)

}
