
//using transformation function on a collection. 
def int2Double(x: Int): Double = x.toDouble 
val list = List(1,2,3,4,5)
list.map(int2Double)

//generating nested list due to transformation 
def multiples(x: Int): List[Int] = List(1,2,3).map(_ * x) 
val list = List(2,3,4)
mutliplesOfIntegers = list.map(multiples) 
//mutliplesOfIntegers: List[List[Int]] = List(List(2, 4, 6), List(3, 6, 9), List(4, 8, 12))

//usinge flatten method 
mutliplesOfIntegers.flatten
//res10: List[Int] = List(2, 4, 6, 3, 6, 9, 4, 8, 12)

//using flatMap 
val list = List(2,3,4) 
mutliplesOfIntegers = list.flatMap(multiples)
//res11: List[Int] = List(2, 4, 6, 3, 6, 9, 4, 8, 12)


//Using filter method 
def isEven(x: Int): Boolean = x % 2 == 0 
val list = List(1,2,3,4) 
val evenNumbers = list.filter(isEven)
//evenNumbers: List[Int] = List(2, 4)


//Using reduceLeft method 
def highest(x: Int, y: Int): Int = if(x > y) x else y 
val list = List(1,4,78,2,0,5,8,10)
val highestInList = list.reduceLeft(highest) 
//highestInList: Int = 78


//Using groupBy method 

def isEven(x: Int) = x % 2 == 0
val list = List(1,2,3,4,5,6,7,8,9,10)
val grouped = list.groupBy(isEven)
//grouped: Map[Boolean, List[Int]] = Map(false -> List(1, 3, 5, 7, 9), true -> List(2, 4, 6, 8, 10))


grouped.get(true)
//res12: Option[List[Int]] = Some(List(2, 4, 6, 8, 10))


//Using partition 

val partitionList = list.partition(isEven)
//partitionList: (List[Int], List[Int]) = (List(2, 4, 6, 8, 10), List(1, 3, 5, 7, 9))


partitionList._1
//res26: List[Int] = List(2, 4, 6, 8, 10)


def isEven(x:(String,Int)) = x._2 % 2 == 0
val mapCol: Map[String, Int] = Map("a" -> 1 , "b" -> 2 , "c" -> 3 , "d" -> 4)
val evenNumberMapCol = mapCol.filter(isEven)
//evenNumberMapCol:  Map[String, Int] = Map("b" -> 2, "d" -> 4)

