//Creating a mutable ArrayBuffer

import scala.collection.mutable

var countries = mutable.ArrayBuffer[String]("Nigeria", "Kenya") //countries: mutable.ArrayBuffer[String] = ArrayBuffer("Nigeria", "Kenya")

countries += "Rwanda" //countries: ArrayBuffer[String] = ArrayBuffer("Nigeria","Kenya","Rwanda")


countries ++= List("Uk", "India") 

countries -= ("Kenya") // countries: ArrayBuffer[String] = ArrayBuffer("Nigeria","Rwanda", "UK", "India")

//Appending and prepending ArrayBuffer 

var array = ArrayBuffer[Int]()
array.append(1,2,3)            //ArrayBuffer(1, 2, 3)
array.prepend(-1, 0)           //ArrayBuffer(-1, 0, 1, 2, 3)
array(3) = 12                  //ArrayBuffer(-1, 0, 1, 12, 3)
array.remove(-1)               //ArrayBuffer(0,1,12,3)
array.prependAll(Seq(-2,-1))   //ArrayBuffer(-2,-1,0,1,12,3)
array.clear                    //ArrayBuffer()


//Using mutable ListBuffer 

import scala.collection.mutable.ListBuffer
var subjects = new ListBuffer[String]("Math", "English")

subjects += "Physics"
subjects += "Chemistry"
subjects ++= ("Geography", "Biology", "Geometry")

subjects -= "English"
subjects --= ("Geometry", "Chemistry")


//Using mutable LinkedHashMap 
import scala.collection.mutable.LinkedHashMap
var ascii = LinkedHashMap('a' -> 97, 'd'-> 100, 'i' -> 105 , 'm' -> 109 ) 
ascii += ('f' -> 102)
ascii ++= ('k' -> 107, 'z' -> 122) 

//Using mutable Sets 
var periodicTable = scala.collection.mutable.Set("Boron", "Calcium", "Gallium")
periodicTable += "Gold"
periodicTable ++= Set("Hydrogen", "Iron")

periodicTable -= "Gallium"
periodictable --= Array("Boron", "Iron")

