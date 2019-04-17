import domain.Person
import domain.Question
import java.io.FileReader
import java.io.IOException
import java.util.*

fun main() {

}

fun exxxxcepptions() {

    var reader = FileReader("filename")
    try {
        reader.read()
    }catch (e : IOException){
        println(e)
    }

}

fun loops() {
    //for loops
    for (i in 1..10) {
        println(i)
    }
    //non inclusive
    for (i in 1 until 10) {
        println(i)
    }

    //stepping
    for (i in 1..10 step 2) {
        println(i)
    }
    // descending
    for (i in 10 downTo 1 step 2) {
        println(i)
    }

    // List iteration
    var numbers = listOf(1, 2, 2, 3, 4, 56, 7)

    for (i in numbers) {
        println(i)
    }
    for ((index, element) in numbers.withIndex()) {
        println("$element at $index")
    }

    //Map iteration
    var ages = TreeMap<String, Int>()
    ages["Kevin"] = 55
    ages["Eric"] = 30
    ages["Bipin"] = 40

    for ((name, age) in ages) {
        println("$name is $age")
    }


}

fun printName(name: String) {
    println(name)
}

fun printPerson() {
    var eric = Person("Eric")
    eric.name = "Eric"
    eric.display()
    eric.displayWithLambda(::printName)
}

fun questionLesson() {

    var q = Question()
    q.printResult()

    // Try Catch
    val number: Int? = try {
        Integer.parseInt(q.answer)
    } catch (e: NumberFormatException) {
        null
    }

    println(number)
}