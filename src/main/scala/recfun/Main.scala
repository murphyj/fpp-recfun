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
  def balance(chars: List[Char]): Boolean = {
    removeMatchingBraces(filterOutNonBraces(chars))
  }

  def filterOutNonBraces(chars: List[Char]): List[Char] = {
    val allowedChars = List('(',')')
    chars filter allowedChars.contains
  }

  def removeMatchingBraces(remainingChars: List[Char]): Boolean = {
    val diffSizeBefore = remainingChars.size
    val remainingCharsAfterDiff = remainingChars.mkString.replaceAll("\\(\\)", "")
    if (remainingCharsAfterDiff.length == 0) {
      true
    } else if (diffSizeBefore == remainingCharsAfterDiff.length) {
      false
    } else {
      removeMatchingBraces(remainingCharsAfterDiff.toList)
    }
  }

  /**
   * Exercise 3
   */
//  def countChange(money: Int, coins: List[Int]): Int = {}
}
