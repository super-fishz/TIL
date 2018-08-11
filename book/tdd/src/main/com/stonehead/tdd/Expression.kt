package com.stonehead.tdd

interface Expression {
    fun reduce(bank: Bank, to: String): Money
}
