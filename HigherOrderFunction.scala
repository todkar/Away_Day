def doIt(func: () => Unit) = func()

doIt(() => println("Hello World!")) // Anonymous function as a parameter - Hello World!

def sayHello() = println("Hello World!")

doIt(sayHello) // Function as a parameter - Hello World!

def bestFootballerInTheWorld(func: String => Unit) = func("Lionel")

bestFootballerInTheWorld(println(_)) // Lionel
