package net.ladstatt.android.basic

/**
  * Demonstrates some features of the scala programming language
  */
object Repl {

  def main(args: Array[String]) {


    val as = Array[String]("a", "b", "c")
    as foreach println

    val l = List[Int](1,2,3)
    println(l.sum)

    val s = Set[Boolean](true,false,true)
    assert(s.size == 2)

    val (a,b) = ("world","hello")
    println(b + " " + a)

    val m = Map("a" -> 1, "b" -> 2)

    println(m("a"))
    println(m.keySet)





  }

}
