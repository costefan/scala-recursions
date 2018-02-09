object App {

  def countChange(money: Int, coins: List[Int]): Int = {
    if ((coins.isEmpty) || (money - coins.head < 0)) 0
    else if (money - coins.head == 0) 1
    else countChange(money - coins.head, coins) +
      countChange(money, coins.tail)
  }

  countChange(4, List(1, 2))
  countChange(5, List(1, 2, 3))
  countChange(8, List(1, 2))

}
