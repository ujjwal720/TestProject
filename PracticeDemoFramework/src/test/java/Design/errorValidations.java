package Design;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import TestComponents.BaseTest;



public class errorValidations extends BaseTest {

	
	@Test
	public void errors() throws IOException {
	        WebDriver driver;
			String k = "ZARA";
			driver=initializedriver();
			LandingPage j=new LandingPage(driver);
			j.Link();
			j.Logins("te@nmdfsfdgdfgdgdfail.com", "Admin@123");
			Assert.assertEquals("op","po");
			
	}
	
	
}
