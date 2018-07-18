package com.stonehead.tdd

class Franc(private var amount: Int) {

    fun time(multiplier: Int): Franc = Franc(multiplier * amount)

    override fun equals(other: Any?): Boolean {
        return amount == (other as Franc).amount
    }
}
