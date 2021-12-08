fun main() {
    val entrees: MutableList<String> = mutableListOf<String>()
    println("Entrees: $entrees")
    println("Agregamos \"noodles\": ${entrees.add("noodles")}")
    println("Entrees: $entrees")
    println("Agregamos \"spaghetti\": ${entrees.add("spaghetti")}")
    println("Entrees: $entrees")
    
    val moreItems = listOf("ravioli", "lasagna", "fettuccine")
    println("Agregamos mas items a entrees: ${entrees.addAll(moreItems)}")
    println("Entrees: $entrees")
    
    println("Removemos \"spaghetti\": ${entrees.remove("spaghetti")}")
    println("Entrees: $entrees")
    
    println("Removemos \"rice\", un elemento que no existente: ${entrees.remove("rice")}")
    println("Entrees: $entrees")
    
    println("Removemos por indice (noodles): ${entrees.removeAt(0)}")
    println("Entrees: $entrees")
    
    println("Eliminamos la lista completa: ${entrees.clear()}")
    println("Entrees: $entrees")
    
    println("La lista está vacía? ${entrees.isEmpty()}")
}
