package task2;
import scala.collection.mutable.Stack;

object App {

  def balance(chars: List[Char]): Boolean = {

    @annotation.tailrec
    def balanceIter(charsTail: List[Char], openBraceCount: Int): Boolean =
      if (charsTail.isEmpty) openBraceCount == 0
      else {
        if (charsTail.head == '(') balanceIter(charsTail.tail, openBraceCount+1)
        else if (charsTail.head == ')')
          if (openBraceCount > 0) balanceIter(charsTail.tail, openBraceCount-1) else false
        else balanceIter(charsTail.tail, openBraceCount)
      }

    balanceIter(chars, 0)
  }

  def main(args: Array[String]): Unit = {
    balance(("sd() (())))9(() )(()( 0(0()()()) ) ()(0) 90( )90 (0() 0( ))()" +
      " )()FR))E()C0d0(C)d0v0d()v )()()c0()d( f ) fsdf").toList)
  }
}