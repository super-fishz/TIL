package com.stonehead.tdd

import java.util.*

class Bank {
    private val rates = Hashtable<Pair, Int>()

    fun reduce(source: Expression, to: String): Money = source.reduce(this, to)
    fun addRate(from: String, to: String, rate: Int) {
        rates.put(Pair(from, to), rate)
    }

    fun rate(from: String, to: String): Int {
        return rates.get(Pair(from, to))!!
    }
}
