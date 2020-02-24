package Labs.Week1;
import scala.io.StdIn._
object CircleCalc {
  def main(args: Array[String]): Unit = {
    var pi: Double = scala.math.Pi
    print("How big is the radius of your circle?: ")
    var radius: Double = readDouble()
    var circumference: Double = ((pi * radius) * 2)
    print("A circle with the radius of " + radius + " is " + f"$circumference%1.2f" + " in circumference.")
  }
}
