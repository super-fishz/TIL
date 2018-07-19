package com.stonehead.tdd

open class Money(protected val amount: Int) {

    override fun equals(other: Any?): Boolean {
        return amount == (other as Money).amount
    }
}
