//val numList = List(1,2)
//val strList = List("hi", "hello")
//
//strList flatMap { x => numList map {
//  y => x*y
//}
//}

object GfG
{

  // Main method
  def main(args:Array[String])
  {

    // Creating a sequence of strings
    val portal = Seq("Goksel", "Ashyle")

    // Applying flatMap
    val result = portal.flatMap(_.toUpperCase)

    // Displays output
    println(result)

  }
}