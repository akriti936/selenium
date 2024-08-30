package selenium_maven_04;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		//driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
	Alert alert=driver.switchTo().alert();
	//alert.dismiss();
	// alertMessage= driver.switchTo().alert().getText(); // capture alert message
	//Thread.sleep(5000);
	/// alert.accept(); 
	//System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
    //System.out.println(alertMessage); // Print Alert Message
    //Thread.sleep(5000);
    
    
    
	//System.out.println(driver.findElement(By.xpath("//*p[@id='result']")).getText());
		//driver.findElement(By.xpath("//button[onclick='jsPrompt()']")).click();
		//alert.sendKeys("hello");
		//Thread.sleep(3000);
		//alert.accept();
		//System.out.println(driver.findElement(By.xpath("//*[@id='result']")).getText());
	}

}
