package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponents;

public class PaymentPage extends AbstractComponents {

	WebDriver driver;

	public PaymentPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//input[@class='input txt'])[1]")
	WebElement cvvno;

	@FindBy(xpath = "(//input[@class='input txt'])[2]")
	WebElement name;

	@FindBy(xpath = "//input[@placeholder='Select Country']")
	WebElement india;

	By auto = By.xpath("//button[@class='ta-item list-group-item ng-star-inserted']/span");
	
	@FindBy(xpath="//button[@class='ta-item list-group-item ng-star-inserted']/span")
	List<WebElement> suggest;
	
	@FindBy(xpath="//a[@class='btnn action__submit ng-star-inserted']")
	WebElement placeorder;

	public void name(String s) {

		name.sendKeys(s);
	}

	public void cvvno(String s) {
		cvvno.sendKeys(s);
	}

	public void shipping(String s) {
		india.sendKeys(s);

	}
	
	
	public void suggest() throws InterruptedException {

	for(int i=0;i<=suggest.size()-1;i++) {
	    String s=suggest.get(i).getText();
	    if (s.equalsIgnoreCase("india")) {
			suggest.get(i).click();
			Thread.sleep(3000);
		}
	}
	}
	
	public void placeorder() {
		WebElement x=driver.findElement(By.xpath("//a[@class='btnn action__submit ng-star-inserted']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", x);
	}
	
	public void placeorderclick() {
	
	}
	
	
	

}
