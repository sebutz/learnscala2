//conditional expressions

//expression , statement ?

//Java, C ++
// expression 3 + 4 ---> that has a value
//statement: x  = 5 ----> that will do something

//TAKE_HOME
//Scala, almost every construct has a value


//common supertype for all branches
if (3 < 0) "abc" else ""; //String ""

if (2 == 2) 3 else "abc" // Any 3

//another alternative:

var s: Any = "" //Any ""

if (2 == 2) s = 100 else s = "abc"
s //Any 100


//TAKE HOME  ternary operator ?: from Java is
//combined with if-else anf you have
// if/else on steroids in Scala


//Q4I
// if s is Any you CANNOT
//if (s > 99) 4  // you cannot compare  Any with 99 using <
// it's lie saying that Any type have these methods

var ss: Int = 4;

if (ss < 5) 4 //AnyVal 4

//Q:Why ss is not just Int?
//R: it can be possible that if/else
// will not yield any value


if (ss > 5) "aaa" //res6: Any = ()

// the value will be () which is the
//symbol for Unit, meaning no useful value




//TH: Scala has no switch











