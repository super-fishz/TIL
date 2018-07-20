package com.stonehead.tdd

abstract class Money(protected val amount: Int) {

    lateinit var currency: String
    // protected val currency: String

    override fun equals(other: Any?): Boolean {
        return amount == (other as Money).amount
    }


    fun currency(): String = this.currency

    companion object {
        fun dollar(amount: Int) : Dollar {
            return Dollar(amount, "USD")
        }
        fun franc(amount: Int) : Franc {
            return Franc(amount, "CHF")
        }
    }
}
