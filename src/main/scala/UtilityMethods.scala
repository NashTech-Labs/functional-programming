
/**
  * Commonly used methods
  */
object UtilityMethods {

  def findNumberGreaterThan3(number: Int): Boolean = {
    println("Inside findNumberGreaterThan3")
    number > 3
  }

  def findEvenNumber(number: Int): Boolean = {
    println("Inside findEvenNumber")
    number % 2 == 0
  }

  def doubleTheValue(number: Int): Int = {
    println("Inside doubleTheValue")
    number * 2
  }
}
