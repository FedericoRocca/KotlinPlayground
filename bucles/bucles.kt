fun main() {
    val guestPerFamily = listOf(2, 4, 1, 3)
    var totalGuests = 0
    var index = 0
    while( index < guestPerFamily.size ) {
        totalGuests += guestPerFamily[index]
        index++
    }
    println("Total guests: $totalGuests")
    
    val names = listOf("Jessica", "Henry", "Alicia", "Jose")
    for(name in  names) {
        println("$name, length ${name.length}")
    }
    
    for (item in 'b'..'g') print(item)
    println()

    for (item in 1..5) print(item)
	println()

    for (item in 5 downTo 1) print(item)
	println()

    for (item in 3..6 step 2) print("$item, ")
    println()
}
