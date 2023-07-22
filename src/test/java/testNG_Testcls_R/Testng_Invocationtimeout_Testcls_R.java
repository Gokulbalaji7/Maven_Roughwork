package testNG_Testcls_R;

import org.testng.annotations.Test;

public class Testng_Invocationtimeout_Testcls_R {

	

	@Test(invocationTimeOut = 2000) //cntl + space click invocation timeout long Test
	private void car() throws Throwable {
		Thread.sleep(2000);
		System.out.println("car");
	}

	
	
	@Test(priority = -1)
	private void bike() {
		System.out.println("bike");
	}

	
	
	@Test(invocationTimeOut = 2000)
	private void cycle() {
		System.out.println("cycle");
	}

	
	
	@Test
	private void apple() {
		System.out.println("apple");
	}
	
	
	
	
	
	
	
}
