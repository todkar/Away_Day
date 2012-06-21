object FactNonTailRec {
  def fact(input: Long): Long = {
    if (input == 1) 1
    else input * fact(input-1)
  }
}
