package orangehrmtest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PIMReports {
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
	public void PIM() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
		Thread.sleep(3000);
	}
	@Test(priority=6)
		public void Reports() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[4]/a")).click();
		Thread.sleep(3000);
		
		
	}
		
	@Test(priority=7)	
		
		public void Employeereports() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div/div/div[2]/div/div/input")).sendKeys("employee account details");
		Thread.sleep(3000);
	}
	@Test(priority=8)	
		
		public void search() throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
			Thread.sleep(3000);
		}
	@Test(priority=9)	
	public void add() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button/i")).click();
		Thread.sleep(3000);
	}
	@Test(priority=10)	
		public void addreport() throws InterruptedException {
		Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/input")).sendKeys("employee  hierarchy");
		Thread.sleep(3000);
		
		
		
	}
	
	
	@Test(priority=11)	
	public void selectioncriteria() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div[1]/div[2]/div/div/div[2]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div[1]/div[2]/div/div[2]/div[2]/span")).click();
	}
	@Test(priority=12)	
		public void Include() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div/div[2]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/span")).click();
		Thread.sleep(3000);
		
	}
	@Test(priority=13)	
	public void DisplayFieldGroup() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/div/div/div[2]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/div/div[2]/div[2]/span")).click();
		Thread.sleep(3000);
	}
	@Test(priority=14)	
	public void SelectdisplayField() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div[2]/i")).click();
		Thread.sleep(3000);
		
			
		
	}
	@Test(priority=15)		
		public void savebutton() throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[4]/button[2]")).click();
			Thread.sleep(3000);
		}
	@AfterTest
	public void logout() {
		  driver.close();
	}

		
		
		
		
	
}
