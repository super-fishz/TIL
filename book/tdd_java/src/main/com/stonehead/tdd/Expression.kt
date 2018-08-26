package com.stonehead.tdd

interface Expression {
    fun reduce(bank: Bank, to: String): Money
    fun plus(addend: Expression): Expression
    fun times(multiplier: Int): Expression
}
