
/**
  * Finding double of first even number greater than 3
  * using lazy evaluation
  */
object WithLazyEvaluation extends App {

  val numbers = List(1, 2, 3, 5, 4, 6, 7, 8, 9, 10)



  def computeUsingLazyEvaluation(numbers: List[Int]): Int = {
    numbers.view
      .filter(UtilityMethods.findNumberGreaterThan3)
      .filter(UtilityMethods.findEvenNumber)
      .map(UtilityMethods.doubleTheValue)
      .head
  }

  val doubleOfFirstEvenGreaterThan3 = computeUsingLazyEvaluation(numbers)
  println(s"Result : $doubleOfFirstEvenGreaterThan3")

}