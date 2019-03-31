//defining a Car class with some methods 
class Car{
        def startEngine(): Unit = println("engine started")
        def stopEngine(): Unit = println("engine stopped")
     }

//defining a SelfDriving trait
trait SelfDriving{
      def navigationSystem(): Unit = println("navigation system enabled")
      def objectRecognition(): Unit = println("object Recognition enabled")
      }

//defining a CruiseControl and Accessories  trait
trait CruiseControl{
      def startCruiseControl(): Unit = println("cruise control enabled")
      def throttle(): Unit = println("throttling")
     }

trait Accessories{
      def gearIndicator(): Unit = println("show gear light")
      def fogLamp(): Unit = println("enable fog lamp")
     }


//creating a Tesla class which extends SelfDriving and CruiseControl traits 
class Tesla(model: String) extends Car with SelfDriving with CruiseControl{

}


