package Design;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import PageObjects.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StandaloneTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String k = "ZARA";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		LandingPage j=new LandingPage(driver);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("test@nmail.com");
		driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='toast-container']")));
		String s = driver.findElement(By.xpath("//div[@id='toast-container']")).getText();

		System.out.println(s);

		List<WebElement> x = driver.findElements(By.xpath("//div[@class='card']/div/h5"));
		
		for (int i = 0; i < x.size() - 1;i++) {
			
			System.out.println(x.get(i).getText());
			{
				driver.findElement(By.xpath("//button[@class='btn w-10 rounded']")).click();
				break;
			}

		}

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='toast-container']")));
		String d = driver.findElement(By.xpath("//div[@role='alertdialog']")).getText();

		System.out.println(d);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='btn btn-custom'])[3]")));
		driver.findElement(By.xpath("(//button[@class='btn btn-custom'])[3]")).click();

		List<WebElement> z = driver.findElements(By.xpath("//div[@class='cartSection']/h3"));

		for (int m = 0; m <= z.size() - 1; m++) {
			String a = z.get(m).getText();
			if (a.contains(s)) {
				boolean d1 = true;
				Assert.assertTrue(d1);
				System.out.println("it is working");
				break;
			}
		}

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Checkout']")));
		driver.findElement(By.xpath("//button[normalize-space()='Checkout']")).click();

		driver.findElement(By.xpath("//input[@placeholder='Select Country']")).sendKeys("India");
		List<WebElement> o = driver
				.findElements(By.xpath("//button[@class='ta-item list-group-item ng-star-inserted']/span"));

		for (int l = 0; l <= o.size() - 1; l++) {
			String h = o.get(l).getText();
			if (h.equalsIgnoreCase("india")) {
				o.get(l).click();
			}
		}
        
	
        driver.findElement(By.xpath("(//input[@class='input txt'])[1]")).sendKeys("1234");
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//input[@class='input txt'])[2]")).sendKeys("Ujjwal");
		driver.findElement(By.xpath("//input[@name='coupon']")).sendKeys("RahulSheety");
		WebElement c=driver.findElement(By.xpath("//a[@class='btnn action__submit ng-star-inserted']"));
		jse.executeScript("arguments[0].scrollIntoView()", c);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='btnn action__submit ng-star-inserted']")).click();
		
	
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='hero-primary']")));
		String l=driver.findElement(By.xpath("//h1[@class='hero-primary']")).getText();
		
		System.out.println(l);

	}

}
