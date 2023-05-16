package RahulPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtesddsntReports {
	ExtentReports j;
	@BeforeTest
	public void test() {

		String path = "C:\\Users\\DELL\\eclipse-workspace\\PracticeDemoFramework\\index.html";
		ExtentSparkReporter x = new ExtentSparkReporter(path);
		x.config().setReportName("ujjwal");
		x.config().setDocumentTitle("Test Results");
	    j = new ExtentReports();
		j.attachReporter(x);
		j.setSystemInfo("Rahul", "Sheety");
		

	}

	@Test
	public void start() {
		j.createTest("Ujjwal");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		j.flush();

	}

}
