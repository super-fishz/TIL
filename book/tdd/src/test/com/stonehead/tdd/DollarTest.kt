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
        val product = five.time(2)
        val product2 = five.time(3)

        // when

        // then
        product.should.equal(10)
        product2.should.equal(15)
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