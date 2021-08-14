package exercises

abstract class MyList {

  def head(): Int
  def tail(): MyList
  def isEmpty(): Boolean
  def add(el: Int): MyList
  def printElement: String

}

object Empty extends MyList {
  def head(): Int = throw new NoSuchElementException
  def tail(): MyList = throw new NoSuchElementException
  def isEmpty(): Boolean = true
  def add(el: Int): MyList = new Cons(el, this)
  def printElement: String = ""
  override def toString: String = "[]"

}

class Cons(h: Int, t: MyList) extends MyList {
  def head(): Int = h
  def tail(): MyList = t
  def isEmpty(): Boolean = false
  def add(el: Int): MyList = new Cons(el, this)
  def printElement: String = {
    if (t.isEmpty()) "" + h
    else h + " " + t.printElement
  }
  override def toString: String = "[" + printElement + "]"
}

object MyListTest extends App {
  var list = new Cons(1, Empty)
  list = new Cons(2, list)
  println(list.head())
  println(list.tail())

  println(list.add(3).head())
  print(list.toString)

}