package selenium_maven_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement country=driver.findElement(By.xpath("//*[@id=\"box106\"]"));
		
		WebElement capital=driver.findElement(By.xpath("//*[@id=\"box6\"]"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.dragAndDrop(capital, country).build().perform();	
	}

}

