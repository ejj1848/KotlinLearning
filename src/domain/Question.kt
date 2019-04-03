package domain

class Question{



    var answer: String ?= null
    val question: String = "Am I cool"
    var correctAnswer = "Yes"


    fun printResult(){

        val message = when (answer) {
            correctAnswer -> "You are correct"
            else -> "Try again"
        }

        println(message)
    }
}