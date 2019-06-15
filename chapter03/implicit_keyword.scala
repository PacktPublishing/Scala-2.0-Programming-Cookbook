
//function the takes an implicit parameter

def showTemp(temp: Int)(implicit symbol: String) = {
     temp + " " +  symbol
}

showTemp(50)("F")    // 50F

//create and implicit parameter
implicit val symbol = "F" 

showTemp(56) 

//writing an implicit conversion
object Shop {
       case class Dollar(amount:Double) 
       case class Yuan(amount:Double) 
       case class Item(name:String, price: Yuan)

       implicit def dollarToYuan(d:Dollar): Yuan = Yuan(d.amount * 9.8)
      } 
 

import Shop._
val item1 = Item("beef", Yuan(20))) //
val item2 = Item("bread", Dollar(2.99))  // Item("bread", Yuan(29.302000000000003))


