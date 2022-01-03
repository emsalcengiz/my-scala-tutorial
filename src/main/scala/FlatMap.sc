val numList = List(1,2)
val strList = List("hi", "hello")

strList flatMap { x => numList map {
  y => x*y
}
}


val name = Seq("Goksel", "Bozkartal")
val result = name.flatMap(_.toUpperCase)
println(result)

val list = List(2, 3, 4)

// Defining a function
def f(x:Int) = List(x-1, x, x+1)

// Applying flatMap
val result = list.flatMap(y => f(y))

// Displays output
println(result)


