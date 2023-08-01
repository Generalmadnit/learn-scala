class Lilist[T]()
{
  var head:Node[T] = null
  def push(data:T): Unit = {
    head match
    {
      case null => { head = new Node(data,null) }
      case _ =>
      {
        var last:Node[T] = head
        while(last.next!=null)
        {
          last = last.next
        }
        last.next = new Node[T] (data,null)
      }
    }
  }

  def print(): Unit =
  {
    if(head==null)
      {
        return 0
      }
    while(head.next!=null)
    {
      println(head.data)
    }
  }
}
object Run
{
  def main(args: Array[String]):Unit=
  {
    var l:Lilist[Int] = new Lilist[Int]
    l.push(1)
    l.push(2)
    l.push(3)
    print(l.print())
  }
}