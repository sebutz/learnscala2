//TH\\
//ARRAYS

//FIXED LENGTH

// you need an array with the length that doesn't change

// an array of 10 integer all initialized with 0
val nums = new Array[Int](10)
val strings = new Array[String](3) // initialized with null


// inferring the length
val strings2 = Array("Hello", "Bob")
strings2(0) = "Uncle" // mutating the value of the first element
strings2

// java.lang.ArrayIndexOutOfBoundsException: 2
//strings2(2) = "Bye"

// inside the JVM a Scala array is implemented as
// a Java array, when is possible, the Java primitive
// arrays are preferred.


