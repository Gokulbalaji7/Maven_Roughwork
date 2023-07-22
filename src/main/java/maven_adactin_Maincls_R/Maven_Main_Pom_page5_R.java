package maven_adactin_Maincls_R;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Maven_Main_Pom_page5_R {

	public WebDriver driver;
	
	@FindBy(id="my_itinerary")
	private WebElement myitryy;
	public WebElement getMyitryy() {
		return myitryy;
	}
	
	
	public Maven_Main_Pom_page5_R(WebDriver driver5) {
		driver=driver5;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
