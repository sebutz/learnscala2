//TH\\
//Advanced for loops

//1. multiple generators
for (i <- 1 to 3; j <- 1 to 3)
  print(f"${10 * i + j}%3d")


//2. Guard condition for the for generator
for (i <-1 to 3; j <-1 to 3 if i!=j) {
  println(s"i=${i},j=${j}")
  println(f"${10 * i + j}%3d")
}

// idea is to create some matrix
//(1, 2)   (1, 3)
//(2, 1)   (2,3)
// ....


//Can we break from for with the guard condition?
//depends: we can influence only the generators' variables
// but we have to lift up the breaking condition:
for (i <- 1 to 100 if i *100 < 355){
  println(s"i=${i}")
}


for (i<- 1 to 3; m = 4 -i; j <- m to 3){
  println(s"i=${i}, from=${m}, j=${j} ")
}


//3. FOR COMPREHENSION
// Yield of Collection output
// body starts with yield
// collection is compatible with first generator

var x = for(i <- 1 to 4) yield i%3;
x.getClass

/**
  * x: scala.collection.immutable.IndexedSeq[Int] = Vector(1, 2, 0, 1)
  * res4: Class[_ <: scala.collection.immutable.IndexedSeq[Int]] =
  * class scala.collection.immutable.Vector
  **/

//first generator is a String
for(c <- "Hello"; i <- 0 to 1) yield (c + i).toChar //  String = HIeflmlmop
//first generator is a Range
// 1 to 4 scala.collection.immutable.Range.Inclusive = Range 1 to 4
(1 to 4).getClass
for(i<- 0 to 1; c <- "Hello") yield (c + i).toChar // IndexedSeq[Char]  Vector(H, e, l, l, o, I, f, m, m, p)


//readability
// you can use {} instead of ()
// not to use ;

for (i<- 1 to 4; from = 4 - i; j <- from to 10) yield (i + j)

//or


for{
  i<- 1 to 4
  from = 4 - i
  j <- from to 10
} yield i + j

// same result

//NOTE: yield is evaluating i + j without brackets