val numList = List(1,2)
val strList = List("hi", "hello")

var flatMap_res = strList flatMap { x => numList map {
  y => x*y
}
}
 println(flatMap_res)

var map_res = strList map {
  x => numList flatMap{
    y => x*y
  }
}

println(map_res)

val x = List("abc","cde")
val array_x = x map (e => e.toArray)
println(array_x)


val x = List("abc","cde")
val array2 = x.flatMap[Char](_.toArray)
println(array2)

List("abc", "cde").flatMap(e => wrapCharArray(augmentString(e).toArray))

val x = List("abc,def")
x flatMap ( e => e.split(",") )

val array1d = Array ("1,2,3", "4,5,6", "7,8,9")
val array2d = array1d.map(x => x.split(","))
val flatArray = array1d.flatMap(x => x.split(","))

val name = Seq("Goksel", "Bozkartal")
val result = name.flatMap(_.toUpperCase)
println(result)

val list = List(2, 3, 4)
def f(x:Int) = List(x-1, x, x+1)
val result = list.flatMap(y => f(y))
println(result)





