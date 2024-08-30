package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class giftcard {
	ChromeDriver driver;
  @Test(priority=1)
  public void tearup() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.nopcommerce.com/gift-cards");
  }
  @Test(priority=2)
  public void virtualgiftcard() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//img[@title='Show details for $25 Virtual Gift Card']")).click();
	  }
  @Test(priority=3)
  public void recipientname() {
	  driver.findElement(By.xpath("//input[@id='giftcard_43_RecipientName']")).sendKeys("sonasharma");
  }
  
  @Test(priority=4)
  public void email() {
	  driver.findElement(By.xpath("//input[@id='giftcard_43_RecipientEmail']")).sendKeys("akritibakshi234@gmail.com");
  }
  @Test(priority=5)
  public void sendername() {
	  driver.findElement(By.xpath("//input[@id='giftcard_43_SenderName']")).sendKeys("akritibakshi");
  }
  @Test(priority=6)
  public void senderemail() {
	  driver.findElement(By.xpath("//input[@id='giftcard_43_SenderEmail']")).sendKeys("akritibakshi5020@gmail.com");
  }
  @Test(priority=7)
  public void message() {
	  driver.findElement(By.xpath("//textarea[@id='giftcard_43_Message']")).sendKeys("your product is ready");
  }
  @Test(priority=8)
  public void addcart() {
	  driver.findElement(By.xpath("//button[@id='add-to-cart-button-43']")).click();
  }
  @Test(priority=9)
 public  void popup() throws InterruptedException {
	  Thread.sleep(3000);
	
	 System.out.println(driver.findElement(By.xpath("//p[@class='content']")).getText());
  }
}
