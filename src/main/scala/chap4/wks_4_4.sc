//Iterating over maps


val immutableScores = Map(("Alice", 10), ("Bob", 3), ("Cindy", 8))


for((k, v) <- immutableScores) {
  println(s"key=${k}")
  println(s"value=${v}")
}

//KP visit only keys or values

immutableScores.keys //just a set
immutableScores.keySet //immutable set

immutableScores.values //iterable values

//KP reverse a map ? that means switch the keys with the values
//and viceversa



//res4: scala.collection.immutable.Map[Int,String] = Map(10 -> Alice, 3 -> Bob, 8 -> Cindy)
for((k, v) <- immutableScores)
  yield (v, k)


//problem with the keys, in this exercise
// same keys
val immutableScores2 = Map(("Alice", 10), ("Bob", 10), ("Cindy", 8))

//*** only one key will be picked
//res5: scala.collection.immutable.Map[Int,String] = Map(10 -> Bob, 8 -> Cindy)
for((k, v) <- immutableScores2)
  yield (v, k)


