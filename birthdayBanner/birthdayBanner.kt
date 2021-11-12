fun main()
{
    val border = "`-._,-'"
    printBorder(border, 4)
    println("  Happy birthday, Jhansi!")
    printBorder(border, 4)
}

fun printBorder(border: String, timesToRepeat: Int)
{
    repeat(timesToRepeat)
    {
        print(border)
    }
    println()
}
