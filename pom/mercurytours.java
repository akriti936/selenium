package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class mercurytours {
WebDriver driver;

 mercurytours(WebDriver driver){
	 this.driver =driver;
 }
//locate elements
 By logo=By.xpath("//div[@class='logo'])");
 By user_name=By.name("userName");
 By pass_word=By.name("password");
 By submit=By.name("submit");
 

//Actions
public void setUserName(String username) {
	 driver.findElement(user_name).sendKeys(username);
}

public void setpassword(String password) {
	 driver.findElement(pass_word).sendKeys(password);
}
public void click() {
	 driver.findElement(submit).click();
}
public Boolean Logo() {
	 boolean Logo=driver.findElement(logo).isDisplayed();
	 return  Logo;
}
}