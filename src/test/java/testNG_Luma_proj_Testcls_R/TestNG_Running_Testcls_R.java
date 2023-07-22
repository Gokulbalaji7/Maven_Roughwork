package testNG_Luma_proj_Testcls_R;

import org.openqa.selenium.WebDriver;

import testNG_Luma_Proj_Maincls_R.TestNG_Main_Basic_cls_R;
import testNG_Luma_Proj_Maincls_R.TestNG_Main_Pom_page1_R;
import testNG_Luma_Proj_Maincls_R.TestNG_Main_Pom_page2_R;



public class TestNG_Running_Testcls_R extends TestNG_Main_Basic_cls_R {

	
	
	public static WebDriver driver = launch();
	
	
	
	public static void main(String[] args) throws Throwable {

		
// page 1
		
		
		TestNG_Main_Pom_page1_R obj1 = new TestNG_Main_Pom_page1_R(driver);
		
		
		maximize();
		
		url("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
		
		userid(obj1.getEmaill(), "gokul123@gmail.com");

        passw(obj1.getPasswrd(), "gokul123@");	
        
		Thread.sleep(2000);
		
		click(obj1.getSigninn());
		
		waits();
	
		
		
// page 2
		
		
		TestNG_Main_Pom_page2_R obj2 = new TestNG_Main_Pom_page2_R(driver);
		
		click(obj2.getWatssneww());
		
		refreshh();
		
		Thread.sleep(2000);
		
		navigatebackk();
		waits();
		
		scrolldownn();
		Thread.sleep(2000);
		
//		scrollupp();
//		Thread.sleep(2000);
		
//		scrolldownn();
//		Thread.sleep(2000);
		
		
		obj2.getHerohoodie().click();
		Thread.sleep(2000);
		
		scrolldownhh();
		
		obj2.getReviewss().click();
		Thread.sleep(2000);
		
//		screenshot("C:\\Users\\gokul\\eclipse-workspace\\Maven_Roughwork\\Screenshot\\Review.png");
		
		navigatebackk();
		
		
		
		
		
		
		
		
		
		
		
	


}}
