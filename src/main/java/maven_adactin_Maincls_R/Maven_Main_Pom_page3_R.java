package maven_adactin_Maincls_R;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Maven_Main_Pom_page3_R {

	public WebDriver driver;

	
	@FindBy(id="radiobutton_0")
	private WebElement radiobuttonn;
	public WebElement getRadiobuttonn() {
		return radiobuttonn;
	}
	
	@FindBy(id="continue")
	private WebElement continuee;
	public WebElement getContinuee() {
		return continuee;
	}
	
	
	public Maven_Main_Pom_page3_R(WebDriver driver3) {
	
	driver = driver3;
	PageFactory.initElements(driver, this);


}}
