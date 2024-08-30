package orangehrmtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Time {
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
	  Thread.sleep(3000);}

	@Test(priority=4)
	public void time() throws InterruptedException {
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[4]/a")).click();
		 Thread.sleep(8000);
		
	}
	
	@Test(priority=5)
	
	public void timesheets() throws InterruptedException {
		 Thread.sleep(8000);
		 driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[1]/span/i")).click();
		 
		 Thread.sleep(9000);
		 driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li[1]")).click();
		 Thread.sleep(3000);
		 
	}
	@Test(priority=6)
	public void prevbutton() throws InterruptedException {
		 Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/form/div[1]/div[2]/div/button[1]")).click();
		 Thread.sleep(3000);
	}
	@Test(priority=7)
	public void text() throws InterruptedException {
		Thread.sleep(3000);
		WebElement w1=	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/form/div[1]/div[2]/div/div/div[2]/div/div/input"));
		w1.sendKeys(Keys.CONTROL,"a",Keys.DELETE);


		w1.sendKeys(Keys.CONTROL,"a");
		w1.sendKeys(Keys.DELETE);
		Thread.sleep(3000);
		w1.sendKeys("2026-08-09 to 2027-09-09");
		Thread.sleep(9000);
	}
	@Test(priority=8)
	public void nextbutton() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/form/div[1]/div[2]/div/button[2]/i")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority=9)
	public void createtimesheet() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/button")).click();
		Thread.sleep(3000);
	}
	
	 @AfterTest
	  public void logout() {
	  	  driver.close();
	
	
	
	 }
}
