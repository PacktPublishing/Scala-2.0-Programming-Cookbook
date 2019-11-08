
//defining a function with multiple parameter list
def addNumbers(x:Int)(y:Int) = x + y 

addNumbers(4)(5)

val addedX = addNumbers(4) _ 

addedX(5) 

def processList(list: List[Int])(f: Int => Int)  = list.map(f)

val listAdded = processList(List(1,2,3,4,5)) _

listAdded( x => x * 2 ) //List(2, 4, 6, 8, 10)
listAdded( x => x % 2 ) //List(1, 0, 1, 0, 1)
