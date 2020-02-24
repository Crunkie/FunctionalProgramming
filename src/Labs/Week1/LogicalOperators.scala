package Labs.Week1;
import scala.io.StdIn._
object LogicalOperators {
  def main(args: Array[String]): Unit = {
    println("Enter a boolean: ")
    var bool1: Boolean = readBoolean()
    println("Enter a second boolean: ")
    var bool2: Boolean = readBoolean()

    print(bool1 + " && " + bool2 + " is ")
    println(bool1 && bool2)
    print(bool1 + " || " + bool2 + " is ")
    println(bool1 || bool2)
  }
}
