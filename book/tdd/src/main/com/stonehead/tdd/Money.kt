package com.stonehead.tdd

open class Money(val amount: Int, val currency: String): Expression {

    override fun equals(other: Any?): Boolean {
        val money = (other as Money)
        return amount == money.amount
            && currency() == money.currency()
    }


    fun time(multiplier: Int): Expression = Money(multiplier * amount, currency)

    override fun reduce(bank: Bank, to: String): Money {
        val rate = bank.rate(currency, to)

        return Money(amount / rate, to)
    }

    fun currency(): String = this.currency

    override fun toString(): String = "$amount $currency"

    override fun plus(addend: Expression): Expression {
        return Sum(this, addend)
    }

    companion object {
        fun dollar(amount: Int) : Money {
            return Money(amount, "USD")
        }
        fun franc(amount: Int) : Money {
            return Money(amount, "CHF")
        }
    }
}
