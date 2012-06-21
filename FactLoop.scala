object FactLoop {
  def fact(input: Long): Long = {
    var inp = input
    var factorial = 1
    while(inp > 0) {
      factorial = factorial * inp
      inp = inp - 1
    }
    factorial
  }
}

