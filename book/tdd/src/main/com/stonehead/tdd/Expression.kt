package com.stonehead.tdd

interface Expression {
    fun reduce(to: String): Money
}
