package TestComponents;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentRepor {

	public static ExtentReports getmethod() {
	String path="C:\\Users\\DELL\\eclipse-workspace\\PracticeDemoFramework\\index1.html";
	ExtentSparkReporter r=new ExtentSparkReporter(path);
    r.config().setDocumentTitle("Ujjwal");
    r.config().setReportName("Ujjwals");
    ExtentReports m=new ExtentReports();
    m.attachReporter(r);
    return m;
	}

}
