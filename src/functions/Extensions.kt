package functions

fun main(){

    val text = "With all      the white     space"
    print(replaceMultipleWhiteSpace(text))

}

fun replaceMultipleWhiteSpace(value: String) : String {
    var regex = Regex("\\s+")
    return regex.replace(value, " ")
}
//this keyword relates to what the input is
fun String.replaceMultipleWhiteSpaceEx() :String{
    var regex = Regex("\\s+")
    return regex.replace(this, " ")
}