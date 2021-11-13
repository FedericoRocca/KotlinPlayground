import java.awt.Color

class Dice (val numSides: Int, val color: Color){

    fun roll(): Int
    {
        return (1..numSides).random()
    }

}