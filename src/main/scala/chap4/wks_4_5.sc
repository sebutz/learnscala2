//sorting maps



val immutableScores = Map(("Cindy", 10), ("Bob", 3), ("Alice", 8))

//There are two common implementation strategies for maps:
// hash tables and balanced trees.
// Hash tables use the hash codes of the keys to scramble entries,
// so iterating over the elements yields them in unpredictable order.


//By default, Scala gives you a map based on a hash table because it is usually more efficient.
// If you need to visit the keys in sorted order, use a SortedMap instead.



//visit keys in the sorted order
// TreeMap(Alice -> 8, Bob -> 3, Cindy -> 10)
val sortedScores = scala.collection.mutable.SortedMap(immutableScores.toSeq: _*)


//visit keys in the insertion order
//use LinkedHashMap
var someMonths =
scala.collection.mutable.LinkedHashMap("January" -> 1,"February" -> 2, "March" -> 3,
  "April" -> 4, "July" -> 7)

// res0: scala.collection.mutable.LinkedHashMap[String,Int] =
// Map(January -> 1, February -> 2, March -> 3, April -> 4, July -> 7, May -> 5, June -> 6)
someMonths += ("May" -> 5, "June" -> 6)



