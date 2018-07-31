package com.stonehead.tdd

open class Money(protected val amount: Int, protected val currency: String) {

    override fun equals(other: Any?): Boolean {
        val money = (other as Money)
        return amount == money.amount
            && currency() == money.currency()
    }


    fun time(multiplier: Int): Money = Money(multiplier * amount, currency)

    fun currency(): String = this.currency

    override fun toString(): String = "$amount $currency"

    fun plus(addend: Money): Money {
        return Money(amount + addend.amount, currency)
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
