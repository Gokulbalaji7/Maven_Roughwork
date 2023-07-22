package testNG_Testcls_R;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_annotations_Testcls_R { // nama ipo run panomna class ku mela RunAll annotation automatic aa varum

// Dont create main class, without mainclass class will run by using annotations

	// we only type this @test thn retntype edutha (org.testng annotation) click this

	
	
	// for alignment cntrl + shift + f
	
	
	@Test
	private void car() {
		System.out.println("car");
	}

	@Test
	private void bike() {
		System.out.println("bike");
	}

	@Test
	private void cycle() {
		System.out.println("cycle");
	}

	@BeforeMethod
	private void bfrmethod() {
		System.out.println("bfrmethod");
	}

	@AfterMethod
	private void aftmethod() {
		System.out.println("aftmethod");
	}

	@BeforeClass
	private void bfrclass() {
		System.out.println("bfrclass");
	}

	@AfterClass
	private void aftclass() {
		System.out.println("aftclass");
	}

	@BeforeTest
	private void bfrtest() {
		System.out.println("bfrtest");
	}

	@AfterTest
	private void afttest() {
		System.out.println("afttest");
	}

	@BeforeSuite
	private void bfrsuite() {
		System.out.println("bfrsuite");
	}

	@AfterSuite
	private void aftsuite() {
		System.out.println("aftsuite");
	}

}
