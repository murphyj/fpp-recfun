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
    if (row != 0 && row != 1) {
      val generatedRow = generateRows(1, row, List(1), List(1,1))
      generatedRow(column)
    } else {
      1
    }
  }

  def generateRows(currentRowNumber: Int, rowNumberToReturn: Int, currentColumns: List[Int], previousRow: List[Int]): List[Int] = {
    if (currentRowNumber < rowNumberToReturn) {
      val nextRow = generateColumns(1, currentRowNumber, currentColumns, previousRow)
      generateRows(currentRowNumber + 1, rowNumberToReturn, List(1), nextRow)
    } else {
      previousRow
    }
  }

    def generateColumns(columnNumber: Int, length: Int, currentRow: List[Int], previousRow: List[Int]): List[Int] = {
      if (columnNumber <= length) {
        generateColumns(columnNumber + 1, length, currentRow ::: List(previousRow(columnNumber - 1) + previousRow(columnNumber)), previousRow)
      } else {
        currentRow ::: List(1)
      }
    }

  /**
   * Exercise 2
   */
//  def balance(chars: List[Char]): Boolean = {
    // loop chars check if you find a left brace
    // store the placement in the string
    // continue loop for matching right brace
    // check if a right brace is found
    // if it isn't store the next left brace
    // if it is found pop the right brace and the left brace using the location
    // if no right brace found after end of

//    val nonMatchingBraceCount = braceMatchIter(chars)
//    if (nonMatchingBraceCount == 0) true else false

//  }
//
//  def braceMatchIter(chars: List[Char]): Int = {
//    val matchCount = 0
//    if (chars.isEmpty) braceMatch(0, 0, 0, matchCount, chars, chars) else matchCount
//  }
//
//  def braceMatch(braceLeftPos: Int, braceRightPos: Int, pos: Int, matchCount: Int, charsRemaining: List[Char], chars: List[Char]): Int = {
//    val nextChar = charsRemaining.head
//    if (nextChar == "(") {
//      braceMatch(pos, -1, pos + 1, matchCount, charsRemaining.tail)
//    } else if (nextChar == ")" && braceFound(braceLeftPos)) {
//
//    }
//
////    else braceMatch(-1, -1, pos + 1, matchCount, charsRemaining.tail)
//
////    braceMatch(braceLeftPos, braceRightPos, pos + 1, matchCount, charsRemaining.tail)
//  }
//
//  def braceFound(pos: Int): Boolean = {
//    pos => 0
//  }

  /**
   * Exercise 3
   */
//  def countChange(money: Int, coins: List[Int]): Int = {}
}
