def function(another_func: () => Unit) = {
  another_func()
}

def another_func() = println("Hello World!")

function(another_func)

def function1(another_func: => Unit) = {
  another_func
}

// function1(println("Hello World!"))
function1 { println("Hello World!") }


def function2(func: Int => Unit) = {
  for(i <- 1 to 3) func(i)
}

def helloNumber(i: Int) = {
  println("Hello " + i )
}

function2(helloNumber)

