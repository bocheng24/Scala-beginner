package lectures.collections

object lists extends App {

  //  Create new lists

  val intList = List(2, 4, 6, 8, 10)
  val mixType = List(2, true, "yes", 3.9)
  println(intList)
  println(mixType)

  //  index element of a list
  //  Get 1st element
  val firstElem = intList(0)
  println(firstElem)
  println("=======================================")

  println("Head of a list")
  println(intList.head)

  println("\nList without the 1st elem")
  println(intList.tail)
  println("=======================================")

  println("Nested List")
  val nest_list = List(List(1, 2, 3), List(5, 8))
  println(nest_list)

  println("=======================================")
  println("Tuple pair lists")
  val pair_list = List(("male", 1), ("female", 2), ("unkown", 0))
  println(pair_list)

  println("=======================================")
  //  List function

  //  sort
  val gsw_height = List(2.03, 2.08, 1.91, 1.8, 1.91, 1.98, 1.98, 2.01, 1.96, 2.06, 1.96, 1.91, 1.91, 1.93, 2.03, 1.98, 1.98, 2.01, 2.13)
  println("unsorted gsw player height")
  println(gsw_height)

  println("\nsorted gsw player height")
  println(gsw_height.sorted)

  //  list size

  println("The size of gsw_height")
  println(gsw_height.size)

  println(gsw_height.max)
  println(gsw_height.min)
  println(gsw_height.sum)
  println(gsw_height.product)
  println("=======================================")

  //  Slicing list
  println("Get 2nd to 5th elem of gsw")
  val sub_list = gsw_height slice (1, 6)
  println(sub_list)

  println("Get from 8th elem to the end of gsw")
  println(gsw_height.drop(7))

  println("Get last 2 elems of gsw")
  println(gsw_height.takeRight(2))
}
