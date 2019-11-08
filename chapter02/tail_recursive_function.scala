
//recursively calling the factorial function from within itself
def factorial(x: BigInt): BigInt = { 
        if (x <= 1)  1 
        else  x * factorial(x - 1)
     }
