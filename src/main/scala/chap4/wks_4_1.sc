//MAPS  * TUPLES

//KP1
// constructing a map (immutable by default)
val map1 = Map("Alice" -> 123, "Tom" ->234)
map1

//xxx: immutable by default

//KP2: mutable
val map2 = scala.collection.mutable.Map("Alice" -> 123,
"John" -> 1232)


//KP3
//empty map

val scores = scala.collection.mutable.Map[String, Int]()

//xxx
//map = collection of pairs (grouping 2 values, not req. to be of the same type)

//for example

val map3 = Map(("Forest", 1), ("Gump", 2))
