package maven_mor_Rough;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maven_class1_R {

	public static void main(String[] args) throws Throwable {

		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		Thread.sleep(2000);

		driver.manage().window().maximize();

		TakesScreenshot ts = (TakesScreenshot) driver;

		File sourcefilee = ts.getScreenshotAs(OutputType.FILE);

		File designation = new File("C:\\Users\\gokul\\eclipse-workspace\\Maven_Roughwork\\Screenshot\\facebook.png");

		Thread.sleep(2000);

		FileUtils.copyFile(sourcefilee, designation);

//		Thread.sleep(2000);

//		driver.close();

	
		
		
		
	}

}
