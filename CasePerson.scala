case class Person(name: String, city: String, age: Int) {
  def isAdult = age >= 18
}

val messi = new Person("Lionel", "Barcelona", 24)
val messiClone = new Person("Lionel", "Barcelona", 24)
println(messi == messiClone) // true
println(messi.name) // Lionel
println(messi.toString) // Person(Lionel,Barcelona,24)

val messiCopy = messi.copy(city = "Rosario")
println(messiCopy) // Person(Lionel,Rosario,24)
