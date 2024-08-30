package selenium_maven_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("*//*[@id='small-searchterms']")).sendKeys("Computers");
		driver.findElement(By.xpath("*//*[@class='button-1 search-box-button']")).click();
driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//li[@class='active last']//a[normalize-space()='Desktops']")).click();
driver.findElement(By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]")).click();
Thread.sleep(3000);
WebElement e=driver.findElement(By.xpath("//*[@id=\"product_attribute_2\"]"));
e.click();
Select s=new Select(e);
s.selectByVisibleText("2 GB");

Boolean b=driver.findElement(By.xpath("//label[normalize-space()='HDD']")).isDisplayed();
System.out.println(b);
WebElement hdd = driver.findElement(By.xpath("//input[@id='product_attribute_3_6']"));

System.out.println("before select");
hdd.click();
System.out.println("after select");

boolean l = hdd.isSelected();
System.out.println(l);
driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-1\"]")).click();
	}

}
