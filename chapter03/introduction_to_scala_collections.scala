
//creating a List using different methods.
val list1 = List(1,2,3,4,5) 

val list2 = 1 :: 2 :: 3 :: 4 :: 5 :: Nil

val list3 = List.range(1, 6)

val list4 = List.fill(5)("bar")

list1.head // 1 
list1.tail // List(2,3,4,5)

list1.headOption //Some(1)

list4.foreach(println) // this should print bar five(5) times 


//Creating immutable Maps 
val map1 = Map(1 -> "one", 2 -> "two", 3 -> "three")

val map2 = Map(("D", "Dollar"), ("Y", "Yuan"))

map1.head //res5: (Int, String) = (1, "one")

map1.foreach( x => println(s" the key is ${x._1} and the value is ${x._2}") 

// the key is 1 and the value is one
// the key is 2 and the value is two
// the key is 3 and the value is three

//Using  SortedMap

import scala.collection.SortedMap 

val percentagePopulation = SortedMap("China" -> 18.42, "India" -> 17.7, "Nigeria" -> 3.67, "Bahamas" -> 0.95)

//percentagePopulation: SortedMap[String, Double] = Map(
//  "Bahamas" -> 0.95,
//  "China" -> 18.42,
//  "India" -> 17.7,
//  "Nigeria" -> 3.67
//  )



//Using Set collections
val set1 = Set(1,2,3,4,1,4)

val set2 = set1 + 5 // set2: Set[Int] = Set(5, 1, 2, 3, 4)
val set3 = set2 + (8,9) // set3: Set[Int] = Set(5, 1, 9, 2, 3, 8, 4)

val set4 = set3 - 1  // set4: Set[Int] = Set(5, 9, 2, 3, 8, 4)
val set5 = set4 - Set(8,9)  // set5: Set[Int] = Set(5, 2, 3, 4)


import scala.util.Random
val r = Random
List.fill(5)(r.nextDouble)

// res17: List[Double] = List(
//  0.9564916850692279,
//  0.7466761353511663,
//  0.5024894344830806,
//  0.08264585586558826,
//  0.34970482035703354
//  )
