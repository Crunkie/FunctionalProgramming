package Labs.Week2

object Fibonacci {

  def fib(n : BigInt): BigInt = {
    var x = 0
    var y = 1
    var z = 0
    while (z < n) {
      val sum = x + y
      x = y
      y = sum
      z = z + 1
    }
    x
  }

  def fibonacci(x:BigInt):BigInt =
    if(x==0) 0
    else if (x==1) 1
    else fib(0, 1, x-2)

  @scala.annotation.tailrec
  def fib(a:BigInt, b:BigInt, x:BigInt):BigInt =
    if (x == 0) a+b
    else fib(b,a+b,x-1)

  def fib2( n : Int) : Int = {
    @scala.annotation.tailrec
    def fibTail(n: Int, a:Int, b:Int): Int = n match {
      case 0 => a
      case _ => fibTail( n-1, b, a+b )
    }
    fibTail( n, 0, 1)
  }

  def fib3( n : Int) : Int = {
    @scala.annotation.tailrec
    def fib_tail(n: Int, a:Int, b:Int): Int = n match {
      case 0 => a
      case _ => fib_tail( n-1, b, (a+b))
    }
    fib_tail( n, 0, 1)
  }

  def fib4( n : Int) : Int = {
    def fibTail2( n: Int, a:Int, b:Int): Int = n match {
      case 0 => a
      case _ => fibTail2( n-1, b, (a+b))
    }
    fibTail2( n, 0, 1)
  }

  def main(args: Array[String]): Unit = {
    var t0 = System.nanoTime()
    var fib32 = fibonacci(32)
    var t1 = System.nanoTime()
    println(s"Fib(32) = $fib32. Took ${t1-t0}ns")
    t0 = System.nanoTime()
    fib32 = fib(32)
    t1 = System.nanoTime()
    println(s"Fib(32) = $fib32. Took ${t1-t0}ns")





    var t2 = System.nanoTime()
    var fib64 = fib2(32)
    var t3 = System.nanoTime()
    println(s"Fib(64) = $fib64. Took ${t3-t2}ns")
    t2 = System.nanoTime()
    fib64 = fib3(32)
    t3 = System.nanoTime()
    println(s"Fib(64) = $fib64. Took ${t3-t2}ns")


  }
}