package OmprakashChavan;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String s = "blue";
		String f = "blue shoes";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://askomdch.com/");
		driver.findElement(By.xpath("(//ul[@id='ast-hf-menu-1'])[1]/li[2]/a")).click();
		driver.findElement(By.xpath("//input[@id='woocommerce-product-search-field-0']")).sendKeys("blue");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,300)");
		String d = driver.findElement(By.xpath("//header[@class='woocommerce-products-header']/h1")).getText();
		System.out.println(d);
		if (d.contains(s)) {

			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		List<WebElement> g = driver.findElements(By.xpath("//h2[@class='woocommerce-loop-product__title']"));

		for (int i = 0; i <= g.size() - 1; i++) {

			if (g.get(i).getText().equalsIgnoreCase(f)) {
				g.get(i).click();
				break;
			}
		}

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@class='button wc-forward'])[3]")).click();

		String j = driver.findElement(By.xpath("//td[@class='product-name']")).getText();
		System.out.println(j);
		if (StringUtils.containsIgnoreCase(j, s)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		
		driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']")).click();

	}

}
