object Day2{
  def main(args: Array[String]): Unit = {
    val name="Nitin"
    val rno=63
    println("Welcome "+name+" your rno is:"+rno)
    println(s"Welcome $name your rno is $rno")
    println(f"Welcome $name%s your rno is $rno%d")
    println(s"Hello \nWorld")
    //difference between s and rawDay2$
    println(raw"Hello \nWorld")
  }
}