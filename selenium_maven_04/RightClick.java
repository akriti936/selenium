package selenium_maven_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;
public class RightClick {
	
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		
		//Launching Sample site
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		//Right click in the TextBox
		Actions action = new Actions(driver);
		WebElement searchBox = driver.findElement(By.id("fname"));
		action.contextClick(searchBox).perform();
		
		//Thread.sleep just for user to notice the event
		Thread.sleep(3000);
		
		//Closing the driver instance
		driver.quit();
	}
}