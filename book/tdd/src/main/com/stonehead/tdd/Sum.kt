package com.stonehead.tdd

class Sum (val addend: Money, val augend: Money): Expression {
    override fun reduce(bank: Bank, to: String): Money {
        return Money(augend.amount + addend.amount, to)
    }
}
