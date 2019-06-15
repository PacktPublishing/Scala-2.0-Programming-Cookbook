

//string to Int converter that return an option
def string2Int(s:String): Option[Int] = {
  try{
     Some(s.toInt)
} catch {
   case _ : Exception => None 
  }
}

val t1 = string2Int("345") // Some(345)
val t2 = string2Int("scala") // None

//using pattern matching on option values
t1 match {
  case Some(x) => println(s"converted value is $x")
  case None => println("cannot be converted") 
}


//using the getOrElse method.
t1.getOrElse(0)  // 345 
t2.getOrElse(0) // 0 


//manipulating the values using the map function 
t1.map( x => x + 1 ) // Some(346) 
t2.map( x => x + 1 ) // None 
