package resource;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;


public class baseCL {
	
	public WebDriver driver;
	public Properties prop;
	public static String mail=generateMailId();
	
	public void driverInitilization() throws IOException {
		
		FileInputStream fis=new FileInputStream(
				System.getProperty("user.dir")+"src\\main\\java\\resource\\Data.properties");
		 prop=new Properties();
		
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			
			 driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("internet explorer")) {
			 driver=new InternetExplorerDriver();
		}else 
			System.out.println("choose proper driver value");
	    
	}
		
	public static String generateMailId() {
		return "abc"+ System.currentTimeMillis()+"@gamil.com";
	}
	@BeforeMethod
	public void laubnchBrowserAndurl() throws IOException {
		driverInitilization();
		
		driver.get(prop.getProperty("url"));
	}
}
