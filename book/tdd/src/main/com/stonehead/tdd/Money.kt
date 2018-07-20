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

    companion object {
        fun dollar(amount: Int) : Dollar {
            return Dollar(amount, "USD")
        }
        fun franc(amount: Int) : Franc {
            return Franc(amount, "CHF")
        }
    }
}
