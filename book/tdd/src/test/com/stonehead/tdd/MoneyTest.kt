package com.stonehead.tdd

import net.oddpoet.expect.extension.equal
import net.oddpoet.expect.should
import org.junit.Assert.*
import org.junit.Test

class MoneyTest {

    @Test
    fun `곱셈 테스트 - Dollar`() {
        // given
        val five = Dollar(5)

        // when

        // then
        five.time(2).should.equal(Dollar(10))
        five.time(3).should.equal(Dollar(15))
    }

    @Test
    fun `곱셈 테스트 - Franc`() {
        // given
        val five = Franc(5)

        // when

        // then
        five.time(2).should.equal(Franc(10))
        five.time(3).should.equal(Franc(15))
    }

    @Test
    fun `동등 테스트`() {
        // given
        val budget = 5

        // when

        // then
        assertTrue(Dollar(budget) == Dollar(budget))
        assertTrue(Franc(budget) == Franc(budget))
    }
}