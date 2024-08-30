package selenium_maven_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		driver.switchTo().frame("iframeResult");
		WebElement f=driver.findElement(By.xpath("//input[@id='field1']"));
		
		f.clear();
		f.sendKeys("akriti");
		WebElement f1=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		Actions act=new Actions(driver);
		
		act.doubleClick(f1).perform();
		Thread.sleep(3000);
		
	WebElement e=driver.findElement(By.xpath("//input[@id='field2']"));
	System.out.println(e.getAttribute("value"));
	}

}
