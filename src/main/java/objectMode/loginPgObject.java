package objectMode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPgObject {
	
	public WebDriver driver;
	
	private By Login=By.xpath("//a[text()='Login']");
	private By Email =By.xpath("//input[@name='email']");
    private By Password=By.xpath("//input[@name='password']");
    private By submit=By.xpath("//input[@type='submit']");
  
    
    

	



	public loginPgObject(WebDriver driver3) {
		this.driver=driver3;

	}
    public WebElement ClickonLogin() {
    	return driver.findElement(Login);
    }
	public WebElement enterEmail() {
    	return driver.findElement(Email);
    }
    public WebElement enterPassword() {
    	return driver.findElement(Password);
    }
    public WebElement Clickonsubmit() {
    	return driver.findElement(submit);
    }
}
