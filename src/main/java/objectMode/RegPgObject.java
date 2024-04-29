package objectMode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegPgObject {

	public WebDriver driver;
	private By MyAccount=By.xpath("//a[@title='My Account']");
	private By Register=By.xpath("//a[text()='Register']");
	
	private By FirstName=By.xpath("//input[@name='firstname']");
	private By LastName=By.xpath("//input[@name='lastname']");
	private By Email=By.xpath("//input[@name='email']");
	private By Telephone=By.xpath("//input[@name='telephone']");
	private By Password=By.xpath("//input[@name='password']");
	private By Conformpassword=By.xpath("//input[@name='confirm']");
	private By Checkbox=By.xpath("//input[@name='agree']");
	private By Submit=By.xpath("//input[@type='submit']");   
	private By actualText=By.xpath("//h1[text()='Your Account Has Been Created!']");
	
	public RegPgObject(WebDriver driver2) {
	
		this.driver=driver2;
	}
	public WebElement ClickonMyAccount() {
		return driver.findElement(MyAccount);
			
	}
	public WebElement ClickonRegister() {
		return driver.findElement(Register);
	}
	public WebElement enterFirstName() {
		 return driver.findElement(FirstName);
	
	}
	public WebElement enterLastName() {
	 return driver.findElement(LastName);
	
	}public WebElement enterEmail() {
		 return driver.findElement(Email);
		
	}public WebElement enterTelephone() {
		return driver.findElement(Telephone);
		
	}public WebElement enterPassword() {
		 return driver.findElement(Password);
		
	}public WebElement enterConformPassword() {
		return driver.findElement(Conformpassword);
		
	}
	 public WebElement ClickonCheckbox() {
		return driver.findElement(Checkbox);
	}public WebElement ClickonSubmit() {
		return driver.findElement(Submit);
	}
	public WebElement actualText() {
		return driver.findElement(actualText);
	}
}
