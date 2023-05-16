package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponents;

public class LandingPage extends AbstractComponents {

public	WebDriver driver;

	
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='userEmail']")
	WebElement email;

	@FindBy(xpath = "//input[@id='userPassword']")
	WebElement password;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement Login;
	
	By toastermessager=By.xpath("(//div[@class='invalid-feedback'])[1]/div");
	
	
//////The following method is for the Login in the App.
	public void Logins(String a, String b) {
		email.sendKeys(a);
		password.sendKeys(b);
		Login.click();
	}
	
	//the following is to get Access of the website

	public void Link() {
      
		driver.get("https://rahulshettyacademy.com/client");
	}
	
	public String verfifytoastmessage() {
		
		waitElement(toastermessager);
		
		WebElement message=driver.findElement(By.xpath("//div[@class='invalid-feedback'])[1]/div"));
		
		String result=message.getText();
		
		return result;
		
	}


}
