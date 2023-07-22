package maven_adactin_Maincls_R;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Maven_Main_Pom_page2_R {

	public WebDriver driver;

	@FindBy(xpath="//*[@id=\"location\"]")
	private WebElement locatnn;	
	public WebElement getLocatn() {
		return locatnn;
	}
	

	@FindBy(id="hotels")
	private WebElement hotlss;
	public WebElement getHotls() {
		return hotlss;
	}

	@FindBy(id="room_type")
	private WebElement roomtyp;
	public WebElement getRoomtyp() {
		return roomtyp;
	}
	
	
	@FindBy(xpath="//*[@id=\"room_nos\"]")
	private WebElement roomnosss;
	public WebElement getRoomnosss() {
		return roomnosss;
	}
	

	@FindBy(id="datepick_in")
	private WebElement datepickinn;
	public WebElement getDatepikk() {
		return datepickinn;
	}
	
	
	@FindBy(id="datepick_out")
	private WebElement datepickoutt;
	public WebElement getDatepickoutt() {
		return datepickoutt;
	}
	
	@FindBy(id="adult_room")
	private WebElement adultroomm;
	public WebElement getAdultroomm() {
		return adultroomm;
	}
	
	@FindBy(id="child_room")
	private WebElement childroomm;
	public WebElement getChildroomm() {
		return childroomm;
	}
	
	@FindBy(id="Submit")
	private WebElement submitt;
	public WebElement getSubmitt() {
		return submitt;
	}




	public Maven_Main_Pom_page2_R(WebDriver driver2) { // type only class name then cntl+space click constructor
		
		driver = driver2;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	}
