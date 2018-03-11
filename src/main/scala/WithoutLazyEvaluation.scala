
/**
  * Finding double of first even number greater than 3
  * Comparing imperative style with functional style without using lazy evaluation
  */
object WithoutLazyEvaluation extends App {

  /*def computeImperative(numbers: List[Int]): Int = {
    var result = 0
    for (e <- numbers) {
      if (e > 3 && e % 2 == 0) {
        result = e * 2
        result
      }
    }
    result
  }*/

  val numbers = List(1, 2, 3, 5, 4, 6, 7, 8, 9, 10)

  def computeFunctional(numbers: List[Int]): Int = {
    numbers.filter(UtilityMethods.findNumberGreaterThan3)
      .filter(UtilityMethods.findEvenNumber)
      .map(UtilityMethods.doubleTheValue)
      .head
  }

  val doubleOfFirstEvenGreaterThan3 = computeFunctional(numbers)
  println(s"Result : $doubleOfFirstEvenGreaterThan3")


}
