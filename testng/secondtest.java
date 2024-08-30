package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class secondtest {
	ChromeDriver driver;
	  //@Test(priority=1)
	@BeforeTest
  public void tearup() {
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
  }
	  @Test(priority=2)
	  void gender() {
		  WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
		  WebElement female=driver.findElement(By.xpath("//input[@id='gender-female']"));
		  System.out.println("before select");
		  female.click();
		  System.out.println("after select");
		  boolean fem=female.isSelected();
		  System.out.println(fem);
	  }
	  @Test(priority=3)
	  void firstname() {
		  driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("akriti");
	  }
	  @Test(priority=4)
	  void lastname() {
		  driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("bakshi");
		  
	  }
	  @Test(priority=5)
	  void Dateofbirth() {
		  //date
	WebElement date=	  driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
		  date.click();
		  Select d=new Select(date);
		  d.selectByIndex(24);
		  
		  //month 
		  WebElement month=driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
		  month.click();
		  Select m=new Select(month);
		  m.selectByValue("2");
		  
		  //Year
		  WebElement year=driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
		  year.click();
		  Select y=new Select(year);
		  y.selectByValue("2000");
		  
	  }
	  @Test(priority=6)
	  void email() {
		  driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("akritibakshi234@gmail.com");
	  }
	  @Test(priority=7)
	  void company() {
		  driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("bebotechnologies");
		  
	  }
	  @Test(priority=8)

	  void newsletter() {
		  driver.findElement(By.xpath("//input[@id='Newsletter']")).isEnabled();
	  }
	  @Test(priority=9)
	  void password() {
		  driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("pinkbun@123");
	  }
	  @Test(priority=10)
			  void confirmpassword() {
		  driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("pinkbun@123");
		  
	  }
	  //@Test(priority=11)
	  @AfterTest
	  void register() {
		  driver.findElement(By.xpath("//button[@id='register-button']")).click();
	  }
}
