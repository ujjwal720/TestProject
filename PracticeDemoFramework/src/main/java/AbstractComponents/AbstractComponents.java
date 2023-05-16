package AbstractComponents;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponents {
	WebDriver driver;
	
	public AbstractComponents(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	
	public void waitElement(By findby) {
		
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(findby));
	}
	
	public void actions(WebElement target) {
		Actions s=new Actions(driver);
		s.moveToElement(target).click().build().perform();
		
		
	}
	
	public void waitElement2(By findby) {
		
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(findby));
	}
	
	public void jsexec(WebElement c) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", c);
	}
	
	public void scroll() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		  jse.executeScript("window.scrollTo(0, document.body.scrollHeight)","");
	}
	
	
	

	
}
