//: guru.springframework.GreatingTest.java


package guru.springframework;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class GreetingTest {

	private Greeting greeting;
	
	@BeforeAll
	public static void beforeClass() {
		System.out.println("Before - I am only called once.");
	}
	
	@BeforeEach
	void setUp() {
		System.out.println("In BeforeEach ... ");
		this.greeting = new Greeting();
	}
	
	@AfterEach
	void tearDown() {
		System.out.println("In AfterEach ... ");
	}
	
	@AfterAll
	public static void afterClass() {
		System.out.println("After !!! *** I am only called once. ***");
	}
	
	@Test
	void testHelloWorld() {
		System.out.println(this.greeting.helloWorld());
	}

	@Test
	void testHelloWorldString() {
		System.out.println(this.greeting.helloWorld("Yu"));
	}

}///:~