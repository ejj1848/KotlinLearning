package functions

fun main(){

}

class Header(var Name: String){
 fun Header.plus(other: Header) : Header {
     return Header(this.Name + other.Name)
 }

}
