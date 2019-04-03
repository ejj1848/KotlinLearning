import domain.Person
import domain.Question
import java.lang.NumberFormatException

fun main() {
    println("Hello World")

    var eric = Person("Eric")
    eric.name = "Eric"
    println(eric.name)
    eric.display()
    eric.displayWithLambda(::printName)

    var q = Question()
    q.printResult()

    // Try Catch
    val number: Int? = try {
        Integer.parseInt(q.answer)
    }catch (e:NumberFormatException){
        null
    }

    println(number)

    //for loops
    for (i in 1..10){
        println(i)
    }
    //stepping
    for (i in 1..10 step 2){
        println(i)
    }
    // descending
    for (i in 10 downTo 1 step 2){
        println(i)
    }

}

fun printName(name: String) {
    println(name)
}