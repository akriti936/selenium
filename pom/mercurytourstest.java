package pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class mercurytourstest {
	
WebDriver driver;
	mercurytours lp;
	
	@BeforeClass
    public void setup() throws InterruptedException {
		Thread.sleep(3000);
		driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(6000);
    	driver.get("https://demo.guru99.com/test/newtours/");
    	Thread.sleep(3000);
	} 
	@Test(priority=2)
    public void login() throws InterruptedException {
		Thread.sleep(3000);
    lp.setUserName("admin");
    Thread.sleep(3000);
    lp.setpassword("admin");
    Thread.sleep(3000);
    lp.click();
    }
	@Test(priority=1)
	public void logo() {
		//lp=new login(driver);
		lp=new mercurytours(driver);
	}
    
	@AfterClass
    public void teardown() {
    	driver.close();
    }

}
