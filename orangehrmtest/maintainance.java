package orangehrmtest;

import org.testng.annotations.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class maintainance {
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
	  Thread.sleep(3000);
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
  public void maintainanceclick() throws InterruptedException {
	  driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[10]/a")).click();
		Thread.sleep(3000);
  }
  @Test(priority=5)
  public void administratorpassword() throws InterruptedException {
	  driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/form/div[3]/div/div[2]/input")).sendKeys("admin123");
		Thread.sleep(3000);
  }
  
  //confirm button
  @Test(priority=6)
  public void confirmbutton() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/form/div[4]/button[2]")).click();
		Thread.sleep(3000);
  }
  @Test(priority=7)
  public void assignbutton() throws InterruptedException {
	  driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a")).click();
		Thread.sleep(3000);
  }
  @Test(priority=8)
  public void employeename() throws InterruptedException {
	  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/form/div[1]/div/div/div/div[2]/div/div/input")).sendKeys("Crystal  Oconnor");
		Thread.sleep(3000);
  }
  @Test(priority=9)
  public void search() {
	  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/form/div[2]/button")).click();
  }
  
  @AfterTest
  //@Test(priority=4)
public void logout() {
	  driver.close();
}
}

