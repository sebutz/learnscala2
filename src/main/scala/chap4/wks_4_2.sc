// MAP * TUPLES

//KP1: accessing  map values


val scores = Map(("Alice", 10), ("Bob", 3), ("Cindy", 8))

val bobScores = scores("Bob") // the same as Java's scores.get("Bob")

//*** what if the map is not containing that key? Exception is thrown

//java.util.NoSuchElementException: key not found: Fred
val fredScores = scores("Fred")

//*** ok, big deal, what if we want to check for the key
var jimScores = if(scores.contains("Jim")) scores("Jim") else 0

//*** pretty common combination
//use this sugar syntax

jimScores = scores.getOrElse("Jim", 0)


