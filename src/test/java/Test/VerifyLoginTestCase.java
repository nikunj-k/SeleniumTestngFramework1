package Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objectMode.RegPgObject;
import objectMode.loginPgObject;
import resource.baseCL;

public class VerifyLoginTestCase extends baseCL{

	@Test
	public void VerifyLogInwithValidData()throws IOException, InterruptedException{
		driverInitilization();
		driver.get("https://naveenautomationlabs.com/opencart/");
		RegPgObject rpo=new RegPgObject(driver);
		rpo.ClickonMyAccount().click();
		
	
		
		
		loginPgObject lpo=new loginPgObject(driver);
		lpo.ClickonLogin().click();
		
		lpo.enterEmail().sendKeys("x");
		Thread.sleep(2000);
		lpo.enterPassword().sendKeys("secure");
		lpo.Clickonsubmit().click();
		
		SoftAssert sa=new SoftAssert();
		String Wactual=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		String Wexpected=" Warning: No match for E-Mail Address and/or Password.";
				
		String Actual=driver.findElement(By.xpath("//h2[text()='My Account']")).getText();
		String Expected="My Account";
		sa.assertEquals(Actual, Expected);
		sa.assertEquals(Wactual, Wexpected);
		sa.assertAll();
	}
}
