package Labs.Week2

object Fun03 {

  def averageWordLength(words: List[String]): Int = words.flatten.length / words.length

  def main(args: Array[String]): Unit = {

//    val sentence = List("I", "like", "writing", "functional", "programs", "in",  "Scala")
    val sentence = "I like writing functional programs in scala".split("\\s+").toList

    println( averageWordLength( sentence ) )


  }
}