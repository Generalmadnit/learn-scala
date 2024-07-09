import scala.io.StdIn.readInt

object Day17 {
  def main(args: Array[String]):Unit=
    {
      println("Enter the number to find factorial")
      var end = readInt()
      var fact = 15
      for(i <- 1 to end)
      {
        fact = fact * i
      }
      println(fact," is the factorial")
      var r = List[Int](1,9,5,7,6,8,4,3,2)
      println(r)
      println(r.sorted+" sorted list using inbuilt functions")
      println(r)
      r = r.sorted
      for(i <- r)
        {
          println(i)
        }
    }
}