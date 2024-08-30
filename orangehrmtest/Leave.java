package orangehrmtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Leave {
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
	
	public void applyleave() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[1]/a")).click();
		Thread.sleep(3000);
		
	}
	@Test(priority=6)
		
		public void LeaveType() throws InterruptedException {
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[2]/span")).click();
		Thread.sleep(3000);
	}
	@Test(priority=6)
	
	public void leavebalance() throws InterruptedException {
		Thread.sleep(3000);
		WebElement leavebalance=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/p"));
		String leaves=leavebalance.getText();
		Thread.sleep(3000);}
	@Test(priority=7)
		public void Fromdate() throws InterruptedException {
			WebElement fromDate = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/i"));
			fromDate.click();
			WebElement date=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/input"));
			date.sendKeys("2023-12-9");
			Thread.sleep(3000);
	}
	@Test(priority=8)
		public void toDate() throws InterruptedException {
			
	WebElement t=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div/i"));
	t.click();
WebElement w=	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div/input"));
	w.sendKeys("2025-12-8");
	
		Thread.sleep(8000);
		}
	
			
		
	@Test(priority=9)
	
		
			public void comments() throws InterruptedException {
				Thread.sleep(8000);
				driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div/div/div[2]/textarea")).sendKeys("We'd love to hear your feedback - please leave a comment!");
				Thread.sleep(3000);
			}
			
	@Test(priority=10)
	
			public void applybutton() throws InterruptedException {
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[4]/button")).click();
				Thread.sleep(3000);
			}
			
	 @AfterTest
	  public void logout() {
	  	  driver.close();
		 
	 }} 
			
			
			


