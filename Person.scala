class Person(val name: String, val city: String, val age: Int) {
  def isAdult = age >= 18
}

val messi = new Person("Lionel", "Barcelona", 24)
println(messi.isAdult) // true
println(messi.name) // Lionel

messi.name = "Leo" // compile error: reassignment to val
