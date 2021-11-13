import java.awt.Color

fun main()
{
    val diceRange = 1..6
        println("Random number between ${diceRange.first} and ${diceRange.last}: ${diceRange.random()} " )

    val dice = Dice(20, Color.black)
    println("Your ${dice.numSides} sided dice rolled ${dice.roll()}, the dice is of color ${dice.color}")

    val secondDice = Dice(6, Color.red)
    println("Your ${secondDice.numSides} sided dice rolled ${secondDice.roll()}, the dice is of color ${secondDice.color}")

    val coin = Coin()
    println("Coin throw number 1: ${coin.throwCoin()}")
    println("Coin throw number 2: ${coin.throwCoin()}")
    println("Coin throw number 3: ${coin.throwCoin()}")
    println("Coin throw number 4: ${coin.throwCoin()}")
    println("Coin throw number 5: ${coin.throwCoin()}")
    println("Coin throw number 6: ${coin.throwCoin()}")
}