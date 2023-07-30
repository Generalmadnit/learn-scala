object Day3{
  def main(args: Array[String]): Unit = {
    val x=20
    var res=""
    if(x==20)
      res="res is 20";
    else{
      res="res is not 20";
    }
    var res2=if(x==20)"X == 20" else "X != 20"
    print(res+"\n"+res2+"\n")

    var res3 = if(x<20)"x < 20" else if(x> 20)"x >20" else "x is 20"
    println(res3)

  }
}