
/**
  * Short-Circuit Evaluation : concept in which second argument is executed or evaluated
  * only if the first argument does not suffice to determine the value of the expression
  */
object ShortCircuitEvaluation extends App {

  def compute(number: Int) = {
    //assume this is time consuming
    Thread.sleep(5000)
    number
  }

  val start = System.nanoTime

  if(Math.random() > 0.5 && compute(5) > 0)
    System.out.println("computed")
  else
    System.out.println("skipped")

  val end = System.nanoTime

  println(s"Time taken in nano seconds: ${end - start}")

}
