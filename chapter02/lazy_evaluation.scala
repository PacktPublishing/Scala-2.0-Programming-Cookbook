

//declare a lazy variable 
lazy val name = "delayed variable" //name:String = <lazy>

object Example extends App {
   import scala.util.Random

   def r() = Random.nextInt
   
   def callByValue(x: Int) = {
      println(s"printing x the first time  $x")
      println(s"printing x the second time $x")
      println(s"printing x the third time $x")
      x
    }
   }

object Example2 extends App {
   import scala.util.Random

   def r() = Random.nextInt

   def callByName(x: => Int) = {
      println(s"printing x the first time  $x")
      println(s"printing x the second time $x")
      println(s"printing x the third time $x")
      x
    }
   }
