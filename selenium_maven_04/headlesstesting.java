package selenium_maven_04;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headlesstesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeOptions option=new ChromeOptions();
option.addArguments("--headless=new");

ChromeDriver driver =new ChromeDriver(option);
driver.get("https://opensource-demo.orangehrmlive.com");
Thread.sleep(3000);
driver.findElement(By.name("username")).sendKeys("Admin");
driver.findElement(By.name("password")).sendKeys("admin123");


driver.findElement(By.className("oxd-button")).click();

String act_Title=driver.getTitle();
String exp_Title="OrangeHRM";
if(act_Title.equals(exp_Title)) {
	System.out.println("Test is passed");
}
else {
	System.out.println("Test is Failed");
}
	}

}
