package com.stonehead.tdd

open class Money(val amount: Int, val currency: String): Expression {

    override fun equals(other: Any?): Boolean {
        val money = (other as Money)
        return amount == money.amount
            && currency() == money.currency()
    }


    fun time(multiplier: Int): Money = Money(multiplier * amount, currency)

    fun reduce(to: String): Money = this

    fun currency(): String = this.currency

    override fun toString(): String = "$amount $currency"

    fun plus(addend: Money): Expression {
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
