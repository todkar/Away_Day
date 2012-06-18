def doIt(func: () => Unit) = func()

doIt(() => println("Hello World!")) // Anonymous function as a parameter

def sayHello() = println("Hello World!")

doIt(sayHello) // Function as a parameter

def bestFootballerInTheWorld(func: String => Unit) = func("Lionel")

bestFootballerInTheWorld(println(_))
