package resource;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendManager {
	
	
	public static ExtentSparkReporter htmlReporter;
	public static ExtentReports extent ;
	public static ExtentTest test;
	
	public static void Setup(){
		
		htmlReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"src\\main\\java\\resource\\Data.properties");
		htmlReporter.config().setDocumentTitle("Automation Report");
		htmlReporter.config().setTheme(Theme.DARK);
		
		extent =new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("hostname", "localHost");
		extent.setSystemInfo("os", "win 11");
		extent.setSystemInfo("BrowserName", "hrome");
		extent.setSystemInfo("TestName", "test1");
		
		
		
		
	}
   public static void endreport() {
	   extent.flush();
   }
}
