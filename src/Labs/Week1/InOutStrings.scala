package Labs.Week1;
import scala.io.StdIn._
object InOutStrings {
  def main(args: Array[String]): Unit = {
    var firstName: String = readLine("Enter your first: ")
    var lastName: String = readLine("Enter your last name: ")
    var title: String = readLine("Enter your title: ")
    print("Enter your initials: ")
    var initial: String = readLine()
    print("Enter your house number: ")
    var house_number: Int = readInt()
    var address: String = readLine("Enter your address: ")
    print("Enter your telephone number: ")
    var telephone_number: Long = readLong()
    print("Enter your salary: ")
    var salary: Double = readDouble()

    println("Your name is " + title + " " + firstName + " " + lastName + " and your initials are " + initial)
    println("Your phone number is " + telephone_number + " and you live at " + house_number + " " + address)
    println("You are a wealthy man " + title + " " + lastName + ", you earn £" + salary + " a year")
  }
}
