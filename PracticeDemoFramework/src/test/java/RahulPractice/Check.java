package RahulPractice;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Check {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> y=driver.findElements(By.xpath("//table[@class='gf-t']/tbody/tr/td/ul/li[2]/a"));
		System.out.println(y.size());
		for(int i=0;i<=y.size()-1;i++) {
		String url=	y.get(i).getAttribute("href");
		 HttpsURLConnection  x=(HttpsURLConnection)new URL(url).openConnection();
		 x.setRequestMethod("HEAD");
			
			
		}
		
		
		
		

	}

}
