package testNG_Luma_Proj_Maincls_R;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestNG_Main_Pom_page1_R {

	
	// driver 
	public static WebDriver driver;
	
	@FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
	private WebElement sighhinn;
	public WebElement getSighhinn() {
		return sighhinn;
	}

	
	
	@FindBy(xpath = "//*[@id=\"email\"]")
	private WebElement emaill;
	public WebElement getEmaill() {
		return emaill;
	}

	@FindBy(id = "pass")
	private WebElement passwrd;
	public WebElement getPasswrd() {
		return passwrd;
	}




	@FindBy(id = "send2")
	private WebElement signinn;
	public WebElement getSigninn() {
		return signinn;
	}


	
	
	
	
	public TestNG_Main_Pom_page1_R(WebDriver driver1) {

		driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	
	
}
