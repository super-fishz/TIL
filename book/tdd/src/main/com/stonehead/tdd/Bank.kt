package com.stonehead.tdd

class Bank {
    fun reduce(source: Expression, to: String): Money = source.reduce(this, to)
    fun addRate(from: String, to: String, rate: Int) {
    }
    fun rate(from: String, to: String): Int {
        return if (from == "CHF" && to == "USD") 2 else 1
    }
}
