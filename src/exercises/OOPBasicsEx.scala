package exercises

import java.time.Year

class Writer(firstName: String, surname: String, val year: Int) {

  def fullName(): String = s"$firstName $surname"

}

class Novel(val name: String, val yearOfRelease: Int, author: Writer) {

  def authorAge(): Int =Year.now.getValue - author.year
  def isWrittenBy(author: Writer): Boolean = author.fullName() == this.author.fullName()
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)

}

class Counter(val num: Int) {

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else new Counter(this.num + n)
  }

  def dec(n: Int): Counter = {
    if (n <= 0) this
    else if (this.num -n <= 0) new Counter(0)
    else new Counter(this.num - n)
  }
}

object OOPBasicsEx extends App {

  val writer = new Writer("Laura", "Dave", 1977)
  println(writer.fullName())

  val writer2 = new Writer("Stephen", "king", 1955)

  var novel = new Novel("THE LAST THING HE TOLD ME", 2020, writer)

  println(novel.authorAge())
  println(novel.isWrittenBy(writer2))

  println(s"${novel.name} is released in ${novel.yearOfRelease}")
  novel = novel.copy(2021)
  println(s"${novel.name} is released in ${novel.yearOfRelease}")

  var counter = new Counter(1)
  println(counter.num)
  counter = counter.inc(7)
  println(counter.num)
  counter = counter.dec(20)
  println(counter.num)
  counter = counter.inc(7)
  println(counter.num)
  counter = counter.dec(2)
  println(counter.num)


}