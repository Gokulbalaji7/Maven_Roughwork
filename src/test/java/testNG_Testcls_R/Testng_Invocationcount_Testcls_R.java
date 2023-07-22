package testNG_Testcls_R;

import org.testng.annotations.Test;

public class Testng_Invocationcount_Testcls_R {

	

	@Test(priority = -2)  
	private void car() {
		System.out.println("car");
	}

	@Test(priority = -1, invocationCount = 2 ) // type invoc then cntl + space click invocation count int test.
	private void bike() {
		System.out.println("bike");
	}

	@Test(invocationCount = 2)
	private void cycle() {
		System.out.println("cycle");
	}

	@Test
	private void apple() {
		System.out.println("apple");
	}
	
	
	
	
}
