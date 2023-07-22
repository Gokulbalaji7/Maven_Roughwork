package testNG_Luma_Proj_Maincls_R;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class TestNG_Main_Basic_cls_R {

	

	
	public static WebDriver driver;

	
	// launch
	public static WebDriver launch() {

		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		
		driver = new ChromeDriver(options);
		return driver; // we should type return

	}

	
	// url
	public static void url(String url) {
		driver.get(url);
	}

	
	// maximize

	public static void maximize() {

		driver.manage().window().maximize();
	}

	
	// sendkeys
	
	public static void sendkeys(WebElement element, String name) {

		element.sendKeys(name);
	}
	
	
	// userid

	public static void userid(WebElement element, String name) {

		element.sendKeys(name);
	}

	
	// passw
	
	public static void passw(WebElement elements, String name) {

		elements.sendKeys(name);
	}
	
	
	// dropdown select

	public static void selectbyvalue(WebElement element, String name) {

		Select s1 = new Select(element);
		s1.selectByValue(name);
	}

	
	public static void selectbyindex(WebElement element, int name) {

		Select s2 = new Select(element);
		s2.selectByIndex(name);
	}

	public static void selectbyvisibletext(WebElement element, String name) {

		Select s3 = new Select(element);
		s3.selectByVisibleText(name);
	}

	
	// deselect

	public static void deselectbyvalue(WebElement element, String name) {

		Select s4 = new Select(element);
		s4.deselectByValue(name);
	}

	
	// clear

	public static void clear(WebElement element) {

		element.clear();
	}

	
	// click mouse action
	
	public static void click(WebElement element) {

		Actions a = new Actions(driver);
		a.click(element).build().perform();
	}

	
	// robotkeyboard

	public static void robotkeyboard() throws Throwable {

		Robot ro = new Robot();

		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyRelease(KeyEvent.VK_DOWN);
	}

	
	// screenshot

	public static void screenshot(String location) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourcefilee = ts.getScreenshotAs(OutputType.FILE);
		File designationn = new File(location);
		FileUtils.copyFile(sourcefilee, designationn);
	}

	
	// waits

	public static void waits() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	
	// alert accept

	public static void alertaccept() {

		driver.switchTo().alert().accept();
	}

	
	// alert dismiss

	public static void alertdismiss() {

		driver.switchTo().alert().dismiss();
	}

	
	public static void navigatebackk() {

		driver.navigate().back();
		
	}
	
	

	public static void navigateforwardd() {

		driver.navigate().forward();
		
	}

	
	public static void refreshh() {

		driver.navigate().refresh();
		
	}
	
	
	public static void scrolldownn() {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,1800)");
	}
	
	
	public static void scrollupp() {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,-1800)");
	}
	
	

	public static void scrolldownhh() {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,700)");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
/* 
 * user id - gokul123@gmail.com
 * password - gokul123@
  
  
 * name - Gokul R
  
 * addrss below
no 777
cdm
cdm, California, 12345
United States
T: 987654321

 */
	
	

