import scala.collection.mutable.ArrayBuffer
//TH\\
//Take functions for common operations

//Int, BigInteger, BigDecimal
Array(1, 3, 5, 6, 56).sum

ArrayBuffer("Mary", "had", "a", "little", "lamb").max

//weird?
ArrayBuffer("Mary", "had", "a", "little", "lamb").min

val b = ArrayBuffer(1, 7, 2, 9)
val bSorted = b.sorted
// b is unchanged; bSorted is ArrayBuffer(1, 2, 7, 9)
b


//supplying a comparison function

val bDesceding = b.sortWith(_ > _)


//you can sort IN PLACE an Array but not an ArrayBuffer
val a = Array(1, 7, 2, 9)
scala.util.Sorting.quickSort(a)
a



//DISPLAYING THE CONTENT OF AN ARRAY
a.mkString("/")
