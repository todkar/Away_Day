def doIt(func: () => Unit) = func()

doIt(() => println("Hello World!")) // Anonymous function as a parameter

def sayHello() = println("Hello World!")

doIt(sayHello) // Function as a parameter
