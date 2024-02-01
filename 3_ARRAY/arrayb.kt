// ARRAY -- OBJECT THAT HOLDS MULTIPLE VALUES OF THE SAME TYPE
// FIXED SIZE

fun main(){
    var arr = arrayOf(1,2,3,4,5)
    for ((i,e) in arr.withIndex()){
        println("index: $i, element: $e")
        println(arr.get(index = 2))
        arr.set(0, 100)
        println(arr.get(index = 0))
        arr.size


    }
}

// somem theor about arrays out of bounds exception

