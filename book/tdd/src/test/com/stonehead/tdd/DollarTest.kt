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
        five.time(2)

        // then
        five.amount.should.equal(10)
    }
}