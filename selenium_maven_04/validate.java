package selenium_maven_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class validate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/tinymce");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
	Boolean b=		driver.findElement(By.xpath("/html")).isDisplayed();
	System.out.println(b);
		driver.close();
	}

}
