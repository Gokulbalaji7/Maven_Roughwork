package maven_adactin_Maincls_R;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Maven_Main_Pom_page7_R {

	
	public WebDriver driver;
	
	
	@FindBy(id="logout")
	private WebElement logoutt;
	public WebElement getLogoutt() {
		return logoutt;
	}



	public Maven_Main_Pom_page7_R(WebDriver driver7) {
		driver=driver7;
		PageFactory.initElements(driver, this);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
