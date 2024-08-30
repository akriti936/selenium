package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register {
	WebDriver driver;
	
	 Register(WebDriver driver) {
	this.driver=driver;
}
	//locate elements
	 By header=By.xpath("//h1[normalize-space()='Register'])");
	 //By titleofdetails=By.xpath("//strong[normalize-space()='Your Personal Details'])");
	
	 By female=By.xpath("//input[@id='gender-female'])");
	 	 By first_name=By.xpath("//input[@id='FirstName']");
	 By Last_name=By.xpath("//input[@id='LastName'])");
	By dateofbirth_day=By.xpath("//select[@name='DateOfBirthDay'])");
	By dateofbirth_month=By.xpath("//select[@name='DateOfBirthMonth']))");
	By dateofbirth_year=By.xpath("//select[@name='DateOfBirthYear']))");
By Email=By.xpath("//input[@id='Email']))");
By Company_name=By.xpath("//input[@id='Company'])");
By Newsletter=By.xpath("//input[@id='Newsletter'])");
By Password=By.xpath("//input[@id='Password'])");
By Confirm_password=By.xpath("//input[@id='ConfirmPassword'])");
By register_button=By.xpath("//button[@id='register-button'])");

	 //Actions-----
public boolean  header() {

boolean boo=driver.findElement(header).isDisplayed();
return boo;
}


	


	
public void Femalebuttonselected() {
	driver.findElement(female).click();
}
	public void setFirstname(String firstname) {
		driver.findElement(first_name).sendKeys(firstname);
	}
	
	
	public void setLastname(String lastname) {
		driver.findElement(Last_name).sendKeys(lastname);
	}
	
	public void setdateofbirthday(String dobday) {
		driver.findElement(dateofbirth_day).sendKeys(dobday);
	}
	
	public void setdateofbirthmonth(String dobmonth) {
		driver.findElement(dateofbirth_month).sendKeys(dobmonth);
	}
	
	public void setdateofbirthyear(String dobyear) {
		driver.findElement(dateofbirth_month).sendKeys(dobyear);
	}
	public void setemail(String e) {
		driver.findElement(Email).sendKeys(e);
	}
	public void setcompanyname(String c) {
		driver.findElement(Company_name).sendKeys(c);
	}
	public void News_letterenabled() {
		driver.findElement(Newsletter).click();
	}
	
	public void setPass_word(String p) {
		driver.findElement(Password).sendKeys(p);
	}
	public void setConfirmPass_word(String pass) {
		driver.findElement(Confirm_password).sendKeys(pass);
	}
	public void Register_buttonclick() {
		driver.findElement(register_button).click();
	}
	
	

}