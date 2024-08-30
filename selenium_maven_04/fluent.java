package selenium_maven_04;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class fluent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		// OPEN URL -- get()
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	FluentWait mywait = new FluentWait(driver);
	mywait.withTimeout(Duration.ofSeconds(30));
	mywait.pollingEvery(Duration.ofSeconds(5));
	mywait.ignoring(ElementNotInteractableException.class);
	mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
	// USERNAME 
	driver.findElement(By.name("username")).sendKeys("Admin");
	mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
	// PASSWORD
	driver.findElement(By.name("password")).sendKeys("admin123");
	Thread.sleep(3000);
	driver.close();
	}

	}


