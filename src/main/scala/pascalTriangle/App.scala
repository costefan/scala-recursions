package task1;

object App {

  def pascal(c: Int, r: Int): Int =
    if ((c <= 0) || (r <= 0) || (c == r)) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)

  def main(args: Array[String]): Unit = {
    println(pascal(0, 3))
    println(pascal(1, 2))
    println(pascal(2, 2))
    println(pascal(1, 4))
  }
}