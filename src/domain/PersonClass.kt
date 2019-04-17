package domain



open class PersonClass {

   private var firstName: String ?= null
   private var lastName: String ?= null

    open fun getName() : String = "$firstName $lastName"

    open fun getAddress(): String{
        return "Address"
    }

}