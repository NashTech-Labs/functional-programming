
/**
  * Finding double of first even number greater than 3
  * using functional composition
  */

object PlayingWithNumbersFunctionally extends App {

  val numbers = List(1, 2, 3, 5, 4, 6, 7, 8, 9, 10)

  def computeFunctionally(numbers: List[Int]): Int = {
    numbers
      .filter(Utility.findNumberGreaterThan3)
      .filter(Utility.findEvenNumber)
      .map(Utility.doubleTheValue)
      .head
  }

  val doubleOfFirstEvenGreaterThan3 = computeFunctionally(numbers)
  println(s"Result : $doubleOfFirstEvenGreaterThan3")


}
