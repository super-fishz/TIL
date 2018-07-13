package com.stonehead.tdd

class Dollar(var amount: Int) {

    fun time(multiplier: Int) {
        amount *= multiplier
    }
}
