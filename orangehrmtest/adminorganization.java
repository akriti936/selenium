package orangehrmtest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class adminorganization{
	

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
public void organization() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/span/i")).click();
	Thread.sleep(3000);
	
}
@Test(priority=6)
public void generalinformation() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/ul/li[1]/a")).click();
	Thread.sleep(5000);
}
@Test(priority=7)
public void edit() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div/label/span")).click();
	
}
@Test(priority=8)
public void country() throws InterruptedException {
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div[3]/div/div[2]/div/div/div[2]/i")).click();
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div[3]/div/div[2]/div/div[2]/div[57]/span")).click();
	Thread.sleep(3000);
	
	
	
}
@Test(priority=9)
public void savebutton() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[7]/button")).click();
	Thread.sleep(3000);
}
@AfterTest
public void logout() {
	  driver.close();
 




}

}