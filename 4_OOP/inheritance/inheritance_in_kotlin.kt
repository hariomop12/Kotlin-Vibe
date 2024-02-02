// What is inheritance? Inheritance is the process of creating a new class from an existing class. The new class is called the derived (or child) class and the one from which it is derived is called the base (or parent) class. The idea behind inheritance is that you can create new classes that are built upon existing classes. When you inherit from an existing class, you reuse (or inherit) its methods and fields and you add new methods and fields to adapt your new class to new situations.

// Inheritance is an important pillar of OOP(Object Oriented Programming). It is the mechanism in java by which one class is allow to inherit the features(fields and methods) of another class.

//what is work of init block in kotlin? The init block is always cal

fun main(){
    val c = child()
    c.mywork()
    c.mywork2()


}
open class parent{
    val name = ""
    fun mywork(){
        println("I am a parent")
    }

}

class child : parent(){
    val name2: String = ""
    fun mywork2(){
        println("I am a child")
    }
}