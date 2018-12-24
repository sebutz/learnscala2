//TH\\
//procedures
// that will be a function with no return value

//syntax trick : missing "="
// will transform a function into procedure
//or use Unit as a return type in the function/procedure
//definition (good practice)

//method
def box(s: String) =
  s.toUpperCase

box("hello") //res0: String = HELLO

//procedure
def box2(s: String) {
  s.toUpperCase
}

//nada
box2("hello") // box2: (s: String) Unit


//function
def box3(s: String) = {
  s.toUpperCase
}

box3("hello")  //res2: String = HELLO


//good practice: use Unit for return type

def box4(s: String) : Unit ={
  s.toUpperCase
}


box4("hello") // box4: (s: String)Unit
