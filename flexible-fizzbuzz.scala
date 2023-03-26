class Hi {
  def flexibleFizzbuzz(callback: String => Unit): Unit = {
    for (i <- 1 to 15)
      if (i % 3 == 0 && i % 5 == 0)
        callback("FizzBuzz")
      else if (i % 3 == 0)
        callback("Fizz")
      else if (i % 5 == 0)
        callback("Buzz")
      else
        callback(i.toString())
  }
}

object App {

  def main (args: Array[String]) = {
    val x = new Hi()
    x.flexibleFizzbuzz{x => println(x)}
    x.flexibleFizzbuzz{x => println(x.reverse)}
  }
}
