val from = " from Barcelona"

List("Lionel", "Xavi", "Iniesta").foreach(name => println("Hello " + name + from))
// Hello Lionel from Barcelona
// Hello Xavi from Barcelona
// Hello Iniesta from Barcelona

println(List("Lionel", "Xavi", "Iniesta").map(name => name.toUpperCase))
// List(LIONEL, XAVI, INIESTA)

println(List("Lionel", "Xavi", "Iniesta").map(_.toUpperCase))
// List(LIONEL, XAVI, INIESTA)
