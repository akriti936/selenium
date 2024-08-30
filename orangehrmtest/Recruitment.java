package orangehrmtest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Recruitment {
	ChromeDriver driver;
	@BeforeClass
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
public void recruitment() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a")).click();
	  Thread.sleep(3000);
  }
  @Test(priority=5)
  public void candidates () throws InterruptedException {
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[1]/a")).click();
	  Thread.sleep(3000);
  }
  @Test(priority=6)
  public void jobtitle() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[2]/span")).click();
	  Thread.sleep(3000);
	
  }
}
