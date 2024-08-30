package selenium_maven_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
				
         
			//Element which needs to drag.    		
	        	//WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
	         
	         //Element on which need to drop.		
	        // WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));	
	         WebElement d1=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[4]/a"));
	         WebElement d=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/div/div/ol/li"));
	         		
	         //Using Action class for drag and drop.		
	         Actions act=new Actions(driver);					

		//Dragged and dropped.		
	         //act.dragAndDrop(From, To).build().perform();		
	         act.dragAndDrop(d1, d).build().perform();
		}		
	}


