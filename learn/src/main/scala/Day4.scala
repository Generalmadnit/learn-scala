object Day4{
  def main(args: Array[String]): Unit = {
    var x=0
    while(x<10){
      println("x= "+x)
      x+=1
    }

    print("\n")

    var y=0
    do {
      println("y value is "+y)
      y += 1
    }while(y<10)

    print("\n")

    for(i<-0 to 10)
      {
        println("i value is "+i)
      }
  }
}