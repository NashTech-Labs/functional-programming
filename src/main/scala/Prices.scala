
/**
 * Find the total of prices greater than $20, discounted by 10%.
 */
object Prices extends App{

  val prices = List(10,12,15,25,20,18,30,21,48)

  var totalDiscountPrices = 0.0

  for(p <- prices){
    if(p > 20){
      totalDiscountPrices = totalDiscountPrices + p * 0.9
    }
  }

  println(s"total of discounted prices $totalDiscountPrices")

  val totalDiscountPricesUsingFP = prices
    .filter(_ > 20)
    .map(_ * 0.9)
    .sum

  println(s"total of discounted prices using Functional Composition " +
    s"$totalDiscountPricesUsingFP")

}
