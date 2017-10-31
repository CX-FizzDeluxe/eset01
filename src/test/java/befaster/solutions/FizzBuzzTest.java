package befaster.solutions;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class FizzBuzzTest {
	
	@Test
	public void testDeluxe() {
		assertTrue(FizzBuzz.numberIsDeluxe(30));
		assertFalse(FizzBuzz.numberIsFakeDeluxe(30));
		assertTrue(FizzBuzz.numberIsDeluxe(50));
		assertFalse(FizzBuzz.numberIsFakeDeluxe(50));
		assertTrue(FizzBuzz.numberIsDeluxe(550));
		assertFalse(FizzBuzz.numberIsFakeDeluxe(550));
		assertTrue(FizzBuzz.numberIsDeluxe(6650));
		assertFalse(FizzBuzz.numberIsFakeDeluxe(6650));
	}
	
	@Test
	public void testFakeDeluxe() {
		assertTrue(FizzBuzz.numberIsFakeDeluxe(3));
		assertTrue(FizzBuzz.numberIsFakeDeluxe(33));
		assertTrue(FizzBuzz.numberIsFakeDeluxe(55));
		assertTrue(FizzBuzz.numberIsFakeDeluxe(5555));
		assertTrue(FizzBuzz.numberIsFakeDeluxe(65));
		assertTrue(FizzBuzz.numberIsFakeDeluxe(3111));
		assertTrue(FizzBuzz.numberIsFakeDeluxe(8275));
	}
	
	@Test
	public void testNotDeluxe() {
		assertFalse(FizzBuzz.numberIsDeluxe(1112));
		assertFalse(FizzBuzz.numberIsDeluxe(76));
		assertFalse(FizzBuzz.numberIsFakeDeluxe(9999));
		assertFalse(FizzBuzz.numberIsFakeDeluxe(777));
	}
	
	@Test
	public void testMultipleOfThreeAndFakeDeluxe() {
		assertThat(FizzBuzz.fizzBuzz(3), equalTo(FizzBuzz.FIZZFAKEDELUXE));
		assertThat(FizzBuzz.fizzBuzz(33), equalTo(FizzBuzz.FIZZFAKEDELUXE));
	}
	
	@Test
	public void testMultipleOfThreeAndDeluxe() {
		// no longer exists
				for (int i = 1; i < 1000; i++) {
					assertFalse(FizzBuzz.fizzBuzz(i).equals(FizzBuzz.FIZZDELUXE));
				}
	}
	
	@Test
	public void testMultipleOfFiveAndFakeDeluxe() {
		assertThat(FizzBuzz.fizzBuzz(55), equalTo(FizzBuzz.BUZZFAKEDELUXE));
		assertThat(FizzBuzz.fizzBuzz(5555), equalTo(FizzBuzz.BUZZFAKEDELUXE));
	}
	
	@Test
	public void testMultipleOfFiveAndTrueDeluxe() {
		assertThat(FizzBuzz.fizzBuzz(550), equalTo(FizzBuzz.BUZZFAKEDELUXE));
		assertThat(FizzBuzz.fizzBuzz(5550), equalTo(FizzBuzz.BUZZFAKEDELUXE));
		assertThat(FizzBuzz.fizzBuzz(560), equalTo(FizzBuzz.BUZZFAKEDELUXE));
		assertThat(FizzBuzz.fizzBuzz(50), equalTo(FizzBuzz.BUZZFAKEDELUXE));
		assertThat(FizzBuzz.fizzBuzz(5), equalTo(FizzBuzz.BUZZFAKEDELUXE));
		assertThat(FizzBuzz.fizzBuzz(65), equalTo(FizzBuzz.BUZZFAKEDELUXE));
		assertThat(FizzBuzz.fizzBuzz(9995), equalTo(FizzBuzz.BUZZFAKEDELUXE));
	}
	
	@Test
	public void testJustTrueDeluxe() {
		// no longer exists
		for (int i = 1; i < 1000; i++) {
			assertFalse(FizzBuzz.fizzBuzz(i).equals(FizzBuzz.DELUXE));
		}
	}
	
	@Test
	public void testJustFakeDeluxe() {
		// no longer exists
		for (int i = 1; i < 1000; i++) {
			assertFalse(FizzBuzz.fizzBuzz(i).equals(FizzBuzz.FAKEDELUXE));
		}
	}
	
	@Test
	public void testMultipleOfFiveAndThreeAndDeluxe() {
		assertThat(FizzBuzz.fizzBuzz(555), equalTo(FizzBuzz.FIZZBUZZFAKEDELUXE));
		for (int i = 1; i < 1000; i++) {
			assertFalse(FizzBuzz.fizzBuzz(i).equals(FizzBuzz.FIZZBUZZDELUXE));
		}
	}
	
	@Test
	public void testMultipleOfThreeButNotContaining() {
		assertThat(FizzBuzz.fizzBuzz(27), equalTo(FizzBuzz.FIZZ));
		assertThat(FizzBuzz.fizzBuzz(9), equalTo(FizzBuzz.FIZZ));
	}
	
	@Test
	public void testMultipleOfThreeAndContaining() {
		assertThat(FizzBuzz.fizzBuzz(63), equalTo(FizzBuzz.FIZZFAKEDELUXE));
	}
	
	@Test
	public void testContainsThree() {
		assertTrue(FizzBuzz.numberContainsDigit(63, "3"));
	}
	
	@Test
	public void testContainsThreeButNotMultiple() {
		assertThat(FizzBuzz.fizzBuzz(13), equalTo(FizzBuzz.FIZZ));
		assertThat(FizzBuzz.fizzBuzz(37), equalTo(FizzBuzz.FIZZ));
		assertThat(FizzBuzz.fizzBuzz(103), equalTo(FizzBuzz.FIZZ));
		assertThat(FizzBuzz.fizzBuzz(9999), equalTo(FizzBuzz.FIZZ));
	}
	
	@Test
	public void testMultipleOfFiveButNotContaining() {
		// this can't be tested because all multiples of 5 contain 5
		assertTrue(true);
	}
	
	@Test
	public void testMultipleOfFiveAndContaining() {
		assertThat(FizzBuzz.fizzBuzz(50), equalTo(FizzBuzz.BUZZDELUXE));
		
	}
	
	@Test
	public void testContainsFiveButNotMultiple() {
		assertThat(FizzBuzz.fizzBuzz(56), equalTo(FizzBuzz.BUZZ));
		assertThat(FizzBuzz.fizzBuzz(7751), equalTo(FizzBuzz.BUZZ));
	}
	
	@Test
	public void testMultipleOfBoth() {
		assertThat(FizzBuzz.fizzBuzz(15), equalTo(FizzBuzz.FIZZBUZZFAKEDELUXE));
		assertThat(FizzBuzz.fizzBuzz(60), equalTo(FizzBuzz.FIZZBUZZ));
		assertThat(FizzBuzz.fizzBuzz(120), equalTo(FizzBuzz.FIZZBUZZ));
	}
	
	@Test
	public void testNotMultipleNotContaining() {
		assertThat(FizzBuzz.fizzBuzz(1), equalTo("1"));
		assertThat(FizzBuzz.fizzBuzz(9998), equalTo("9998"));
		assertThat(FizzBuzz.fizzBuzz(47), equalTo("47"));
	}

}
