//TH\\
// Default and named arguments


def decorate (str: String, left: String = "[", right: String = "]" ) =
     left  + str + right

decorate("goal")
decorate("goal", "<<<", ">>>")

//defaults are applied from the end
decorate("Hello", "?")

//tricky, let's specify them


decorate(left = "[", str = "Gogo", right = "]" )

// a mix (the order is preserved until the first named)
decorate("Gogo", right="}")



