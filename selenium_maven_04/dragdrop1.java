package selenium_maven_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
				
         
			//Element which needs to drag.    		
	        	WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
	         
	         //Element on which need to drop.		
	         WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));					
	         		
	         //Using Action class for drag and drop.		
	         Actions act=new Actions(driver);					

		//Dragged and dropped.		
	         act.dragAndDrop(From, To).build().perform();		
		}		


}
