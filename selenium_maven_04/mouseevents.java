package selenium_maven_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseevents {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("*//*[@id='small-searchterms']")).sendKeys("Computers");
	WebElement e1=	driver.findElement(By.xpath("*//*[@class='button-1 search-box-button']"));
WebElement e=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));

Thread.sleep(3000);
Actions act=new Actions(driver);
act.moveToElement(e1).moveToElement(e).click().build().perform();
}}