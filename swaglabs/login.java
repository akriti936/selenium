package swaglabs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {
	ChromeDriver driver;
	@BeforeClass
  //@Test(priority=1)
  public void tearup() throws InterruptedException {
		Thread.sleep(3000);
	   driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.saucedemo.com");
	  Thread.sleep(3000);
  }
  @Test(priority=2)
  public void login() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	  Thread.sleep(3000);
  }
  @AfterClass
  public void teardown() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.close();
	  Thread.sleep(3000);
  }
}
