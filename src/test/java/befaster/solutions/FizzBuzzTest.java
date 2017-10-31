package befaster.solutions;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class FizzBuzzTest {
	
	@Test
	public void testMultipleOfThree() {
		assertThat(FizzBuzz.fizzBuzz(3), equalTo(FizzBuzz.FIZZ));
		assertThat(FizzBuzz.fizzBuzz(27), equalTo(FizzBuzz.FIZZ));
		assertThat(FizzBuzz.fizzBuzz(63), equalTo(FizzBuzz.FIZZ));
		assertThat(FizzBuzz.fizzBuzz(9999), equalTo(FizzBuzz.FIZZ));
	}
	
	
	@Test
	public void testMultipleOfFive() {
		assertThat(FizzBuzz.fizzBuzz(5), equalTo(FizzBuzz.BUZZ));
		assertThat(FizzBuzz.fizzBuzz(50), equalTo(FizzBuzz.BUZZ));
		assertThat(FizzBuzz.fizzBuzz(65), equalTo(FizzBuzz.BUZZ));
		assertThat(FizzBuzz.fizzBuzz(9995), equalTo(FizzBuzz.BUZZ));
	}
	
	@Test
	public void testMultipleOfBoth() {
		assertThat(FizzBuzz.fizzBuzz(15), equalTo(FizzBuzz.FIZZBUZZ));
		assertThat(FizzBuzz.fizzBuzz(60), equalTo(FizzBuzz.FIZZBUZZ));
		assertThat(FizzBuzz.fizzBuzz(120), equalTo(FizzBuzz.FIZZBUZZ));
	}
	
	@Test
	public void testNotMultiple() {
		assertThat(FizzBuzz.fizzBuzz(1), equalTo("1"));
		assertThat(FizzBuzz.fizzBuzz(9998), equalTo("9998"));
		assertThat(FizzBuzz.fizzBuzz(37), equalTo("37"));
	}

}
