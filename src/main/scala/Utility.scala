
/**
  * Commonly used methods
  */
object Utility {

  def findNumberGreaterThan3(number: Int): Boolean = {
    println(s"Inside findNumberGreaterThan3 with number $number")
    number > 3
  }

  def findEvenNumber(number: Int): Boolean = {
    println(s"Inside findEvenNumber with number $number")
    number % 2 == 0
  }

  def doubleTheValue(number: Int): Int = {
    println(s"Inside doubleTheValue with number $number")
    number * 2
  }
}
