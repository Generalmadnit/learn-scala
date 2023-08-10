import scala.util.control.Breaks.break

//object Practise{
//  def main(args: Array[String]): Unit =
//  {
////    var i=0
//    for(i<-1 to 500)
//    {
//      if((0.25*i+0.5*i+1*i)==700)
//        println(("There should be ₹"+i+" coins"))
//    }
//  }
//}
// Basic structure
//object Practise
//{
//  def main(args: Array[String]): Unit =
//  {
//    var g=1
//    var h=29
//    for(g<-1 to 30){
//      for(h<-29 to 1){
//      if((g * 4)+(h * 2)==86)
//        break;
//    }
//    }
//    println("There are ",g," goats, and ",h,"hens")
//  }
//}

//object Practise
//{
//  def main(args: Array[String]):Unit=
//    {
//      var i=0
//      var j=0
//      for( i<-1 to 101 by +2)
//        {
//          for(j<-101 to 1 by -3)
//            {
//              if(i==j)
//                println(i+" is the common window")
//            }
//        }
//    }
//}

//object Practise
//{
//  def main(args: Array[String]):Unit=
//    {
//      var r=0
//      var w=20
//      for(r<-1 to 20)
//        {
//          for(w<- 20 until 1 by -1)
//          {
//            if ((r * 3) + (w * -1) == 40 && r+w==20)
//              println(r,w)
//          }
//        }
//    }
//}

object Practise
{
  def main(args: Array[String]):Unit=
    {
      var i=10
      var bac=13312
      var in=0
      while(i>1)
        {
          in = bac/2
          bac = in
          i -=1
        }
        println(in)
    }
}