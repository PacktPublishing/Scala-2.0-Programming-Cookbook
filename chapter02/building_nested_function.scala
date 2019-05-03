
//defining fact function nested inside the factorial function
def factorial(n: Int): Int = {
 def fact(num: Int, acc: Int): Int = {
   if (num <= 1)
     acc
   else
     fact(n - 1, n * acc)
     }
  fact(n,1) 
}
