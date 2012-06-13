class Person(name: String, city: String, age: Int) {
  def isAdult = age >= 18
}

val messi = new Person("Lionel", "Barcelona", 24)
println(messi.isAdult) // true
