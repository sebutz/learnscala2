//LOOPS

//same while and do loops as in Java

//but there is no for(initialize;test;update)

//instead Scala has
//no val or var for the loop variable
//TH\\
//Scala basic for loop
// one generator
for (i <- 1 to 10){
  println(i)
  println(i.getClass)
}

1 to 10 //scala.collection.immutable.Range.Inclusive = Range 1 to 10

var s= 0;
for (i <- 1 to 10){
  println(i)
  s += i
}

println (s)

//TH\\
//Scala DON'T have break or continue from a loop
//how to get away?

import scala.util.control.Breaks._

var ss = 0
breakable {
  for (i <- 1 to 10) {
    ss+= i
    if (i == 5) break;

  }
}

println("result")
ss


//TH\\
//Shadowing a la Scala
// in Java you cannot have 2 local variables
//with the same name and OVERLAPPING SCOPE

//guess what? In Scala, no problemo


val n = 100;
for(n <- 1 to 7){
  print("*" + n) // 1, 2 ...
}
println("n="  + n) //100
