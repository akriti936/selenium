package selenium_maven_04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

      
	driver.get("https://www.google.com/");
	
		WebElement e= driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		e.click();
		 

	        // Iterate through each option
	        
		  	driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("selenium");
		  	List<WebElement>links=driver.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]"));
			  
			System.out.println("Number of links: " + links.size());
			for (WebElement option : links) {
		        System.out.println(option.getText());
		        if(option.getText().equals("selenium")||option.getText().equals("selenium rich foods"))
		        {
		        //clicking on the option
		        option.click();
		  	driver.quit();
		  
		  
			}}

	
		
		
		
		
		

		
		
	}
}