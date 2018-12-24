import scala.collection.mutable.ArrayBuffer
//TH\\
//TRANSFORMING ARRAYS

//array --> transformation --> yield new array

val array = Array("A", "F", "R", "T")
val result = for(elem <- array) yield elem.toLowerCase

// the for/yield loop creates another collection
// compatible with the old one


// array buffer --> transformation --> array buffer

//USE-CASE\\
// you don't want all the elements of the original
// you want to "filter" so you need a GUARD

var nums = Array(1, 2, 3, 4,5, 5,6,7)
val result2 =
  for (elem <- nums if elem % 2 == 0) yield 2 *elem
//
//nums: Array[Int] = Array(1, 2, 3, 4, 5, 5, 6, 7)
//result2: Array[Int] = Array(4, 8, 12)

// it makes sense that the GUARD should be inside the for/yield


//let's change the lanes: some Scala mystic
val numz = nums.filter(_ % 2 == 0).map(2 * _)
numz

//PROBLEMO
// remove all the negative elements from an array of integers
val testRemove: Array[Int] = Array(2, -4, 5, -13, 6, 7, -20, -9)
//old school
var n = testRemove.length
var i = 0
//while(i< n){
  // if (testRemove(i) >= 0) i +=1 //don't go there
  //else {testRemove.remove(i); n -= 1;}
  // WE CANNOT use remove BECAUSE IT"S ARRAY and not ARRAYBUFFER
// }


val testRem = collection.mutable.ArrayBuffer(testRemove: _*)
testRem(0)



