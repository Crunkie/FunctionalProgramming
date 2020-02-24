package Labs.Week2
import scala.io.StdIn._
object FibonacciSequence {

  def fibonacci(x:BigInt):BigInt=
    if(x==0) 0
    else if (x==1) 1
    else fib(0, 1, x-2)

  @scala.annotation.tailrec
  def fib(a:BigInt, b:BigInt, x:BigInt):BigInt =
    if (x == 0) a+b
    else fib(b,a+b,x-1)

  def main(args: Array[String]): Unit = {
    println("What position in the fibonacci sequence would you like to see: " )
    val x = readInt()
    println("The number of that position in the fibonacci sequence is " + fibonacci(x))
  }
}
