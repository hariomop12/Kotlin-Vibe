// kotlin - oop language
// opp - object oriented programming

// paradigm which allows us to solve problems with the help of objects which are real world entities
// object - anything which has some properties and some behaviour


// class - blueprint of object --> class 10th student
// object - instance of class --> student1, student2, student3 etc
 

// classes and objects are the basic building blocks of oop


class Car (var name:String ,
    var color:String ,
    var price:Int ,
    var speed:Int  ,
    var mileage:Int ) { 
    //methods --> behaviour
    fun accelerate(){ 
        println("Accelerating...")
    }
    fun applyBrakes(){
        println("Applying Brakes...")
    }
    fun changeGear(){
        println("Changing Gear...")
    }
    fun changeSpeed(){
        println("Changing Speed...")
    }
    fun changeColor(){
        println("Changing Color...")
    }
}

fun main(){
    var car1 = Car("BMW","Black",1000000,200,20)
    println(car1.name)
    println(car1.color)
    println(car1.price)
    println(car1.speed)
    println(car1.mileage)
}