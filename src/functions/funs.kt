@file:JvmName("EricFunctions")

package functions

fun main(){

   print(log(message="hello"))
}

// Allows for default values in the constructor
@JvmOverloads
fun log(message: String, logLevel: Int = 1){
    println(message + logLevel)
}

//Function Expresion
fun max(a: Int, b: Int): Int = if (a > b) a else b


