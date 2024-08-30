package selenium_maven_04;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Example {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		driver.findElement(By.name("username")).sendKeys("Admin");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		

	    
        // FluentWait setup
       // FluentWait<WebDriver> wait = new FluentWait<>
               // .withTimeout(Duration.ofSeconds(20))
                //.pollingEvery(Duration.ofMillis(5000)) // Adjusted polling interval for better performance
                //.ignoring(ElementNotInteractableException.class);

        // Enter username
       // driver.findElement(By.name("username")).sendKeys("Admin");
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));

        // Enter password
        //driver.findElement(By.name("passsword")).sendKeys("admin123");
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));

        // Additional actions like clicking the login button would typically follow here
        // For example:
         //driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        // Close the browser
        //driver.quit();
    }


		   	    
		   		
		           
		
	
}
