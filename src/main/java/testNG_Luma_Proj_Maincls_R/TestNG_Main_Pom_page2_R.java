package testNG_Luma_Proj_Maincls_R;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestNG_Main_Pom_page2_R {

	
	public WebDriver driver;
	
	
	@FindBy(xpath = "//a[@class='level-top ui-corner-all']")
	private WebElement watssneww;
	public WebElement getWatssneww() {
		return watssneww;
	}


	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[4]/div/a/span/span/img")
	private WebElement herohoodie;
	public WebElement getHerohoodie() {
		return herohoodie;
	}

	
	@FindBy(xpath = "//*[@id=\"tab-label-reviews-title\"]")
	private WebElement reviewss;
	public WebElement getReviewss() {
		return reviewss;
	}

































	public TestNG_Main_Pom_page2_R(WebDriver driver2) {

		driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
}
