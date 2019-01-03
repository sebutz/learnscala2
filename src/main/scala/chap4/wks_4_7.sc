// tuples

// maps are collections of value/pairs
//pairs? aggregates values of different types

//res0: (String, Double) = (Aloha,12.3)
var y = ("Aloha", 12.3)
y.getClass //class scala.Tuple2

var x = ("Akira", 12, 500.5)
x.getClass //class scala.Tuple3


//access the components of a tuple

x._1
x._2
x _3 // another way to write it


//using pattern matching instead of this esoteric notation


val (first, second, third) = x

first

//you dont't need all the components

val (first1, second2, _) = x

//when they are useful
//for example when a functions is returning
//multiple values


//res6: (String, String) = (NY,ew ork)
"New York".partition(_.isUpper)