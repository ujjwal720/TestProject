package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponents;

public class ThanksPage extends AbstractComponents {
          WebDriver driver;
	public ThanksPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[@class='hero-primary']")
	WebElement head;
	
	
	public void heading() {
		System.out.println(head.getText());
	}

}
