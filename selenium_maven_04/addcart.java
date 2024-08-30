package selenium_maven_04;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class addcart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("*//*[@id='small-searchterms']")).sendKeys("Computers");
		driver.findElement(By.xpath("*//*[@class='button-1 search-box-button']")).click();
driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")).click();
	}

}
