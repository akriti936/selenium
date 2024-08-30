package selenium_maven_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		
	WebElement e=	driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
	Actions a =new Actions(driver);
	a.keyDown(Keys.CONTROL).click(e).keyUp(Keys.CONTROL).perform();
	 //String mainWindowHandle = driver.getWindowHandle();
     
    // List<String> windowIDs = new ArrayList<>(windowHandles);
    //System.out.println("Window IDs: " + windowIDs);
//driver.switchTo().window(mainWindowHandle);
     Set<String>winids= driver.getWindowHandles();
     
     List <String> wid=new ArrayList(winids);
     String parentid=wid.get(0);
     String childid=wid.get(1);
     driver.switchTo().window(parentid);
     
WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
WebElement female = driver.findElement(By.xpath("//input[@id='gender-female']"));

System.out.println("before select");
female.click();
System.out.println("after select");

boolean l = male.isSelected();
		
	}

}
