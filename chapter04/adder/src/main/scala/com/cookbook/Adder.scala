package com.cookbook 

object Adder extends App {
   println("Welcome to Adder Application") 

   def add(x: Int , y: Int ) = x  +  y 

val add1 = add(3,4) 
println(s"we added 3 and 4 to get $add1") 

}
