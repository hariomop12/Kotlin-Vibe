// in this section we will learn about list and map in kotlin
//lits type of collection that holds multiple items in an order
// there are two types of list mutable and immutable list

// 1 immutable list
//immutable list is read only list
//immutable list is created using listOf() function
//immutable list is fixed size list its size cann't be changed after its creation


// fun main() {
//     val list = listOf("kotlin", "java", "python", "c++")
//     println(list)
//     println(list[0])
//     println(list[1])
//     println(list[2])
//     println(list[3])
//     println(list.get(0))
//     println(list.get(1))
//     println(list.get(2))
//     println(list.get(3))
//     println(list.size)
//     println(list.isEmpty())
//     println(list.contains("kotlin"))
//     println(list.contains("java"))
//     println(list.contains("python"))
//     println(list.contains("c++"))
//     println(list.contains("c"))
//     println(list.indexOf("kotlin"))
//     println(list.indexOf("java"))
//     println(list.indexOf("python"))
//     println(list.indexOf("c++"))
//     println(list.indexOf("c"))
//     println(list.lastIndexOf("kotlin"))
//     println(list.lastIndexOf("java"))
//     println(list.lastIndexOf("python"))
//     println(list.lastIndexOf("c++"))
//     println(list.lastIndexOf("c"))
//     println(list.subList(0, 2))
// }

// 2  mutable list
// mutable list is read and write list
// mutable list is created using mutableListOf() function
// mutable list is not fixed size list its size can be changed after its creation

// fun main(){
//     val list = mutableListOf("kotlin", "java", "python", "c++")
//     println(list)
//     println(list[0])
//     println(list[1])
//     println(list[2])
//     println(list[3])
//     println(list.get(0))
//     println(list.get(1))
//     println(list.get(2))
//     println(list.get(3))
//     println(list.size)
//     println(list.isEmpty())
//     println(list.contains("kotlin"))
//     println(list.contains("java"))
//     println(list.contains("python"))
//     println(list.contains("c++"))
//     println(list.contains("c"))
//     println(list.indexOf("kotlin"))
//     println(list.indexOf("java"))
//     println(list.indexOf("python"))
//     println(list.indexOf("c++"))
//     println(list.indexOf("c"))
//     println(list.lastIndexOf("kotlin"))
//     println(list.lastIndexOf("java"))
//     println(list.lastIndexOf("python"))
//     println(list.lastIndexOf("c++"))
//     println(list.lastIndexOf("c"))
//     println(list.subList(0, 2))
//     list.add("c")
//     println(list)
//     list.add(0, "c")
//     println(list)
//     list.addAll(listOf("c", "c++"))
//     println(list)
//     list.addAll(0, listOf("c", "c++"))
//     println(list)
//     list.remove("c")
//     println(list)
//     list.removeAt(0)
//     println(list)
//     list.removeAll(listOf("c", "c++"))
//     println(list)
//     list.retainAll(listOf("kotlin", "java"))
//     println(list)
//     list.set(0, "c")
//     println(list)
//     list.clear()
//     println(list)
// }



// 2 MAP ARE USE TO STORE KEY VALUE PAIR 

// map is created using mapOf() function
// map is read only collection


fun main(){
    val map = mutableMapOf(1 to "kotlin", 2 to "java", 3 to "python", 4 to "c++")
    map[5] = "c"
    println(map)
    println(map[1])
    println(map[2])
    println(map[3])
    println(map[4])
    fun main(){
        val map = mutableMapOf(1 to "kotlin", 2 to "java", 3 to "python", 4 to "c++")
        map[5] = "c"
        println(map)
        println(map[1])
        println(map[2])
        println(map[3])
        println(map[4])
        
        // Add the following code block
        println(map[5])
    }
    println(map.get(1))
    println(map.get(2))
    println(map.get(3))
    println(map.get(4))
    println(map.size)
    println(map.isEmpty())
    println(map.contains(1))
    println(map.contains(2))
    println(map.contains(3))
    println(map.contains(4))
    println(map.contains(5))
    println(map.containsKey(1))
    println(map.containsKey(2))
    println(map.containsKey(3))
    println(map.containsKey(4))
    println(map.containsKey(5))
    println(map.containsValue("kotlin"))
    println(map.containsValue("java"))
    println(map.containsValue("python"))
    println(map.containsValue("c++"))
    println(map.containsValue("c"))
    println(map.keys)
    println(map.values)
    println(map.entries)
    println(map.getOrDefault(1, "c"))
    println(map.getOrDefault(2, "c"))
    println(map.getOrDefault(3, "c"))
    println(map.getOrDefault(4, "c"))
    println(map.getOrDefault(5, "c"))
    println(map.filter { it.key > 2 })
    println(map.filter { it.value == "kotlin" })
    println(map.filterKeys { it > 2 })
    println(map.filterValues { it == "kotlin" })
    println(map.mapKeys { it.key * 2 })
}

// it contains lots of function like filter, map, etc so prefer to see it official documentation link is given below AND AFTER WRITTING CODE WE WILL SE MANY TYPES OF ITS FUNCTIONALITY ACCORDING TO OUR NEED


// https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index.html