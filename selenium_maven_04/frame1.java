package selenium_maven_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		WebElement d=	driver.findElement(By.xpath("/html/frameset/frame[1]"));
	driver.switchTo().defaultContent();
Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("hello");
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("hellojava");
		
	}

}
