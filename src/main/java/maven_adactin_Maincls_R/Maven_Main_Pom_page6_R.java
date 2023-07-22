package maven_adactin_Maincls_R;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Maven_Main_Pom_page6_R {

	public WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"booked_form\"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]/input")
	private WebElement selcncll;
	public WebElement getSelcncll() {
		return selcncll;
	}
	
	@FindBy(name="cancelall")
	private WebElement cnclall;
	public WebElement getCnclall() {
		return cnclall;
	}
	


	public Maven_Main_Pom_page6_R(WebDriver driver6) {
		driver=driver6;
		PageFactory.initElements(driver, this);
	
	}
	
	
	
}
