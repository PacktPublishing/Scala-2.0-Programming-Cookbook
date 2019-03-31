//function to convert strings to Double 
def stringToDouble(text: String): Double = {
  text.toDouble
}

//using try/catch block to convert strings to Double 
def stringToDouble(text: String): Option[Double] = {
   try{
      Some(text.toDouble)
   } catch {
      case error: NumberFormatException => None 
   }
}
