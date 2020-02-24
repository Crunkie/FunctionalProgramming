package Labs.Week2

object SortFunction {

  def qsort(xs: List[Int]): List[Int] =
    if (xs.isEmpty) xs
    else {
      val lesser = xs.tail.filter(_ <= xs.head)
      val greater = xs.tail.filter(_ > xs.head)
      qsort(lesser) ++ (xs.head :: qsort(greater))
    }

  def qsort2(xs: List[Int]): List[Int] =
    if (xs.isEmpty) xs
    else {
      val pivot = xs(xs.length/2)
      val lesser = xs.filter(_ < pivot)
      val greater = xs.filter(_ > pivot)
      qsort(lesser) ++ (pivot :: qsort(greater))
    }

  def main(args: Array[String]): Unit = {
    var t0 = System.nanoTime()
    var result = qsort(List(1,3,66,55,82,90,23))
    var t1 = System.nanoTime()
    println(s"$result. Took ${t1-t0}ms")
    t0 = System.nanoTime()
    result = qsort2(List(1,3,66,55,82,90,23))
    t1 = System.nanoTime()
    println(s"$result. Took ${t1-t0}ms")

  }

}
