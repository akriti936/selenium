package selenium_maven_04;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


	
	

		public class gmail1 {

			public static void main(String[] args) throws InterruptedException  {
				// TODO Auto-generated method stub
	ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		Thread.sleep(3000);
		driver.get("https://accounts.google.com/signin");
		driver.findElement(By.name("identifier")).sendKeys("bakshiakriti4@gmail.com");

		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();


		Thread.sleep(6000);


		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("critical@123456");
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		String act_Title=driver.getTitle();
		String exp_Title="Sign in - Google Accounts";
		if(act_Title.equals(exp_Title)) {
			System.out.println("Test is passed");
		}
		else {
			System.out.println("Test is Failed");
		driver.close();
			}

			
		}}
