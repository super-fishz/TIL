package com.stonehead.tdd

class Dollar(amount: Int, currency: String) : Money(amount) {
    // private val currency: String

    // 음......
    init {
        this.currency = currency
    }

    fun time(multiplier: Int): Money = Money.dollar(multiplier * amount)
}
