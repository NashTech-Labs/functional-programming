
/**
  * result of the evaluation of compute() is now first stored in the variable temp,
  * before the evaluation of the condition in if
  */
object EagerEvaluation extends App {

  def compute(number: Int): Int = {
    //assume this is time consuming
    Thread.sleep(5000)
    number
  }

  val start = System.nanoTime

  val temp = compute(5)

  if (Math.random > 0.5 && temp > 0)
    System.out.println("computed")
  else
    System.out.println("skipped")

  val end = System.nanoTime

  println(s"Time taken in nano seconds: ${end - start}")
}
