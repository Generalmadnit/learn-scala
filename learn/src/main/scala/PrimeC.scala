import scala.Console.println
import scala.io.StdIn.readInt

object PrimeC {
  def main(args: Array[String]):Unit={
    println("Enter the starting and ending range of primes to be calculated")
    val var1 = readInt()
    val var2 = readInt()
    val l =List(2,3,5,7,11,13,17)
    for(i <- var1 to var2){
      var fl = 0
      for(j <- l){
        if(i%j==0)
          fl = 1
      }
      if(fl==0)
        println(i)
    }
  }
}
