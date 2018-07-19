package com.stonehead.tdd

class Dollar(amount: Int) : Money(amount) {

    fun time(multiplier: Int): Dollar = Dollar(multiplier * amount)
}
