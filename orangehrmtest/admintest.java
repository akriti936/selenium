package orangehrmtest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class admintest {
	ChromeDriver driver;
	@BeforeTest
  //@Test(priority=1)
  public void tearup() {
	   driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
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
  public void username() throws InterruptedException {
	  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("akriti");
		Thread.sleep(3000);
  }
  @Test(priority=6)
  
  public void Userrole() throws InterruptedException {
	  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]/i")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div[2]/span")).click();
	  
		
	  Thread.sleep(3000);
  }
  @Test(priority=7)
  public void Employeename() throws InterruptedException {
	  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input")).sendKeys("akriti");
		Thread.sleep(3000);
  }
  @Test(priority=8)
  public void status() throws InterruptedException {
	  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[2]/i")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div[2]/div[2]/span")).click();
		Thread.sleep(3000);
  }
  @Test(priority=9)
		  public void search() throws InterruptedException {
	  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
	  Thread.sleep(3000);
	  
  }
  @Test(priority=10)
  public void add () throws InterruptedException {
	  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
	  Thread.sleep(3000);
  }
  @Test(priority=11)
  public void userrole() throws InterruptedException {
	  driver.findElement(By.xpath("//body//div//div//div//div//div//div//div//div//div[1]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
		Thread.sleep(6000);
  }
  
  @Test(priority=12)
  
  public void employeeName() throws InterruptedException {
	  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")).sendKeys("akriti");
	  Thread.sleep(9000);
  }
  @Test(priority=13)
  public void statusbutton() throws InterruptedException {
	  Thread.sleep(3000);
	  
	  
	  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div[2]/span")).click();
		Thread.sleep(7000);
  }
  @Test(priority=14)
  
  public void Username() throws InterruptedException {
	  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")).sendKeys("akriti");
	  Thread.sleep(3000);
  }
  
  @Test(priority=15)
  public void password() throws InterruptedException {
	  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")).sendKeys("bebo@123");
		Thread.sleep(3000);
  }
  @Test(priority=16)
  public void confirmpassword() throws InterruptedException {
	  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys("bebo@123");
		Thread.sleep(3000);
  }
		  
  @Test(priority=17)
  public void savebutton() throws InterruptedException {
	 driver.findElement(By.xpath(" /html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
	 Thread.sleep(3000);
  }
  @AfterTest
public void logout() {
	  driver.close();
  
  
  
  
  }
  
}
