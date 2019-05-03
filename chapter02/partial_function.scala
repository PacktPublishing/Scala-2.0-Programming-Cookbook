
//defining a partial function
val division = new PartialFunction[Int, Int]{
  def isDefinedAt(x: Int) =  x != 0
  def apply(x:Int) = Int.MaxValue / x
}

division.isDefinedAt(4) //true

division.isDefinedAt(0) //false 

division(0) //java.lang.ArithmeticException / by zero

val division2: PartialFunction[Int, Int] = {
   case x if x != 0 => Int.MaxValue / x
  }

division2.isDefinedAt(0) //false

List(0,1,2,3,4,5).map(x => division2(x)) //scala.MatchError: 0 (of class java.lang.Integer)

List(0,1,2,3,4,5).collect(x => division2(x)) //res2: List[Int] = List(2147483647, 1073741823, 715827882)
