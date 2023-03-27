class Hi {
  def flexibleFizzbuzz(callback: String => Unit): Unit = {
    for (i <- 1 to 15)
      callback(
        (i % 3, i % 5) match {
          case (0, 0) => "FizzBuzz"
          case (0, _) => "Fizz"
          case (_, 0) => "Buzz"
          case _ => i.toString
        }
      )
  }
}

object App {

  def main (args: Array[String]) = {
    val x = new Hi()
    x.flexibleFizzbuzz{x => println(x)}
    x.flexibleFizzbuzz{x => println(x.reverse)}
  }
}
