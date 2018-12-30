//UPDATING MAP VALUES


//KP you can update only to a mutable map
val immutableScores = Map(("Alice", 10), ("Bob", 3), ("Cindy", 8))

immutableScores.get("Alice") //Some(10)
immutableScores.getOrElse("Alice", 0) // 10

immutableScores.getOrElse("Jimbo", -1)  // -1

immutableScores.mkString(";")
immutableScores.mkString("[", "][", "]")
immutableScores("Alice") //10
// scores("Jimbo") //java.util.NoSuchElementException: key not found: Jimbo
// scores("Alice") = 9 //Error:(14, 9) value update is not a member of scala.collection.immutable.Map[String,Int]
// scores is an immutable Map
immutableScores("Alice")

// need to create a mutable map from immutable
val mutableScores =  scala.collection.mutable.Map(immutableScores.toSeq: _*)
//why is this works? because a map can be seen as a sequence of pairs

//Seq[(String, Int)] = Vector((Alice,10), (Bob,3), (Cindy,8))
immutableScores.toSeq
mutableScores("Alice") = 9
mutableScores

//KP   you can add multiple associations using +=

mutableScores += ("Bob" -> 4, "Andrew" -> 6)
mutableScores

//*** Bob's score was updated !!!

//KP  what about immutable?
//obviously you cannot update it but you can construct another
// immutable map with an update


val newImmutableScores = immutableScores +  ("Koko"-> 7)

//*** newScores is immutable and has all the updates

//Q: can we have the update magic also?
val newImmutableScores2 = immutableScores + ("Bob" -> 10, "Koko" -> 8)
// yes, it is possible


//*** what if we are using a var
//it will be simplier

//immutable
var newImmutableScores3 = immutableScores + ("Bob" -> 10, "Koko" -> 12)

//immutable
newImmutableScores3 = newImmutableScores3 + ("Guccione" -> 10)


//the reference scores4 is pointing to another map after +
var newImmutableScores4 = immutableScores
newImmutableScores4 = newImmutableScores4 + ("Marty" -> 7)
immutableScores


//removing a key from a map ( using -) and we need only the key
mutableScores
mutableScores.remove("Koko") // Option[Int] = None
mutableScores

//if the key is not present nothing happens

mutableScores.remove("Bob")
mutableScores // Bob's gone


immutableScores
//reassignment to a val
//immutableScores = immutableScores - "Bibi"

//nothing happens
val newImmutableScores5 = immutableScores - "Bibi"
newImmutableScores5

var newImmutableScores6 = immutableScores - "Bob"
newImmutableScores6 // Bob's gone

// or less
newImmutableScores6 -= "Cindy"
newImmutableScores6

//You might think that it is inefficient
// to keep constructing new maps, but that is not the case.
// The old and new maps share most of their structure.
// (This is possible because they are immutable.)
