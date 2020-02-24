package Labs.Week1;
import scala.io.StdIn._
object Relational {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    var val1: Int = readInt()
    print("Enter a second number: ")
    var val2: Int = readInt()

    print(val1 + " < " + val2 + " is ")
    println(val1 < val2)
    print(val1 + " > " + val2 + " is ")
    println(val1 > val2)
    print(val1 + " <= " + val2 + " is ")
    println(val1 <= val2)
    print(val1 + " >= " + val2 + " is ")
    println(val1 >= val2)
    print(val1 + " == " + val2 + " is ")
    println(val1 == val2)
    print(val1 + " != " + val2 + " is ")
    println(val1 != val2)
  }
}
