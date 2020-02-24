package Labs.Week2

object Fun02 {

  def countDivisors(n: Int):Int = (1 until n).count(n % _ == 0)

  def main(args: Array[String]): Unit = {

    (0 to 9) foreach { i =>
      println(f"$i%3d has ${countDivisors(i)}%3d divisors")
    }


  }
}
