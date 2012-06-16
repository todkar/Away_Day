def doIt(func: () => Unit) = func()

val name = "Lionel"

def sayHello() = println("Hello World!" + name)

doIt(() => println("Hello World!" + name))

doIt(sayHello)
