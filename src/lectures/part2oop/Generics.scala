package lectures.part2oop

object Generics extends App {

  // Generic classes are classes which take a type as a parameter.
  // They are particularly useful for collection classes.
  class MyList1[A] {

  }

  trait MyList2[A] {

  }

  class MyMap[Key, Values] {

  }

  val listOfInt = new MyList1[Int]
  val listOfStr = new MyList1[String]

  object MyList1 {
    def empty[A]: MyList1[A] = ???
  }

  val emptyOfMyList = MyList1.empty[Int]

  // variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  //  Yes, list[Cat] extends list[Dog] -- Covariance
  class CovarList[+A]
  val animal: Animal = new Cat
  val animalList: CovarList[Animal] = new CovarList[Cat]

  //  No. List of Cat, Dog, Animal are seperate things
  //  This is call INVARIANCE

  class InvarList[A]
  //  This will cause a problem
  //  val InAnimalList: InvarList[Animal] = new InvarList[Cat]
  val InAnimalList: InvarList[Animal] = new InvarList[Animal]

  //  Contravariance
  class Trainers[-A]
  val trainers: Trainers[Cat] = new Trainers[Animal]

  //  bounded type
  //  A <: Animal mean A is a sub class of Animal
  class Cage[A <: Animal](oneKindOfAnimal: A)
  val dogCage = new Cage(new Dog)

  class Bird
  //  This will be wrong
  //  val birdCage = new Cage(new Bird)

}
