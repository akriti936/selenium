package orangehrmtest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class adminskills {
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
	public void adminlink() throws InterruptedException {
		  driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
			Thread.sleep(3000);
	}
	@Test(priority=5)
	public void qualification() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span/i")).click();
		Thread.sleep(3000);
	
		
	}
	@Test(priority=6)
	public void skills() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		
	}
	@Test(priority=7)
	public void add() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[1]/div/button/i")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority=8)
	public void Name() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys("java");
		Thread.sleep(3000);
	}
	@Test(priority=9)
	public void description() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys("Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. ");
		Thread.sleep(3000);
	}
	@Test(priority=10)
	public void savebutton() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void logout() {
		  driver.close();
	
	
	
	
	
	
	
	}
	
}