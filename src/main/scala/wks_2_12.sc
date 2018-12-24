import java.io.IOException
import java.net.{MalformedURLException, URL, URLConnection}
//TH\\
//EXCEPTIONS

//work the same way as in Java

//when you throw an exception the
//1)current computation flow is aborted
//2) runtime system checks for an exception handler
// for that type of exception

// throw  new IllegalArgumentException("shit")

//3) control will resume with the innermost such handler
//4) if there is no such handler , program terminates




// what object can you throw? as in Java:
// have to belong to java.lang.Throwable

// unlike Java, Scala DON"T HAVE checked exceptions
// a.k.a. you never have to declare that some function
// will might throw an exception


//Java & checked exceptions
// if a Java method throws an IOException, you must declare it

// that's bad, as it forces the programmer to think
//where those exception should be handled
// that means : mutate method signature

 //doSomething() throws IOException, InterruptedException, ClassNotFoundException{}
// that will put the programmer in a defensive posture
// either to catch it earlier(too early)
// either using complicated exception hierarchy classes


//Scala: through compile-time checking isn't always
// a good thing

// throw  expression has the special type Nothing
var x = -12
var y: Double = 0.0
//y = if(x >= 0) { Math.sqrt(x)
//} else throw new IllegalArgumentException("Negative number")

y.getClass //res1: Class[Double] = double
// because you initialized before
// don't rely on the if/else for initialization in this case

// first branch is Double
//second is of type Nothing
// therefore the if/else has the Double type
// if a branch has the type of Nothing, then the
// if/else will have the type of the other branch



//catching exceptions

def process(str: String) = {
  val url:URL = new URL(str)
  val conn:URLConnection = url.openConnection
  conn.connect()
}

process("http://aliexpress.com/old_stuff")

val url = "attp://aliexpress.com/new_stuff"

try {
   process(url)
} catch {
  case _: MalformedURLException => println(s"Bad URL: $url")
  case ex : IOException => ex.printStackTrace()
}


