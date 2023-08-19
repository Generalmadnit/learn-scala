import scala.io.StdIn.readInt

object Day15 {
  def main(args: Array[String]):Unit=
    {
      println("Enter the starting and ending range of numbers")
      var strt = readInt()
      var rng = readInt()
      var cnt = 0
      var pcmt = 0
      for(i <- strt to rng)
      {
        cnt = 0
        for(j <- 1 to i)
          {
//            println(rng%j)
            if(i % j ==0)
              cnt = cnt + 1
          }
          if(cnt==2)
            {
              println(i)
              pcmt = pcmt+1
            }
            println(i)
      }
      println(pcmt," Primes")
    }
}