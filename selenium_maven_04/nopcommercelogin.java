package selenium_maven_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class nopcommercelogin {
	WebDriver driver;
nopcommercelogin (WebDriver driver){
		 this.driver =driver;
}

//locate elements
By Emails=By.xpath("//input[@name='Email']))");
By password=By.id("Password");
By rememberme=By.id("RememberMe");
By submit=By.xpath("//button[@class='button-1 login-button'])");
By Logo=By.xpath("//div[@class='header-logo']");

//Actions
public void setemail(String e) {
	driver.findElement(Emails).sendKeys(e);
}

public void setpassword(String Password) {
	 driver.findElement(password).sendKeys(Password);
}
public void click() {
	 driver.findElement(submit).click();
}
public Boolean Logo() {
	 boolean Log=driver.findElement(Logo).isDisplayed();
	 return  Log;
}
}

