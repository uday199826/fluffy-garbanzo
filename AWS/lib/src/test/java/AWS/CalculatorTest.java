package AWS;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorTest {

	private Calculator c = new Calculator();

	@Test
	public void addTest() {

		// System.out.println("testcase..");
		int actual1 = c.add(20, 30);
		assertEquals(50, actual1);

	}

	@Test
	public void testDivisionShouldReturnPositive() {

		int reuslt = c.divide(10, 5);
		assertEquals(2, reuslt);

	}

	@Test
	public void testDivisionShouldReturnNegative() {

		int reuslt = c.divide(10, -5);
		assertEquals(-2, reuslt);

	}

	@Test
	public void testDivisionShouldThrowArithmeticException() {

		Exception exception = assertThrows(ArithmeticException.class, () -> {
			c.divide(20, 0);
		});

		String expectedMessage = "/ by zero";
		String actualMessage = exception.getMessage();
		// System.out.println("exception " + exception);
		assertTrue(actualMessage.contains(expectedMessage));

	}

}
