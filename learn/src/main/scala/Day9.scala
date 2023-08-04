object Day9{
  def add(x: Int, y: Int):Int={
    return x+y
  }

  def sub(x: Int, y: Int): Int = {
    return y - x
  }

  def mul(x: Int, y: Int): Int = {
    return x * y
  }

  def div(x: Int, y: Int): Int = {
    return y / x
  }
  def ssum(x:Int):Int={
    var rem = 0
    var sum=0
    var dup = x
    while(dup>0){
      rem = dup%10
      sum = sum+rem
      dup = dup/10
    }
    return sum
  }
  def main(args: Array[String]): Unit = {
    println(add(15,63))
    println(sub(15, 63))
    println(mul(15, 63))
    println(div(15, 63))

    println(add(19, 63))
    println(sub(19, 63))
    println(mul(19, 63))
    println(div(19, 63))

    var a = add(15,63)+sub(15, 63)+mul(15, 63)+div(15, 63)+add(19, 63)+sub(19, 63)+mul(19, 63)+div(19, 63)
    while(a>9){
      a = ssum(a)
    }
    println(a)
  }
}