object Day12
{
  def main(args: Array[String]):Unit=
    {
      var rng = 100
      var cnt = 0
      for(rng <- 1 to 100)
      {
        cnt = 0
        for(j <- 1 to rng)
          {
//            println(rng%j)
            if(rng % j ==0)
              cnt = cnt + 1
          }
          if(cnt==2)
            println(rng)
      }
    }
}