
/**
  * Finding double of first even number greater than 3
  * using functional composition
  */

object PlayingWithNumbersFunctionally extends App {

  val numbers = List(1, 2, 3, 5, 4, 6, 7, 8, 9, 10)

  def computeFunctionally(numbers: List[Int]): Int = {
    numbers
      .filter(UtilityMethods.findNumberGreaterThan3)
      .filter(UtilityMethods.findEvenNumber)
      .map(UtilityMethods.doubleTheValue)
      .head
  }

  val doubleOfFirstEvenGreaterThan3 = computeFunctionally(numbers)
  println(s"Result : $doubleOfFirstEvenGreaterThan3")


}
