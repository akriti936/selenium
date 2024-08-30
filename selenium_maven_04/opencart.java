package selenium_maven_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class opencart {
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("*//*[@id='small-searchterms']")).sendKeys("Computers");
		driver.findElement(By.xpath("*//*[@class='button-1 search-box-button']")).click();
			driver.findElement(By.xpath("//a[text()='Register']")).click();
			driver.findElement(By.xpath("//a[contains(text(), 'Register')]")).click();
			driver.findElement(By.xpath("//input[@type='text' and @id='small-searchterms']")).click();
			driver.findElement(By.xpath("//*[normalize-space(text())='Wishlist']")).click();
			
			driver.findElement(By.xpath("//*[starts-with(text(),'Reg')]")).click();
			
			
}
}