//TH\\
//Traversing array and array buffers

//in Java it's a pain
//Scala is much more friendly

val array = Array(2, 4, 5, 9 )

//traversing with for loop
for(i <- 1 to array.length) println(array(i -1))
for (i <- 0 to array.length-1)println(array(i))

//use "until" to skip the -1 pain
for( i<- 0 until array.length) println(array(i))

//1 to n: [1, n]
// 1 until n: [1, n)


//some kind of step
for (i <- 0 until array.length by 2) println(array(i))
0 until array.length by 2

// reverse order : the trick of sugar syntax
//TODO  0 until array.length by -1 ??? DOES IT REALLY WORK? TODO
for(i<- array.indices.reverse) println(array(i))

//Do you really need the index? If not
//the "enhanced  for loop"
for (el <- array) println(el)
