package TestComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import PageObjects.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;




public class BaseTest {
	
	public static WebDriver driver;
	public LandingPage j;
     
  
	public WebDriver initializedriver() throws IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\DELL\\eclipse-workspace\\PracticeDemoFramework\\src\\main\\java\\Resources\\Resources.Properties");
		Properties p = new Properties();
		p.load(fis);
		String browser = p.getProperty("browser");

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("firefox")){
			//firefox code
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;
	}
	
	
	

	public void landingpage() throws IOException {
	
	 j=new LandingPage(driver);
     j.Link();
		
	}
	
	@AfterMethod
	public void close() {
		
		driver.close();
		
	}
	
	public void TakesScrrenshot() throws IOException {
		TakesScreenshot x=((TakesScreenshot)driver);
		File t= x.getScreenshotAs(OutputType.FILE);
		File r=new File("C:\\Users\\DELL\\eclipse-workspace\\PracticeDemoFramework\\Ujjw.png");
		FileUtils.copyFile(t,r);
	}

}
