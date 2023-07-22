package j_unit_Testcls_R;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class J_unit_Testcls_R {

// Dont create main class, without mainclass class will run by using annotations
// we only type this @Test retntype edutha (org.junit) varum apram adhuva mela import agita delete panitu
// test la error katum then cursor aa test mela vacha Add junit4 library files nu kekum adha kodukanum

	
	
	 //   	  @Test
 	 //	    private void home() {
	 //	  	  System.out.println("homepage");
	 //	    }

	
	
	// ippo idha run panna test fail agum bec it is private see left side failure
	// trace
	// method only should be in public
	
//** imp ** method ulla click panitu then run panna kudadhu method ku velila click panitu dhn run pananum

	
	
	@Test
	public void gokul() { // change private to public then test succesfully run
		System.out.println("gokul");
	}

	@Test
	public void bike() {
		System.out.println("bike");
	}

	@Test
	public void apple() {
		System.out.println("apple");
	}

	@Before
	public void login() {
		System.out.println("login");
	}

	@After
	public void logout() {
		System.out.println("logout");
	}

	@BeforeClass
	public static void browser() { // in beforeclass we add static in method
		System.out.println("browser");
	}

	@AfterClass
	public static void exit() { // in afterclass we add static in method
		System.out.println("exit");
	}

}
