package alprusproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class editmyprofile {
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
	public void homepage() throws InterruptedException {
		Thread.sleep(7000);
		Assert.assertTrue(true);
		Thread.sleep(7000);
	}
	@Test(priority=4)
	public void resetbutton() throws InterruptedException {
		Thread.sleep(7000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[2]/div/div[1]/table/tbody/tr/td[3]/input")).click();
		Thread.sleep(7000);
	}
	@Test(priority=5)
	public void editmyprofile() throws InterruptedException {
		Thread.sleep(7000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/div/div/div/form/a[2]")).click();
		Thread.sleep(7000);
	}
	
	@Test(priority=6)
	public void header() throws InterruptedException {
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[2]/form/div")).getText();
		Thread.sleep(7000);
		
	}
	
	
	@Test(priority=7)
	public void username() {
	boolean w=driver.findElement(By.xpath("//*[@id=\"username\"]")).isDisplayed();
	System.out.println(w);
	}
	@Test(priority=7)
	public void Name() throws InterruptedException {
		Thread.sleep(3000);
		WebElement w1=	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[2]/form/table/tbody/tr[4]/td[2]/input"));
		w1.sendKeys(Keys.CONTROL,"a",Keys.DELETE);


		w1.sendKeys(Keys.CONTROL,"a");
		w1.sendKeys(Keys.DELETE);
		Thread.sleep(3000);
		w1.sendKeys("admin123");
		Thread.sleep(9000);
	}
	@Test(priority=8)
	public void emailid() throws InterruptedException {
		Thread.sleep(3000);
		WebElement w1=	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[2]/form/table/tbody/tr[5]/td[2]/input"));
		w1.sendKeys(Keys.CONTROL,"a",Keys.DELETE);


		w1.sendKeys(Keys.CONTROL,"a");
		w1.sendKeys(Keys.DELETE);
		Thread.sleep(3000);
		w1.sendKeys("bakshiakriti234@gmail.com");
		Thread.sleep(9000);
	
	}
	@Test(priority=9)
public void telephone() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"telephone\"]")).sendKeys("9896755432");
	Thread.sleep(3000);
}
	@Test(priority=10)
	public void zip() throws InterruptedException {
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"zip\"]")).sendKeys("135003");
		Thread.sleep(3000);
	}
	@Test(priority=11)
	public void oldpassword() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"oldpassword\"]")).sendKeys("pinkbunny@123");
		Thread.sleep(3000);
	}
	@Test(priority=12)
	
	public void Newpassword() throws InterruptedException {
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"newpassword\"]")).sendKeys("critical@123456");
		Thread.sleep(3000);

	}
	
	@Test(priority=13)
	
	public void verifypassword() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"newpassword2\"]")).sendKeys("critical@123456");
		Thread.sleep(3000);
	}
	
	@Test(priority=14)
	public void update() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[2]/form/table/tbody/tr[12]/td/input[2]")).click();
		Thread.sleep(3000);
	}
@AfterClass
	public void logout() {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
}
