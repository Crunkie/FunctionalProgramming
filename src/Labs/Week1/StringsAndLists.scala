package Labs.Week1;

object StringsAndLists {
  def main(args: Array[String]): Unit = {
    var s1: List[String] = List("Mary", "had", "a", "little", "lamb")
    for(a <- s1){
      print(a.toUpperCase().head + "\t")
    }

  }
}
