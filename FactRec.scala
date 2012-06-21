import scala.annotation.tailrec

object FactRec {
  @tailrec
  def fact(input: Long, accumulator: Long): Long = {
    if (input == 1) accumulator
    else fact(input - 1, accumulator * input)
  }
}
