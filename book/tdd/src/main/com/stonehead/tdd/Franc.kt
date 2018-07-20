package com.stonehead.tdd

class Franc(amount: Int, currency: String) : Money(amount) {
    // private val currency: String

    // 음......
    init {
        this.currency = currency
    }

    fun time(multiplier: Int): Money = franc(multiplier * amount)
}
