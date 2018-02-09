object App {

  def countChange(money: Int, coins: List[Int]): Int = {
    if ((coins.isEmpty) || (money - coins.head < 0)) 0
    else if (money - coins.head == 0) 1
    else countChange(money - coins.head, coins) +
      countChange(money, coins.tail)
  }

  def main(args: Array[String]): Unit = {
    println(countChange(4, List(1, 2)))
  }
}
