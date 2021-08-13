package lectures.part2oop

object Objects {

  //  static/class-level functionality
  object Person {
    val N_EYES = 2
    def canFly: Boolean = false
  }

  //  instance-level functionality
  //  Companions - object and class share 1 name
  class Person {

  }

  def main(args: Array[String]): Unit = {
    val mary = Person
    val john = Person

    //  object Person instances
    println(mary.N_EYES)
    println(mary.canFly)
    println(mary == john)
  }
}
