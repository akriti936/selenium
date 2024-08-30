package alprusproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class viewuser {
	ChromeDriver driver;
	@BeforeClass
  //@Test(priority=1)
  public void tearup() throws InterruptedException {
	   driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://182.76.176.205/btes/");
	  Thread.sleep(3000);
  }
	@Test(priority=2)
	public void login() throws InterruptedException {
		  Thread.sleep(7000);
	driver.findElement(By.name("username")).sendKeys("admin");
	  Thread.sleep(7000);
	 driver.findElement(By.name("passwd")).sendKeys("admin"); 
	  Thread.sleep(7000);
	  driver.findElement(By.xpath("//*[@id=\"mod_login_remember\"]")).click();
	  Thread.sleep(7000);
	  driver.findElement(By.name("Submit")).click();
	  Thread.sleep(7000);
}
	@Test(priority=3)
	public void viewuser() throws InterruptedException {
		
		Thread.sleep(7000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/div/div/div/form/a[3]")).click();
		Thread.sleep(7000);
	}
	
	@Test(priority=4)
	public void user() throws InterruptedException {
		Thread.sleep(7000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[2]/table[2]/tbody/tr[4]/td[2]/a")).click();
		Thread.sleep(7000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[2]/table[2]/tbody/tr[4]/td[3]/a")).click();
		Thread.sleep(7000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(7000);
		
	}
	@AfterClass
	public void logout() {
		driver.close();
	}
	
		
		
	
}
