val lines = scala.io.Source.fromFile("generic_parallel_collection_framework.txt").mkString
val words = lines.split(" ").toList
val chewedUpWords = words.par.map(chewUp(_))

def chewUp(word: String): String = {
  val count = word.length
  var result = ""
  (1 to count*3).foreach { _ => result += math.sqrt(count * math.abs(util.Random.nextLong)) + word }
  result
}
