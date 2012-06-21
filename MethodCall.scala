object DoIt {
  def sayHello(name: String) = {
    println("Hello " + name) 
  }
}

DoIt.sayHello("Lionel")

DoIt.sayHello { "Lionel" }

DoIt sayHello("Lionel")
