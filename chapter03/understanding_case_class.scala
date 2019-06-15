

//creating a case class 
case class Person(name: String, age: Int)
val p1 = Person("Bink", 29) 

//using the toString method
p1.toString
res1: String = "Person(Bink,29)"

//comparing case classes 
val p2 = Person("Bink", 29)
p1 == p2 
res2: Boolean = true

//using the copy method 
p1.copy(age = 33) 
res3: Person = Person("Bink", 33)


//using pattern matching on case class 
def findCategory(person: Person): String = person match {
 case Person("Bink", 33) => "Hello Bink"
 case Person("Alice", _ ) => "Hi Alice"
 case p if p.age <= 17  => "You're Adolescence"
 case p if p.age > 18 => "You're an Adult"
}


//more on pattern matching. 
def  whoAreYou(x: Any): String = {
  case "welcome" => "welcome you all" 
  case false => "this is a false boolean"
  case (x,y) => "a tuple of two values $x and $y" 
  case List(1,_) => "a list with 1 as the first element" 
  case s: String => "this is a sting: $s " 
  case I: Int => "this is an int: $I"
  case a: List[Int] => "A list of integers"
  case m: Map[_,_] =>"this is a Map $m.toString" 
  case p: Person => "welcome $p.name" 
  case _ => "can't identify this "
}

//algebraic data types with case classes 
sealed trait Row  
case class Person(name:String, age: Int) extends Row
case class InvalidRow extends Row


def processLine(row: Row): Unit = row match {
 case Person(name,age) => //save to database 
 case Invalid          => //Ignore line 
}
