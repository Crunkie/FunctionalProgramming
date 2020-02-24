package Labs.Week2

object Fun01 {
  def incr(x: Int): Int = x+1
  def decr(x: Int): Int = x-1
  def square(x: Int): Int = x * x
  def div3(x: Int): Int = x/3
  def mod3(x: Int): Int = x%3
  def odd(x:Int): Boolean = if(x%2 == 1) return true else return false
  def inv(x: Boolean): Boolean = if(x != x) return true else return false
  def negative(x:Int): Boolean = if(x < 0) return true else return false
  def pal(x:String): Boolean = {
    val len = x.length;
    for(i <- 0 until len/2) {
      if(x(i) != x(len-i-1).toUpper) return false;
    }
    return true;
  }
  def strlen(x:String):Int = {
    var len : Int = x.length()
    return len
  }
  def brackets(x:String): String = {
    return ("[" + x + "]")
  }
  def main(args: Array[String]): Unit = {
//    (-10 to 10) foreach { i =>
//      println(f"i = $i%1d, incr($i%1d) = ${negative(i)}")
//    }

    List("foo","bar","Pip","Shaun","Scrumptious") foreach { i =>
      println(pal(i))
    }

  }
}
