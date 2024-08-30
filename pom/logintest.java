package pom;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class logintest {
	WebDriver driver;
	
	//login lp;
	Loginpage2 lp;
	@BeforeClass
    public void setup() throws InterruptedException {
		Thread.sleep(3000);
		driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(6000);
    	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    	Thread.sleep(3000);
    }
	@Test(priority=2)
    public void login() throws InterruptedException {
		Thread.sleep(3000);
    	lp.setusername("Admin");
    	Thread.sleep(3000);
    	lp.setpassword("admin123");
    	lp.click();
    	Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }
	@Test(priority=1)
	public void logo() {
		//lp=new login(driver);
		lp=new Loginpage2(driver);
	}
    
	@AfterClass
    public void teardown() {
    	driver.close();
    }
}
