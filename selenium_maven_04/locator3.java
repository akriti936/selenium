package selenium_maven_04;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.nopcommerce.com/");
		d.findElement(By.cssSelector("input.search-box-text")).sendKeys("Mackbook");
		
		
		d.findElement(By.cssSelector("button.button-1 ")).click();

	}
	

}
