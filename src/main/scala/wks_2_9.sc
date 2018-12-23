//TH\\
//variable arguments

// in fact is a Seq type we are passing
def sum(args: Int*) ={
   var s:Int = 0
   for(arg <- args) s+= arg //you need it
   s
}

sum (3, 4, 5)
sum(2, 6, 7, 8, 9)

//what if you have already a Seq?
// you cannot pass directly

//sum(1 to 5) ERROR
//why? when you are giving a single argument
// the function is expecting an Int and not a Seq, right?

// there is a trick to tell the compiler what you have
// : _*
// consider it as a sequence
sum (1 to 5 : _*)


// what if you have a recursive function?

def recSum(args: Int*) : Int =
   if(args.length  == 0) 0
   else args.head + recSum(args.tail: _*)

recSum(1, 4, 6, 7, 8, 9)


