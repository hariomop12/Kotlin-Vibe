// Set


// A collection of elements with no duplicates
// Elements are not in a specific order
// Immutable: setOf(), or mutable: mutableSetOf
// Set: This is the basic interface for a read-only set of elements.
// MutableSet: This is a subinterface of Set that allows for mutable operations such as adding or removing elements.
// HashSet: This is an implementation of MutableSet that uses a hash table to store elements.
// LinkedHashSet: This is an implementation of MutableSet that maintains the insertion order of elements.
// SortedSet: This is an interface for a set that maintains its elements in sorted order.
// TreeSet: This is an implementation of SortedSet.


val set = setOf(1, 2, 3, 4, 5)
val set2=mutableSetOf(1, 2, 3, 4, 5)

val numbers =  mutableSetOf(1, 2, 3)
numbers.add(4) // Adds the specified element to the set if it is not already present
numbers.remove(3) // Removes the specified element from the set if it is present
numbers.contains(1) //  Returns true if the set contains the specified element