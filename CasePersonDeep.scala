case class Person(name: String, city: String, age: Int, manager: Person) {
  def isAdult = age >= 18
}
var pep = new Person("Pep", "Barcelona", 50, null)
val messi = new Person("Lionel", "Barcelona", 24, pep)

val messiCopy = messi.copy(city = "Rosario")
pep = null
println(messiCopy.manager) // Person(Lionel,Rosario,24)
println(pep) // null

