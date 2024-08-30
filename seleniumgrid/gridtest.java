package seleniumgrid;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class gridtest {
	RemoteWebDriver driver;
@BeforeClass
	void setup() throws MalformedURLException, URISyntaxException{
		String url="http://192.168.29.124:4444";

		//DesiredCapabilities cap=new DesiredCapabilities();
		//cap.setBrowserName("chrome");
		//cap.setPlatform(Platform.WINDOWS);
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		//URL ur=new URL();
		driver=new RemoteWebDriver(new URI("http://192.168.29.124:4444").toURL(),cap);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getTitle());
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

	public	 void login() throws InterruptedException {
	 Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	  Thread.sleep(3000);}

		 
@AfterClass
	
public void logout() {
	driver.close();
}
}
