package com.stonehead.tdd

class Bank {
    fun reduce(source: Expression, to: String): Money = source.reduce(to)
    fun addRate(from: String, to: String, rate: Int) {
    }
}
