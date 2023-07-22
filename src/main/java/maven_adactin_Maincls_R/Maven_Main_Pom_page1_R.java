package maven_adactin_Maincls_R;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Maven_Main_Pom_page1_R {

	

	// driver
	
	public static WebDriver driver;      // we should write this line
	
	
	@FindBy(id="username")
	private WebElement username;  //------> we should write this line
	public WebElement getUsername() {    // then rightclick in private -> source -> Generate GETTERS AND SETTERS
		return username;                 // then select ref name and click generate
	}                                    // then delete setters


	@FindBy(id="password")
	private WebElement passwrd;
	public WebElement getPasswrd() {
		return passwrd;
	}


	@FindBy(id="login")
	private WebElement login;   //-----> we should write this line
	public WebElement getLogin() {    // then rightclick in private -> source -> Generate GETTERS AND SETTERS
		return login;                 // then select ref name and click generate
	}                                 // then delete setters
	
	
	
	public Maven_Main_Pom_page1_R(WebDriver driver1) { // type only class name then cntl+space click constructor
		                                               // thn type inside the braces() -> webdriver use pani indha class aa apdiye oru ref name ulla save pandrom
	
		driver = driver1;                              // ipo class level aa irukra webdriver um mela nama save panirkura ref name um equal pandrom so ipo rendume same agidchu
		PageFactory.initElements(driver, this);        // type pagefactory then give dot. thn click initElements element locator factory object , this na indha page nu artham
		
	}
	
	
}
