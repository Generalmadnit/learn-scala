import scala.io.StdIn.readInt
object Day8
{
  def convertBooleanToStringMessage(bool: Boolean): String = bool match {
    case true => "you said true"
    case false => "you said false"
  }
  def cBTSM():Int =
    {
      return 8
    }
  def main(args: Array[String]):Unit=
  {
    val result = convertBooleanToStringMessage(true)
    println(result)
    println(cBTSM())
    println("Enter your option \n1. Addition \n2. Subtraction \n3. Multiplication")
    val opt = readInt()
    opt match
    {
      case 1 =>
      {
        val a = readInt()
        val b = readInt()
        val sum = a+b
        println(sum)
      }
      case 2 =>
      {
        val a = readInt()
        val b = readInt()
        val dif = a-b
        println(dif)
      }
      case 3 =>
      {
        val a = readInt()
        val b = readInt()
        val mul = a*b
        println(mul)
      }
      case _ =>println("Default case executed")
    }
  }
}