package Labs.Week1;
import scala.io.StdIn._
object RelationalCharacters {
  def main(args: Array[String]): Unit = {
    println("Enter a number: ")
    var val1: Char = readChar()
    println("Enter a second number: ")
    var val2: Char = readChar()

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
