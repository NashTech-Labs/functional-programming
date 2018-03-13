
/**
  * Find double of first even number greater than 3
  * using lazy evaluation
  */
object PlayingWithNumbersLazily extends App {

  val numbers = List(1, 2, 3, 5, 4, 6, 7, 8, 9, 10)

  def computeUsingLazyEvaluation(numbers: List[Int]): Int = {
    numbers
      .toStream
      .filter(Utility.findNumberGreaterThan3)
      .filter(Utility.findEvenNumber)
      .map(Utility.doubleTheValue)
      .head
  }

  val doubleOfFirstEvenGreaterThan3 = computeUsingLazyEvaluation(numbers)
  println(s"Result : $doubleOfFirstEvenGreaterThan3")

}
