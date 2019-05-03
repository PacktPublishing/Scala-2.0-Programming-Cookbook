
def addOne(x: Int) => x + 1 

val list = List(1,2,3,4)
list.map(x => addOne(x)) //List(2,3,4,5)

def doSomething(x: Int, f: Int => Int) = f(x)

doSomething(10, addOne)  //11 

def multiply(x: Int) = x * x 

doSomething(10, multiply) //100
