package befaster.solutions;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class HelloTest {

	@Test
	public void helloWorldTest() {
		assertThat(Hello.hello("world"), equalTo("Hello, World!"));
		assertThat(Hello.hello(" world   "), equalTo("Hello, World!"));
	}
	
	@Test
	public void helloStrangerTest() {
		assertThat(Hello.hello("stranger"), equalTo("Hello, World!"));
		assertThat(Hello.hello("  stranger   "), equalTo("Hello, World!"));
	}
	
	@Test
	public void helloNooneTest() {
		assertThat(Hello.hello(""), equalTo("Hello, World!"));
		assertThat(Hello.hello("   "), equalTo("Hello, World!"));
		assertThat(Hello.hello(null), equalTo("Hello, World!"));
	}

}
