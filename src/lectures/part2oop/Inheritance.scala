package lectures.part2oop

object Inheritance extends App {

  class Animal {
    //  Inherit value/method by default
    val creatureType: String = "Wild"
    def eat():Unit = println("nomnomnom")

    //  Not inherited
    private def jump(): Unit = println("Jump")

    //  Inherit for class, not for child class instance
    protected def sleep(): Unit = println("Zzzzz...")

    //  Preventing override
    //  Use final keyword in front of a method or class
    final def canFly(): Boolean = false
  }

  class Cat extends Animal {

    def goToSleep(): Unit = {
      println("Go To sleep method calls")
      println("Go....")
      sleep()
    }

  }

  val cat = new Cat()
  println(cat.creatureType)
  cat.eat()
  cat.goToSleep()

  //  Constructors
  class Person(name: String, age: Int)
  class Adult(name: String, age: Int, idCard: String) extends Person(name, age)

  //  Method overriding
  class Dog extends Animal {
    override val creatureType: String = "Type: Dog"

    override def eat(): Unit = println("crunchcrunch")

    override def sleep(): Unit = {
      println("It's a Dog")
      println("Hhhhhh......")
    }

    def woof(): Unit = println("Woofwoof")
  }

  val dog = new Dog()
  println(dog.creatureType)
  dog.sleep()

  //  Another value overriding
  class Duck(override val creatureType: String) extends Animal
  val duck = new Duck("Duck overriding")
  println(duck.creatureType)

  //  Type Substitution - broad polymorphism
  val puppy: Animal = new Dog()
  println(puppy.creatureType)

  //  Use Dog class eat() method
  puppy.eat()

  //  Seal class
  sealed class Product(name: String) {
    val productType: String = "Product Type"
  }

  //  Sealed class can be only inherit in the same file
  class Table(name: String) extends Product(name) {
    override val productType = "Furniture"
  }

  val product = new Product("My Product")
  val table = new Table("Table")
  println(product.productType)
  println(table.productType)


}
