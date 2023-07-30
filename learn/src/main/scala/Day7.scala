object Day7
{
  def main(ar: Array[String]):Unit=
    {
      val res = for(i <- 1 to 10;if i%2==0)yield i
      println("result is "+res)
    }
}