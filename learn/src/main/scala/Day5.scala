object Day5 {
  def main(args: Array[String]):Unit=
  {
    for(i <- 0 to 10)
    {
      println(i+" using to")
    }
    println()
    for(i <- 0 until 10)
      println(i+" using until")
    println()
    for(i <- 0 to 10)
      {
        for(j<-0 to 10)
          {
            println(s"i values is $i and j value is $j")
          }
      }
      println()
    for(i<-1 to 10;j<-1 to 4)
      {
        println(s" i value is $i and j value is $j")
      }
  }
}
