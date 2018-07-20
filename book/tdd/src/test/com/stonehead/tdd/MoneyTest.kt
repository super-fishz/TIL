package com.stonehead.tdd

import net.oddpoet.expect.extension.equal
import net.oddpoet.expect.should
import org.junit.Assert.*
import org.junit.Test

class MoneyTest {

    @Test
    fun `곱셈 테스트 - Dollar`() {
        // given
        val five = Money.dollar(5)

        // when

        // then
        five.time(2).should.equal(Money.dollar(10))
        five.time(3).should.equal(Money.dollar(15))
    }

    @Test
    fun `곱셈 테스트 - Franc`() {
        // given
        val five = Money.franc(5)

        // when

        // then
        five.time(2).should.equal(Money.franc(10))
        five.time(3).should.equal(Money.franc(15))
    }

    @Test
    fun `동등 테스트`() {
        // given
        val budget = 5

        // when

        // then
        assertTrue(Money.dollar(budget).equals(Money.dollar(budget)))
        assertTrue(Money.franc(budget).equals(Money.franc(budget)))
        assertTrue(Money.franc(budget).equals(Money.dollar(budget)))
    }

    @Test
    fun `통화 테스트`() {
        assertEquals("USD", Money.dollar(1).currency())
        assertEquals("CHF", Money.franc(1).currency())
    }
}