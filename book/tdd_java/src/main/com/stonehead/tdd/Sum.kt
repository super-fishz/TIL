package com.stonehead.tdd

class Sum (val addend: Expression, val augend: Expression): Expression {
    override fun plus(addend: Expression): Expression {
        return Sum(this, addend)
    }

    override fun reduce(bank: Bank, to: String): Money {
        return Money(augend.reduce(bank, to).amount + addend.reduce(bank, to).amount, to)
    }

    override fun times(multiplier: Int): Expression {
        return Sum(augend.times(multiplier), addend.times(multiplier))
    }
}
