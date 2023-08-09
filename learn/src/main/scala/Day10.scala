/*
Anonymous functions
We can write nested objects
objects are like class
Unit means void
there is no need to specify return in anonymous functions*/
import scala.io.StdIn.readInt
object Day10
{
  def main(args:Array[String]):Unit={
    var addy= (x :Int, y :Int)=>{
      println("Welcome")
      x+y
    }
    println("Enter two numbers")
    val a = readInt()
    val b = readInt()
//    println(""+Math.add(15,63))
//    println(""+Math.-(10,5))
    println(""+addy(a,b))
  }
  object Math
  {
    def add(a:Int, b:Int): Int = {
      return a+b
    }
    def -(a:Int,b:Int):Int={
      return a-b
    }
  }
}