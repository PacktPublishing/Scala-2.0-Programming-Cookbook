//using for expression to print a Range of integers
val range1 = 1 to 10 
for( i <- range1) println(i)


//using filters in a for expression 
for {
   i <- range1 
   if(i % 2 == 0) 
   } yield i 


