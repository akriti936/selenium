package orangehrmtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myleavetest {
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
	public void leave() throws InterruptedException {
		  Thread.sleep(3000);
		  
driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a")).click();
		  Thread.sleep(3000);
	}
	@Test(priority=5)
	public void myleave() throws InterruptedException {
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a")).click();
		  Thread.sleep(3000);
	}
	@Test(priority=6)
	public void Fromdate() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/i")).click();
		Thread.sleep(3000);

		WebElement w=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input"));
		w.sendKeys(Keys.CONTROL,"a",Keys.DELETE);


		w.sendKeys(Keys.CONTROL,"a");
		w.sendKeys(Keys.DELETE);
		Thread.sleep(3000);
		w.sendKeys("2023-08-09");
		Thread.sleep(3000);
	}
	@Test(priority=7)
	public void todate() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/i")).click();
		Thread.sleep(3000);
		WebElement w1=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/input"));
		w1.sendKeys(Keys.CONTROL,"a",Keys.DELETE);


		w1.sendKeys(Keys.CONTROL,"a");
		w1.sendKeys(Keys.DELETE);
		Thread.sleep(3000);
		w1.sendKeys("2025-08-09");
		Thread.sleep(3000);
		
	}
	@Test(priority=8)
	public void showleavestatus() throws InterruptedException {
		Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[1]/div[2]/i")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div[1]/span")).click();
	Thread.sleep(3000);
	
}
	@Test(priority=9)
	public void leavetype() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[2]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div[2]/div[2]/span")).click();
		Thread.sleep(3000);
	}
	@Test(priority=10)
	public void search() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
		Thread.sleep(3000);
	}
	 @AfterTest
	  public void logout() {
	  	  driver.close();
}
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	