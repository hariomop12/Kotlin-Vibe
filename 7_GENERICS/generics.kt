

 // generics are used to make a class or function more flexible
// generics ki jarurat q padti hai? --> ek hi class ko alag alag data types ke liye use krna ho tab generics ki jarurat padti hai basicslly generics ko use krne se hum ek hi class ko alag alag data types ke liye use kr skte hai easily

// generics ko use krne ke liye hum class ke name ke bad < > angular brackets me ek variable define krte hai jisko hum generic type variable bolte hai
// generic type variable ko hum kisi bhi name se define kr skte hai
// generic type variable ko hum kisi bhi data type ka define kr skte hai
// generic type variable ko hum class ke name ke bad < > angular brackets me define krte hai

fun main(){
    val obj1 = container<Int>(10)
    println(obj1.getValue())
    obj1.setValue(20)
    println(obj1.getValue())
    val obj2 = container<String>("kotlin")
    println(obj2.getValue())
    obj2.setValue("java")
    println(obj2.getValue())
    val obj3 = container<Double>(10.5)
    println(obj3.getValue())
    obj3.setValue(20.5)


}

class container<T>(var data: T){
      fun setValue(data: T){
          this.data = data
      }
        fun getValue(): T{
            return this.data
        }
}

//  generic es liye use me aaaye q ki ek hi class ko bar bar banana padta tha alag alag data types ke liye but generic ke use se hum ek hi class ko alag alag data types ke liye use kr skte hai easily basically data type ko generic type variable me store krke hum ek hi class ko alag alag data types ke liye use kr skte hai easily and generic type variable ko hum kisi bhi name se define kr skte hai and generic type variable ko hum kisi bhi data type ka define kr skte hai and generic type variable ko hum class ke name ke bad < > angular brackets me define krte hai

// dynamically ek hi container ko use kar sakte hai alag alag data types ke liye

 
