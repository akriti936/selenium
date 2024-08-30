package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class login1 {
	ChromeDriver driver;
	
	@Test(priority=1)
 public void login() throws InterruptedException {
		Thread.sleep(3000);
		driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demo.guru99.com/test/newtours/");
	 Thread.sleep(5000);
 }
	@Test(priority=2 ,dependsOnMethods = { "login"})
	public void username() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.name("userName")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
		
	}
	@Test(priority =3,dependsOnMethods = { "login" })
	public void submit() {
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}
}
