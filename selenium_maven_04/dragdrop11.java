package selenium_maven_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
				
         
			//Element which needs to drag.    		
	        	WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
	         
	         //Element on which need to drop.		
	         WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));	
	         WebElement d1=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[4]/a"));
	         Thread.sleep(3000);    
	         WebElement d=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/div/div/ol/li"));
	         Thread.sleep(3000);
WebElement creditside=driver.findElement(By.xpath("//a[normalize-space()='SALES']"));	
WebElement amount1=driver.findElement(By.xpath("//ol[@id='loan']"));	
	         //Element on which need to drop.

	         WebElement account=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[2]/a"));	
	         WebElement amount =driver.findElement(By.xpath("//ol[@id='amt8']//li[@class='placeholder']"));
	         //Using Action class for drag and drop.		
	         Actions act=new Actions(driver);					

		//Dragged and dropped.		
	         act.dragAndDrop(From, To).build().perform();		
	         act.dragAndDrop(d1, d).build().perform();
	         act.dragAndDrop(creditside,amount1).build().perform();
	         act.dragAndDrop(account, amount).build().perform();
	}

}
