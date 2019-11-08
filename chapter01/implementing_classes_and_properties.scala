//defining a Car class 
class Car{
     val make = "Tesla"
     val model = "Roadster"
     def name = make + " " + model
}

//defining a Car class with constructor arguments 
class Car(make: String, model: String){
   val carMake = make
   val carModel = model
   def name = carMake + " " + carModel
}


//defining a Car class with default parameters
class Car(val make: String = "Tesla", val model: String)
