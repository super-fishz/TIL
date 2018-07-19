package com.stonehead.tdd

class Franc(amount: Int) : Money(amount) {

    fun time(multiplier: Int): Franc = Franc(multiplier * amount)
}
