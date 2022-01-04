class Smartphone {

  var number: Int = 26
  var nameofcompany: String = "Apple"

  def Display(): Unit ={

    println("Name of company:" + nameofcompany);
    println("Total number of ..:" + number);

  }

  def Conter(): Unit ={
    var count = number+30
    println("count..:"+ count)
  }

}

class Dog(name:String,  age: Int, color: String) {

  println("My name is:" + name )
  println("I am: " + age + " and my color is :" + color)

}

object Main{

  var obj = new Dog("Ashley",7,"black");

  def main(args: Array[String]): Unit ={
    var ob = new Smartphone();
    ob.Display();
    ob.Conter();

  }
}



