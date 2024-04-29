package Test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objectMode.RegPgObject;

import java.io.IOException;

import org.apache.poi.sl.usermodel.ObjectShape;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import resource.baseCL;
import resource.same;

public class verifyTestCase extends baseCL {
	
	@Test
	public void verifyregwithvalidData() throws IOException, InterruptedException {
		
	
		
		RegPgObject rpo=new RegPgObject(driver);
		
		rpo.ClickonMyAccount().click();
		rpo.ClickonRegister().click();
		rpo.enterFirstName().sendKeys(same.firstname);
		rpo.enterLastName().sendKeys(same.lastname);
		rpo.enterEmail().sendKeys(mail);
		Thread.sleep(2000);
		rpo.enterTelephone().sendKeys(same.phone);
		rpo.enterPassword().sendKeys(same.password);
		rpo.enterConformPassword().sendKeys(same.conformpassword);
		rpo.ClickonCheckbox().click();
		rpo.ClickonSubmit().click();
		
		SoftAssert sa=new SoftAssert();
		
		String fnactual=driver.findElement(By.xpath("(//div[@class='text-danger'])[1]")).getText();
		String fnexpected="First Name must be between 1 and 32 characters!";
		
		String Lnactual=driver.findElement(By.xpath("(//div[@class='text-danger'])[2]")).getText();
		String Lnexpected="Last Name must be between 1 and 32 characters!";
		
		String mailactual=driver.findElement(By.xpath("(//div[@class='text-danger'])[3]")).getText();
		String mailexpected="First Name must be between 1 and 32 characters!";
		
		String tpactual=driver.findElement(By.xpath("(//div[@class='text-danger'])[4]")).getText();
		String tpexpected="Telephone must be between 3 and 32 characters!";
		
		String passactual=driver.findElement(By.xpath("(//div[@class='text-danger'])[5]")).getText();
		String passexpected="Telephone must be between 3 and 32 characters!";
		
		
		
		String actual=rpo.actualText().getText();
		String expected="Your Account Has Been Created!";
		
		sa.assertEquals(fnactual, fnexpected);
		sa.assertEquals(Lnactual, Lnexpected);
		sa.assertEquals(mailactual, mailexpected);
		sa.assertEquals(tpactual, tpexpected);
		sa.assertEquals(passactual, passexpected);
		
		
		sa.assertEquals(actual, expected);
		sa.assertAll();
		
	}

}
