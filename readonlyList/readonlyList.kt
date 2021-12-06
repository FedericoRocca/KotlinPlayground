fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    println("List: $numbers")
    println("List size: ${numbers.size}")
    println("First element of List: ${numbers.get(0)}")
    println("Second element of List: ${numbers.get(1)}")
    println("Last element of List: ${numbers[( numbers.size - 1 )]}")
    println("First element of List with .first(): ${numbers.first()}")
    println("Last element of List with .last(): ${numbers.last()}")
    println("List contains 4?: ${numbers.contains(4)}")
    println("List contains 7?: ${numbers.contains(7)}")
}
