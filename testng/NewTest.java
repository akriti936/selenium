package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



@Test
public class NewTest {
WebDriver driver;
@Parameters({"browser", "url"})
void setup(String br,String appUrl) {
	
	if(br.equals("chrome")){
	driver=new ChromeDriver();
		
	}
	else if(br.equals("edge")){
		driver=new EdgeDriver();
	}
	else {
		driver=new FirefoxDriver();
	}
	}
	void logo() throws InterruptedException {
		Thread.sleep(3000);
		boolean logo=driver.findElement(By.xpath("//div[@class='orangehrm-login-logo']")).isDisplayed();
		if(logo) {
			Assert.assertTrue(true);
		}
		else {
			Assert.fail();
		}
	}
	void login() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
	void teardown() {
		driver.close();
	}
}

