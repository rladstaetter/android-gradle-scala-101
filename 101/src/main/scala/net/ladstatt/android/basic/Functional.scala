package net.ladstatt.android.basic

/**
  * This is the first assignment for swengb 2015.
  *
  */
case class Functional(lowerBound: Int = 1,
                      upperBound: Int = 1000,
                      factor: Int = 2) {
  require(lowerBound < upperBound)

  /**
    * implement a sequence of ints, which start with lowerBound and end with
    * upperbound.
    *
    * for all elements following is true:
    *
    * xs(i) < xs(i+1)
    * xs(i) + 1 == xs(i + 1) (for i > lowerBound and i <= upperBound)
    *
    */
  val xs: Seq[Int] = lowerBound to upperBound

  /**
    * provide the sum of all elements defined in xs
    */
  val sumXs = xs.sum

  /**
    * This sequence contains a list with the following elements:
    *
    * x(0)   = (upperbound) * factor
    * x(1)   = (upperbound - 1) * factor
    * x(2)   = (upperbound - 2) * factor
    *
    * ... goes on and on ...
    *
    * x(998) = factor
    * x(999) = lowerbound
    *
    */
  def ys: Seq[Int] = xs.map(_ * factor).reverse

  /**
    * this sequence contains pairs of xs and ys. the ys should
    * be in reversed order.
    */
  def zs: Seq[(Int, Int)] = xs zip ys.reverse

  /**
    * Function should divide the second operand with the first.
    * Beware of the division through zero.
    */
  def f(ab: (Int, Int)): Int = if (ab._1 != 0) ab._2 / ab._1 else 0

  /**
    * apply function f defined above to all elements of zs, return the result
    */
  def result: Seq[Int] = zs map f

}
