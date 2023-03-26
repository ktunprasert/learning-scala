class Msg(val id: Int, val parent: Option[Int], val txt: String)

def printMessages(messages: Array[Msg]): Unit = {
  val sorted = messages.sortBy(_.id)

  println(sorted.map({
    (m: Msg) => {
      var _p = m.parent
      var count = 0
      while (_p != None) {
        _p = _p.flatMap(i => sorted.lift(i)) match {
          case Some(v) => v.parent
          case _ => None
         }
         count = count+1
      }
      "\t" * count + s"#${m.id} " + m.txt
    }
  }).mkString("\n"))
}

object App {
  def main (args: Array[String]) = {
    printMessages(Array(
      new Msg(0, None, "Hello"),
      new Msg(1, Some(0), "World"),
      new Msg(2, None, "I am Cow"),
      new Msg(3, Some(2), "Hear me moo"),
      new Msg(4, Some(2), "Here I stand"),
      new Msg(5, Some(2), "I am cow"),
      new Msg(6, Some(5), "Here me moo, moo"),
    ))
  }
}
