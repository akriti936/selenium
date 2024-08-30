package selenium_maven_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("hello");
		driver.switchTo().frame("frm1");
	WebElement d=	driver.findElement(By.xpath("//*[@id=\"selectnav1\"]"));
	d.click();
	Select dropdown=new Select(d);
	dropdown.selectByVisibleText("Tech News");
	}

}

