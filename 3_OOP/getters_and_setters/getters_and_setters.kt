// Gettters and Setters in Kotlin   
/*fun main() {
     val obj = Calcuator()
        println(obj.add(2, 3))
        println(obj.multiply(2, 3))
}

class Calcuator{
    lateinit var name: String
    fun add(a: Int, b: Int): Int{
        return a + b
    }
    fun multiply(a: Int, b: Int): Int{
        return a * b
    }
}*/

// see some theroy about lateinit

fun main() {
    val obj = Person("Rahul", 20)
    println(obj.Name)
    println(obj.Age)
    obj.Age = -21
    println(obj.Age)
    println(obj.Name)
    
}
class Person(NameParam : String, AgeParam : Int){
    var Name : String = NameParam
    get(){
        println("name getter called")
        return field.uppercase()
    }
    var Age : Int = AgeParam
     set(value) {
        if(value > 0){
            field = value
        } else {
            println("Age can't be negative")
        }
}

// default getter and setter syntax
    var email : String = ""
    get() = field
    set(value) {
        if(value.contains("@")){
            field = value
        } else {
            println("Invalid email")
        }
    }
}
