package TestComponents;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screen {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver s=new ChromeDriver();
		s.manage().window().maximize();
		s.get("https://www.google.com/");
		TakesScreenshot k=((TakesScreenshot)s);
		File x=new File("C:\\Users\\ujjwal.shrivastava\\eclipse-workspace\\PracticeDemoFramework\\rs.png");
		File l=k.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(l, x);
		

	}

}
