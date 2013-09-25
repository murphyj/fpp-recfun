package recfun
import common._
import java.util

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(column: Int, row: Int): Int = {

//    def getValueAt(column: Int, row: Int) = {
//      var pyramid = generateRows()
//    }
//
//    def generateRows(pyramid:List[List[Int]]) = {
//      var rowNo = 1
//      if (rowNo < row) generateRow(rowNo + 1, List(), List(1)) else
//    }


//    getValueAt(column, row)
    1
  }

    def generateRow(n: Int, length: Int, currentRow: List[Int], previousRow: List[Int]): List[Int] = {
      println("currentRow: " + currentRow)
      println("n[" + n + "] length[" + length + "] currentRow[" + currentRow + "] previousRow[" + previousRow + "]")
      if (n == length) currentRow else
          val newValue = previousRow(n) + previousRow(n + 1); 1 :: generateRow(n + 1, length, currentRow.::(newValue), previousRow)
    }

  /**
   * Exercise 2
   */
//  def balance(chars: List[Char]): Boolean = ???

  /**
   * Exercise 3
   */
//  def countChange(money: Int, coins: List[Int]): Int = {}
}
