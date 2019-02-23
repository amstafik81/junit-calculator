

import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator classUnderTest;
	
	@Before
	public void setUp() {
		System.out.println("Metoda zostanie wykonana przed kazdym testem");
		classUnderTest = new Calculator();
	}
		
	@After
	public void tearDown() {
		System.out.println("Metoda zostanie wykonana po kazdym tescie");
	}
	
	@Test
	public void testDodawania() throws Exception {
		System.out.println("Metoda testowa");
		double a=1.0;
		double b=3.5;
		double expected=4.5;
		double actual=classUnderTest.sum(a,b);
		Assert.assertEquals(expected,actual,0.001);
	}
	@Test
	public void testOdejmowania() throws Exception {
		System.out.println("Metoda testowa");
		double a=4.0;
		double b=3.5;
		double expected=0.5;
		double actual=classUnderTest.subtract(a,b);
		Assert.assertEquals(expected,actual,0.001);
	}
	@Test
	public void testMnozenia() throws Exception {
		System.out.println("Metoda testowa");
		double a=2.0;
		double b=3.5;
		double expected=7.0;
		double actual=classUnderTest.multiply(a,b);
		Assert.assertEquals(expected,actual,0.001);
	}
	@Test
	public void testDzielenia() throws Exception {
		System.out.println("Metoda testowa");
		double a=7.0;
		double b=0.0;
		double expected=3.5;
		double actual=classUnderTest.divide(a,b);
		Assert.assertEquals(expected,actual,0.001);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDzieleniaPrzezZero() {
		double a=4.0;
		double b=0;
		classUnderTest.divide(a,b);
	}
}
