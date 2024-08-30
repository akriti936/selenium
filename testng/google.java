package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class google {
	ChromeDriver driver;
	@BeforeClass
  //@Test(priority=1)
  public void tearup() throws InterruptedException {
	   driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
	  Thread.sleep(3000);
  }
  @Test(priority=2)
  public void search() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("java");
	  Thread.sleep(3000);
  }
  @Test(priority=3)
  public void advancesearch() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"Alh6id\"]")).click();
	  Thread.sleep(3000);
	  Assert.assertTrue(true);
  }
  @AfterClass
  public void logout() {
	  driver.close();
  }
}
