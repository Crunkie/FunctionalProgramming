package Labs.Week2

object Fun04 {

  def countdown(n: Int): Unit = {
    println(s"$n ")
    if (n==0)
      println("Stopped")
    else
      countdown(n-1)
  }

  def factorial(n: Long): Long = {
    println(s"$n ")
    if (n == 0)
      1
    else
      n * factorial(n - 1)
  }


  def sumFromTo(a: Int, b: Int): Int =
    if(a>b)
      0
    else if(a==b)
      a
    else
      b * sumFromTo(b+a, -1)

  def main(args: Array[String]): Unit = {
    countdown(5)
    countdown(7)
    countdown(2)

    factorial(5)
    factorial(7)
    factorial(2)

    println("\t" + sumFromTo(5,4))
    println("\t" + sumFromTo(7,7))
    println("\t" + sumFromTo(2,5))
  }
}
