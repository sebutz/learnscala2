//TH\\

//a method operates on an object
// a function not

//something similar are static methods
def abs(x: Double) =
   if (x >= 0) x else -x

// you must specify the types of parameters
// as long as the function is not recursive
// don't need to specify the return type



def fac(n: Int) =
{
    var result = 1
    for (i <- 1 to n) result *= i
    result
}
// many instructions ==> you need a body
//last line is the result

// it is possible to force the return earlier
// using return, not really common in Scala

fac(3)

//you need to specify the return type
//that makes sense when looking at n * facRec(n-1)
def facRec(n:Int) : Int =
    if (n <=0 ) 1 else n * facRec(n-1)


