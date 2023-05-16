package RahulPractice;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ui {
	
	public class re {
		ExtentReports u;

		@BeforeTest
		public void fg() {
			String path = "C:\\Users\\DELL\\eclipse-workspace\\PracticeDemoFramework\\index1.html";

			ExtentSparkReporter t = new ExtentSparkReporter(path);
			t.config().setDocumentTitle("Ujjwal");
			t.config().setReportName("Take Care");
			u = new ExtentReports();
			u.attachReporter(t);
		}

		@Test
		public void sm() {
			u.createTest("Hellos");
			System.out.println("Ujwal");
			u.flush();
		}
		
	}
}


