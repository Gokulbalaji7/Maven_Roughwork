package maven_adactin_Maincls_R;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Maven_Main_Pom_page4_R {

	
	public WebDriver driver;
	
	
	@FindBy(id="first_name")
	private WebElement firstnamee;
	public WebElement getFirstnamee() {
		return firstnamee;
	}

	@FindBy(id="last_name")
	private WebElement lastnamee;
	public WebElement getLastnamee() {
		return lastnamee;
	}
	
	@FindBy(id="address")
	private WebElement adresss;
	public WebElement getAdresss() {
		return adresss;
	}
	
	@FindBy(id="cc_num")
	private WebElement ccnumm;
	public WebElement getCcnumm() {
		return ccnumm;
	}
	
	@FindBy(id="cc_type")
	private WebElement cctypee;
	public WebElement getCctypee() {
		return cctypee;
	}
	
	@FindBy(id="cc_exp_month")
	private WebElement ccexpmnthh;
	public WebElement getCcexpmnthh() {
		return ccexpmnthh;
	}
	
	@FindBy(id="cc_exp_year")
	private WebElement ccexpyrr;
	public WebElement getCcexpyrr() {
		return ccexpyrr;
	}
	
	@FindBy(id="cc_cvv")
	private WebElement cvvv;
	public WebElement getCvvv() {
		return cvvv;
	}

	@FindBy(id="book_now")
	private WebElement booknoww;
	public WebElement getBooknoww() {
		return booknoww;
	}
	
	public Maven_Main_Pom_page4_R(WebDriver driver4) {
		driver=driver4;
		PageFactory.initElements(driver, this);
	}
	
	
}
