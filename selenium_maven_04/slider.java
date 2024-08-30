package selenium_maven_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		WebElement e=driver.findElement(By.xpath("/html/body/div[2]/div[2]/span[1]"));
		Thread.sleep(2000);
		System.out.println(	e.getLocation());
		Actions act=new Actions(driver);
		act.dragAndDropBy(e, 100, 0).perform();
		System.out.println(e.getLocation());
	}

}
