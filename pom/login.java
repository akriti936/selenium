package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
	WebDriver driver;
	//constructor
	//locate elements
	//actions/methods
	 login(WebDriver driver) {
	this.driver=driver;
}
	//locate elements
	 
	 By logo=By.className("orangehrm-login-logo");
	 By user_name=By.xpath("//input[@placeholder='Username']");
	 By Password=By.xpath("//input[@placeholder='Password']");
	 By clickbutton=By.xpath("//button[normalize-space()='Login']");

//Actions
	 
	 public void setUserName(String username) {
		 driver.findElement(user_name).sendKeys(username);
	 }
	 
	 public void setpassword(String password) {
		 driver.findElement(Password).sendKeys(password);
	 }
	 public void click() {
		 driver.findElement(clickbutton).click();
	 }
	 public Boolean Logo() {
		 boolean Logo=driver.findElement(logo).isDisplayed();
		 return  Logo;
	 }
}