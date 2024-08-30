package selenium_maven_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		Boolean logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println(logo);
//is enabled
		Boolean textbox=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println(textbox);
		//is selected
		WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
		
		WebElement female=driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println("before select");
		male.click();
				System.out.println("after select");
boolean b=male.isSelected();
System.out.println(b);

	}

}
