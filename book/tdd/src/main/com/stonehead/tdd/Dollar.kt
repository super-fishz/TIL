package com.stonehead.tdd

class Dollar(var amount: Int) {

    fun time(multiplier: Int): Dollar = Dollar(multiplier * amount)

    override fun equals(other: Any?): Boolean {
        return amount == (other as Dollar).amount
    }
}
