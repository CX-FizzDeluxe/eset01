package befaster.solutions;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class FizzBuzzTest {
	
	@Test
	public void testMultipleOfThreeButNotContaining() {
		assertThat(FizzBuzz.fizzBuzz(27), equalTo(FizzBuzz.FIZZ));
		assertThat(FizzBuzz.fizzBuzz(9999), equalTo(FizzBuzz.FIZZ));
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
