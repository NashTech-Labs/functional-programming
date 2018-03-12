import scala.util.control.Breaks._

object Cities extends App{

  //imperative style of coding
  def findCity(list: List[String], city: String) = {
    var flag = false

    breakable {
      for(l <- list){
        if(l == "Delhi") {
          flag = true
          break
        }
      }
    }
  flag
  }

  val list = List("Delhi", "Haryana", "Mumbai", "Bangalore", "Hyderabad", "Pune")
  println("is City found ? " + findCity(list, "Delhi"))
}
