package selenium_maven_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkandradio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//radio button is selected
		WebElement male=driver.findElement(By.xpath("//input[@id='male']"));
		
	
		System.out.println("before select");
		male.click();
		System.out.println("after select");
		boolean b=male.isSelected();
		System.out.println(b);
		//checkbox funtionality
		
		driver.findElement(By.xpath("//input[@value='monday']")).click();
		
	}

}
