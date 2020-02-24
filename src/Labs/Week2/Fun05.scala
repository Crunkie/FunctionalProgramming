package Labs.Week2

object Fun05 {

  def sumList(xs:List[Int]):Int =
    if(xs.isEmpty) 0
    else xs.head + sumList(xs.tail)

  def prodList(xs:List[Int]):Int =
    if(xs.isEmpty) 1
    else xs.head * sumList(xs.tail)

  def lenList(xs:List[Int]):Int =
    if(xs.isEmpty) 0
    else xs.length

  def allTrue(xs:List[Boolean]):Boolean =
    if(xs.isEmpty) false
    else if(xs.head && xs.tail.forall(xs => xs)) true
    else false

  def anyTrue(xs:List[Boolean]):Boolean =
    if(xs.isEmpty) false
    else if(xs.head || xs.tail.contains(true)) true
    else false

  def main(args: Array[String]): Unit = {
    println(sumList(List()))
    println(sumList(List(1)))
    println(sumList(List(2,4,7,9)))
    println(sumList((1 to 20).toList))

    println(prodList(List()))
    println(prodList(List(1)))
    println(prodList(List(2,4,7,9)))
    println(prodList((1 to 20).toList))

    println(lenList(List()))
    println(lenList(List(1)))
    println(lenList(List(2,4,7,9)))
    println(lenList((1 to 20).toList))

    println(allTrue(List()))
    println(allTrue(List(false)))
    println(allTrue(List(true,false,true)))
    println(allTrue(List(true)))
    println(allTrue(List(true,true,false,false)))
    println(allTrue(List(true,true,true,true)))

    println(anyTrue(List()))
    println(anyTrue(List(false)))
    println(anyTrue(List(true,false,true)))
    println(anyTrue(List(true,true,false)))
    println(anyTrue(List(true,true,false,false)))
    println(anyTrue(List(true,true,true,true)))
  }
}
