//TH\\
//LAZY VALUES

// initialization is deferred until
// it is accessed for the first time
// or it is used for the first time


lazy val words = scala.io.Source.fromFile("/usr/share/dict/words").mkString


// lazy are half way between val and def

//even the file does not exists, if it is not
//used there is no error

val words2 = scala.io.Source.fromFile("/usr/share/dict/words").mkString
// this is immediately evaluated

//function
//still not evaluated as the function is not called(used)
def words3 = scala.io.Source.fromFile("/usr/share/dict/words").mkString

//using it: evaluation takes place
words3

//laziness is not cost free:
// a method will check if the value was not
// already initialized
