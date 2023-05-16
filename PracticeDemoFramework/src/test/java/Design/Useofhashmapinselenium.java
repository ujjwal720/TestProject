package Design;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Useofhashmapinselenium {
    
	@DataProvider
	public Object[][] dp() {
		
		Map<Object,Object> u=new HashMap<Object,Object>();
		u.put("email", "anshika");
		u.put("password","ujjwals");
		
		
		Map<Object,Object> ul=new HashMap<Object,Object>();
		ul.put("email", "anshika");
		ul.put("password","ujjwals");
	
		return new Object[][] {{u},{ul}};
		
	}
	
	
	@Test(dataProvider="dp")
	public void setupfacebook( Map<Object, Object> k) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String j=k.get("email").toString();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(j);
		
		
	}

}
