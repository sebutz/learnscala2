//ZIPPING

//tuples are bundling values so they can be processed together

val symbols = Array("<", "-", ">")
val counts = Array(2, 10, 2)

//how to bundle ? using zip
val pairs = symbols.zip(counts) // Array((<,2), (-,10), (>,2))
pairs.getClass  //class [Lscala.Tuple2;


//these pairs can be processed together

for ((s, n) <- pairs) {
  println(s"[${s} // ${n} ]")
}

//res2: scala.collection.immutable.Map[String,Int] = Map(< -> 2, - -> 10, > -> 2)
//going further : collection of pairs to map
pairs.toMap




