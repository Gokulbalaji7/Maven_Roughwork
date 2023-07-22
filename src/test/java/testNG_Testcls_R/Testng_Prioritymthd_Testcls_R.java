package testNG_Testcls_R;

import org.testng.annotations.Test;

public class Testng_Prioritymthd_Testcls_R {

	// priority la rendu methods kum same value kodutha ASCII la eduthukum
	// priority edhume kodukalana default aa 0 la irukum appovum ASCII la eduthukum
	
	@Test(priority = -2)
	private void car() {
		System.out.println("car");
	}

	@Test(priority = -1)
	private void bike() {
		System.out.println("bike");
	}

	@Test
	private void cycle() {
		System.out.println("cycle");
	}

	@Test
	private void apple() {
		System.out.println("apple");
	}
	
	
}
