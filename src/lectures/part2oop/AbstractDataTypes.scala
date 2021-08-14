package lectures.part2oop

object AbstractDataTypes extends App {

  //  Abstract
  abstract class Animal {

    val creatureType: String
    def eat(): Unit

  }

  class Dog extends Animal {
    //  class extends an abstract class should implement all abstract vals and methods
    //  override does not need to be added
    override val creatureType: String = "Dog"
    def eat(): Unit = println("Dogs are eating")
  }

  val dog = new Dog()
  println(dog.creatureType)
  dog.eat()

  trait Carniovre {
    def eat(animal: Animal): Unit
  }

  class Croc extends Animal with Carniovre {
    override val creatureType: String = "Crocs"
    def eat(): Unit = println("Croc's eating")
    def eat(animal: Animal) = println(s"${this.creatureType} is eating with ${animal.creatureType}")
  }

  val croc = new Croc()
  croc.eat(dog)

}
