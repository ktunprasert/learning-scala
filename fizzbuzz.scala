object FB {
  def main (args: Array[String]) = {
    val fb = Array.tabulate(5)(_+1).map { 
      (i) => i match
      case i if i % 15 == 0 => "FizzBuzz"
      case i if i % 5 == 0 => "Buzz"
      case i if i % 3 == 0 => "Fizz"
      case _ => i.toString
    }

    println(fb.mkString("\n"))

    for (i <- 1 to 15) {
      val out = i match {
        case i if i % 15 == 0 => "FizzBuzz"
        case i if i % 5 == 0 => "Buzz"
        case i if i % 3 == 0 => "Fizz"
        case _ => i
      }

      println(s"$i: $out")
    }
  }
}
