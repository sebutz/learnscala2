import scala.collection.mutable.ArrayBuffer
//TH\\
//ARRAYS Variable-length


val names = new ArrayBuffer[String]()
//that's empty

names(0) // java.lang.IndexOutOfBoundsException: 0
// the magic of initialization by default
// as for the fixed-length arrays is gone

names += "Joe" // adding an element of the right type at the end
names(0) // "Joe"
names(1) // java.lang.IndexOutOfBoundsException: 1

//adding a bunch of elements(a sequence)
names +=("Jim", "Mary", "Ben", "Alfonso", "Ed")
names(3)


//append collection with ++

names ++= Array("King", "Kong", "Bond")
names // still ArrayBuffer


//remove the last 2 elements
names.trimEnd(2)
names

//Adding or removing elements at the end of an array buffer
// is an efficient (“amortized constant time”) operation.”

// remove the first
names.trimStart(1)
names

names.trimStart(0) //nothing to remove
names


// not so efficient ops: inserting and removing arbitrary
// so you need first the position
val names2 = ArrayBuffer[String]()
names2 += ("Z", "D", "E")
names2.insert(1, "Tesla")
names2.insert(2, "Newton")
names2

// bulk insert or batch insert
names2.insert(2, "A", "B", "C")
names2
////////////// 0   1    [2 3] 4
//ArrayBuffer(Z, Tesla, A, B, C, Newton, D, E)
// same as the remove ops
names2.remove(2, 2) // from position 2(including it) remove 2 elements
// aka from position x  (including it)
names2

names2.remove(2) // equivalent with .remove(2, 1)
names2
names2.remove(2, 0) // nothing
names2.remove(2, 1)
names2


//conversion between Array and ArrayBuffer
// you don't know yet, how many elements
//then "fix" them

//1. start with an ArrayBuffer

var testArray = new ArrayBuffer[String]()

testArray ++= ArrayBuffer("A", "B", "V")
testArray


//res27: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(A, B, V)
//res28: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(A, B, V)
//
//
//solidStateFixed: Array[String] = Array(A, B, V)
//res29: Array[String] = Array(A, B, V)
val solidStateFixed = testArray.toArray;
solidStateFixed
