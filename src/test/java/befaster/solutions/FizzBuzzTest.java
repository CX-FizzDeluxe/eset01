package befaster.solutions;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class FizzBuzzTest {
	
	@Test
	public void testDeluxe() {
		assertTrue(FizzBuzz.numberIsDeluxe(88));
		assertFalse(FizzBuzz.numberIsFakeDeluxe(88));
		assertTrue(FizzBuzz.numberIsDeluxe(44));
		assertFalse(FizzBuzz.numberIsFakeDeluxe(44));
	}
	
	@Test
	public void testFakeDeluxe() {
		assertTrue(FizzBuzz.numberIsFakeDeluxe(777));
		assertTrue(FizzBuzz.numberIsFakeDeluxe(33));
		assertTrue(FizzBuzz.numberIsFakeDeluxe(9999));
		assertTrue(FizzBuzz.numberIsFakeDeluxe(55));
		assertTrue(FizzBuzz.numberIsFakeDeluxe(5555));
	}
	
	@Test
	public void testNotDeluxe() {
		assertFalse(FizzBuzz.numberIsDeluxe(3));
		assertFalse(FizzBuzz.numberIsDeluxe(65));
		assertFalse(FizzBuzz.numberIsDeluxe(8275));
		assertFalse(FizzBuzz.numberIsDeluxe(1112));
		assertFalse(FizzBuzz.numberIsDeluxe(3111));
		assertFalse(FizzBuzz.numberIsDeluxe(76));
	}
	
	@Test
	public void testMultipleOfThreeAndFakeDeluxe() {
		assertThat(FizzBuzz.fizzBuzz(33), equalTo(FizzBuzz.FIZZFAKEDELUXE));
		assertThat(FizzBuzz.fizzBuzz(9999), equalTo(FizzBuzz.FIZZFAKEDELUXE));
	}
	
	@Test
	public void testMultipleOfThreeAndDeluxe() {
		// any numbers?
		assertTrue(true);
	}
	
	@Test
	public void testMultipleOfFiveAndFakeDeluxe() {
		assertThat(FizzBuzz.fizzBuzz(55), equalTo(FizzBuzz.BUZZFAKEDELUXE));
		assertThat(FizzBuzz.fizzBuzz(5555), equalTo(FizzBuzz.BUZZFAKEDELUXE));
	}
	
	@Test
	public void testMultipleOfFiveAndTrueDeluxe() {
		// these don't exist
		assertTrue(true);
	}
	
	@Test
	public void testJustTrueDeluxe() {
		assertThat(FizzBuzz.fizzBuzz(88), equalTo(FizzBuzz.DELUXE));
		assertThat(FizzBuzz.fizzBuzz(44), equalTo(FizzBuzz.DELUXE));
	}
	
	@Test
	public void testJustFakeDeluxe() {
		assertThat(FizzBuzz.fizzBuzz(77), equalTo(FizzBuzz.FAKEDELUXE));
		assertThat(FizzBuzz.fizzBuzz(11), equalTo(FizzBuzz.FAKEDELUXE));
	}
	
	@Test
	public void testMultipleOfFiveAndThreeAndDeluxe() {
		// I don't think there are any numbers that satisfy this criteria between 1 and 9999
		assertThat(FizzBuzz.fizzBuzz(555), equalTo(FizzBuzz.FIZZBUZZFAKEDELUXE));
	}
	
	@Test
	public void testMultipleOfThreeButNotContaining() {
		assertThat(FizzBuzz.fizzBuzz(27), equalTo(FizzBuzz.FIZZ));
		assertThat(FizzBuzz.fizzBuzz(9), equalTo(FizzBuzz.FIZZ));
	}
	
	@Test
	public void testMultipleOfThreeAndContaining() {
		assertThat(FizzBuzz.fizzBuzz(3), equalTo(FizzBuzz.FIZZ));
		assertThat(FizzBuzz.fizzBuzz(63), equalTo(FizzBuzz.FIZZ));
	}
	
	@Test
	public void testContainsThreeButNotMultiple() {
		assertThat(FizzBuzz.fizzBuzz(13), equalTo(FizzBuzz.FIZZ));
		assertThat(FizzBuzz.fizzBuzz(37), equalTo(FizzBuzz.FIZZ));
		assertThat(FizzBuzz.fizzBuzz(103), equalTo(FizzBuzz.FIZZ));
	}
	
	@Test
	public void testMultipleOfFiveButNotContaining() {
		// this can't be tested because all multiples of 5 contain 5
		assertTrue(true);
	}
	
	@Test
	public void testMultipleOfFiveAndContaining() {
		assertThat(FizzBuzz.fizzBuzz(5), equalTo(FizzBuzz.BUZZ));
		assertThat(FizzBuzz.fizzBuzz(50), equalTo(FizzBuzz.BUZZ));
		assertThat(FizzBuzz.fizzBuzz(65), equalTo(FizzBuzz.BUZZ));
		assertThat(FizzBuzz.fizzBuzz(9995), equalTo(FizzBuzz.BUZZ));
	}
	
	@Test
	public void testContainsFiveButNotMultiple() {
		assertThat(FizzBuzz.fizzBuzz(56), equalTo(FizzBuzz.BUZZ));
		assertThat(FizzBuzz.fizzBuzz(7751), equalTo(FizzBuzz.BUZZ));
	}
	
	@Test
	public void testMultipleOfBoth() {
		assertThat(FizzBuzz.fizzBuzz(15), equalTo(FizzBuzz.FIZZBUZZ));
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
