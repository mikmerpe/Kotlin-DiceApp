package com.example.diceapp

fun main() {
    // Primer dado
    val myFirstDice = Dice(8) // Incializo la instancia de la clase Dice.
    println("El dado tiene ${myFirstDice.numSides} lados y al lanzarlo ha salido el número ${myFirstDice.roll()}") // Imprimo el numero de lados del dado.

    // Segundo dado
    val mySecondDice = Dice(20)
    println("El dado tiene ${mySecondDice.numSides} lados y al lanzarlo ha salido el número ${mySecondDice.roll()}")


}

// Creo la clase Dice que representa el dado físico
class Dice (val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random() // Utilizo la funcion incluida random() para generar un numero aleatorio a partir del numero de lados del dado.
    }
}
