package RahulPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advancexpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	/*
	 Parent sibling xpath
	 //header[@class='jumbotron text-center header_style']/div/button[1]/following-sibling::button[1]
	  * 
	  * child to parent
	  * //header[@class='jumbotron text-center header_style']/div/button[1]/parent::div
	  * 
	  * child to grandparent
	  * //header[@class='jumbotron text-center header_style']/div/button[1]/parent::div//parent::div/parent::header
	 */
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//header[@class='jumbotron text-center header_style']/div/button[1]/parent::div"));
		
	}

}
