package selenium_maven_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseevent1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(3000);
	WebElement e=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

	Actions act=new Actions(driver);
	act.contextClick(e).click();
	driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
	driver.switchTo().alert();
	
	}

}
