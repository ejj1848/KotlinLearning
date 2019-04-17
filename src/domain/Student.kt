package domain

class Student: PersonClass() {
    override fun getAddress(): String {
    return ""
    }

    override fun getName(): String {
        return super.getName()
    }
}