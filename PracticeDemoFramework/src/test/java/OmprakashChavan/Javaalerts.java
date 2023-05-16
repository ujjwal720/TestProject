package OmprakashChavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javaalerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Ujjwal");
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		String s=driver.switchTo().alert().getText();
		System.out.println(s);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		System.out.println("Alerts is handeled in selenum");

	}

}
