def foo(x: Int) = x + 1

println(Array.tabulate(5)(foo(_)).mkString("\n"))
