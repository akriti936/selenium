package selenium_maven_04;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
System.out.println(driver.getTitle());
System.out.println(driver.getPageSource());
String url=driver.getCurrentUrl();
Assert.assertEquals(url, "https://www.flipkart.com/","both re matched" );
String title=driver.getTitle();
Assert.assertEquals(title, "//title[contains(text(),'Online Shopping Site for Mobiles, Electronics, Fur')]","both re matched" );
driver.close();
	}

}
