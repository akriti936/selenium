package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage2 {
	WebDriver driver;
	
	 Loginpage2(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	 //locate elements
	 @FindBy(className="orangehrm-login-logo")
	 WebElement logo;
	//username,password
	 
	 @FindBy(name="username")
	 WebElement user_name;
	 
	 @FindBy(name="password")
	 WebElement pass_word;
	 
	 @FindBy(xpath="//button[normalize-space()='Login']")
	 WebElement button;
	 
	 //actions
	 public void setusername(String username) {
		 user_name.sendKeys(username);
	 }
	 
	 public void setpassword(String password) {
		pass_word.sendKeys(password); 
	 }
	 
	 public void click() {
			button.click();
		 }
	 public boolean checklogo() {
			boolean b=logo.isDisplayed();
			return b;
		 }
	 
	 public void teardown() {
		 driver.close();
	 }
}