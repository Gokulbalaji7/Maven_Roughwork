package testNG_Luma_proj_Testcls_R;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import testNG_Luma_Proj_Maincls_R.TestNG_Main_Basic_cls_R;
import testNG_Luma_Proj_Maincls_R.TestNG_Main_Pom_page1_R;

public class TestNG_Running2_Testcls_R extends TestNG_Main_Basic_cls_R {

	
	public static WebDriver driver = launch();
	
	TestNG_Main_Pom_page1_R	page1 = new TestNG_Main_Pom_page1_R(driver);

	
	
	
	@Test(priority = 1)
	private void url() {
		url("https://magento.softwaretestingboard.com/");	
	maximize();
	}
	
	
	
	@Test
	public void browser() {
		
	
	click(page1.getSigninn());
	userid(page1.getEmaill(), "gokul123@gmail.com");
	passw(page1.getPasswrd(), "gokul123@");
	
	}
	
}
	
	
	
	
	
