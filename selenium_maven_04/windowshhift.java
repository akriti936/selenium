package selenium_maven_04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowshhift {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bing.com");
		
		driver.findElement(By.xpath("//*[@id=\"sb_form_q\"]")).sendKeys("computers");
		Thread.sleep(3000);
		List<WebElement>links=driver.findElements(By.xpath("//*[@id=\"sa_ul\"]"));
		  
		
		for (WebElement option : links) {
	        System.out.println(option.getText());
	        if(option.getText().equals("computersoft")||option.getText().equals("Computer"))
	        {
	        //clicking on the option
	        option.click();
	  	driver.quit();
}
}}}