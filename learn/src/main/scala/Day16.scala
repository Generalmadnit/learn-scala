import scala.io.StdIn.readInt

object Day16 {
  def main(args: Array[String]):Unit=
    {
      println("Enter the number to find factorial")
      var end = readInt()
      var fact = 1
      for(i <- 1 to end)
      {
        fact = fact * i
      }
      println(fact," is the factorial")
    }
}