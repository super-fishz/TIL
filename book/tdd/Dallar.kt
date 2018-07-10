class Dollar(val amount: Int) {

    fun times(multiplier: Int): Dallar = amount * multiplier
}


class DollarTest {

	@Test
	fun testMultiplication() {
		val five = Dallar(5)
		val ten = five.times(2);
		assertEquals(Dollar(5), five);
		assertEquals(Dollar(10), ten);

		Dollar fifteen = five.times(3);
		assertEquals(new Dollar(15), fifteen);
		assertEquals(new Dollar(5), five);
	}

	@Test
	fun testEquality() {
		assertTrue(Dollar(5).equals(Dollar(5)));
		assertFalse(Dollar(6).equals(Dollar(5)));
	}
}
