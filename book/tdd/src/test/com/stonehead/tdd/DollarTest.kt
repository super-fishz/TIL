package com.stonehead.tdd

import net.oddpoet.expect.expect
import net.oddpoet.expect.extension.equal
import net.oddpoet.expect.should
import org.junit.Assert.*
import org.junit.Test

class DollarTest {

    @Test
    fun `곱셈 테스트`() {
        // given
        val five = Dollar(5)

        // when

        // then
        five.time(2).should.equal(Dollar(10))
        five.time(3).should.equal(Dollar(15))
    }

    @Test
    fun `동등 테스트`() {
        // given
        val budget = 5

        // when

        // then
        assertTrue(Dollar(budget) == Dollar(budget))
    }
}