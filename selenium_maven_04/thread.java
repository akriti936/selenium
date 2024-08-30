package selenium_maven_04;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class thread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//Thread.sleep(2000);
//driver.findElement(By.name("")).sendKeys("");

driver.findElement(By.name("username")).sendKeys("Admin");
driver.findElement(By.name("password")).sendKeys("admin123");

	}

}
