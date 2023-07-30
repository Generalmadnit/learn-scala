import scala.io.StdIn.readInt
import scala.io.StdIn.readLine
object Day6
{
  def main(args: Array[String]):Unit=
  {
    println("Enter name")
    val name = readLine()
    println("Enter age")
    val age = readInt()
    if(age<18)
    {
      println(name+" you are not eligible to apply for voting as your age is "+age)
    }
    else
    {
        println(name+" Welcome! to voters club")
    }
  }
}