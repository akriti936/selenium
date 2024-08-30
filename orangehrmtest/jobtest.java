package orangehrmtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class jobtest {
	FirefoxDriver driver;
	@BeforeTest
  //@Test(priority=1)
  public void tearup() throws InterruptedException {
	   driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  
	  Thread.sleep(3000);
  }
  @Test(priority=2)
public void logo() throws InterruptedException {
	  Thread.sleep(12000);
	 Boolean b= driver.findElement(By.xpath("//div[@class='orangehrm-login-logo']")).isDisplayed();
	 System.out.println(b);
	 if(b) {
		 System.out.println("logo is displayed");
	 }
	 else {
		 System.out.println("logo is not  displayed");
	 }
  }
  @Test(priority=3)
public void login() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	  Thread.sleep(3000);
}
  @Test(priority=4)
  public void adminlink() throws InterruptedException {
	  driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
		Thread.sleep(3000);
  }
  @Test(priority=5)
  public void joblink() throws InterruptedException {
	 driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span/i")) .click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]/a")).click();
	 
	 Thread.sleep(3000);
  }
  @Test(priority=6)
	 public void Add() throws InterruptedException {
	  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
	  Thread.sleep(3000);
	  
  }
  @Test(priority=7)
public void addjobtitle() throws InterruptedException {
	  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys("junior assistance");
	  Thread.sleep(3000);
  }
  
  @Test(priority=8) 
  public void jobdescription() throws InterruptedException {
	 driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys("Junior Assistants provide support in a variety of departments. They assist higher-ups with day-to-day office and field work. Their primary responsibilities include file dispatch, typing, recording, and indexing, statement preparation, file registering, and so on");
	 Thread.sleep(3000);
  }
  @Test(priority=9) 
	 public void uploadfile() throws InterruptedException {
	WebElement up=	 driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[1]"));
		 
		 up.click();
			Thread.sleep(8000);
			WebElement frame =driver.switchTo().activeElement();
			Thread.sleep(9000);
			  frame.sendKeys("C:\\Users\\akusharma\\Downloads\\122.pdf");//uploadfile
			  
			 
			  
			Thread.sleep(3000);
		
	 }
  @Test(priority=10)
  public void note() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea")).sendKeys("All fields are required. You're all set!");
	  
  }
  
  
  @Test(priority=11) 
	 public void savebutton() throws InterruptedException {
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]")).click();
		 
	 }
	 
  @AfterTest
  public void logout() {
  	  driver.close();
	 
	 
	 
	 
	 
	 
  }}
	 
	 
	 
	 
	 
  

