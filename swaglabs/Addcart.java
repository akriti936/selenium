package swaglabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Addcart {
	FirefoxDriver driver;
	@BeforeClass
	 public void tearup() throws InterruptedException {
	Thread.sleep(3000);
	   driver=new FirefoxDriver();
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
@Test(priority=3)
public void NameAtoZ() throws InterruptedException {
	  Thread.sleep(3000);
	WebElement w=  driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select"));
	w.click();
	  Select s=new Select(w);
	  s.selectByValue("az");
	  Thread.sleep(3000);
}
@Test(priority=4)
public void addcart() throws InterruptedException {
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
	 Thread.sleep(3000);
}
@Test(priority=5)

public void yourcart() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
	Thread.sleep(3000);
}
@Test(priority=6)
public void yourinformation() {
	driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("aaarti");
	driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("sharma");
	driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("135001");
	driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).getText();
	driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
}
}
