
//working the Futures 
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

val future1:Future[String] = Future {
   "welcome to the future!" 
} 
future1.foreach(println) // welcome to the future!

//using with callback to complete Future
import scala.util.{ Failure, Random, Success } 
val r = Random
val future2 = Future {
   25 + r.nextInt
}

future2.onComplete {
  case Success(result) => println(s"future complete is $result")
  case Failure(error) => println(s"Unexpected error ${error.getMessage}")
}


//using map and flatMap 
def bankBalance(): Future[Double] = {
    val r = Random
    Future(r.nextInt(200) + r.nextDouble) 
}

val bank1 = bankBalance()
val bank2 = bankBalance()
val bank3 = bankBalance()

val total = bank1.map(bal1 => bank2.map(bal2 => bank3.map( bal3 => bal3  + bal2 + bal1)))
//total: Future[Future[Future[Double]]] = Future(<not completed>)

val total2 = bank1.flatMap{bal1 =>
     bank2.flatMap{ bal2 =>
            bank3.map{ bal3 =>
               bal3 + bal2 + bal1
      }
   }
}
//total2: Future[Double] = Future(Success(458.2146769712578))


val total3 =  for {
   bal1 <- bank1
   bal2 <- bank2
   bal3 <- bank3
} yield bal1 + bal2 + bal3
//total3 = Future[Double] = Future(<not completed>)
total3.foreach(println) //458.2146769712578


//using the recover, recoverWith  method with future

Future(5/0) recover {
  case e: ArithmeticException => 0 
}


val f = Future{ Int.MaxValue}
Future(5/0) recoverWith {
  case e: ArithmeticException => f
}




