package Com.takeScreenShotfromError;

import java.io.File;
import java.io.IOException;

import javax.security.auth.login.FailedLoginException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;
	
	public static void initialize() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/zeynabbabaei/Desktop/Selenium-WebDriver/BrowserDrivers/chromedriver100");
		driver = new ChromeDriver();

		driver.get("http://demo-store.seleniumacademy.com/");
		driver.manage().window().maximize();
	 
	}
	
	
	public static void screenMethod(String methodName) throws IOException {
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File desFile = new File("/Users/zeynabbabaei/eclipse-workspace/Maven2/"
				+ "src/test/java/Com/takeScreenShotfromError/FaildtesShots/"
				+ methodName+ ".jpg");
		FileUtils.copyFile(srcFile, desFile);
	}
}
