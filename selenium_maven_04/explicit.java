package selenium_maven_04;


import java.time.Duration;



    	import org.openqa.selenium.By;
    	import org.openqa.selenium.Keys;
    	import org.openqa.selenium.WebElement;
    	import org.openqa.selenium.chrome.ChromeDriver;
    	import org.openqa.selenium.support.ui.ExpectedConditions;
    	import org.openqa.selenium.support.ui.WebDriverWait;

    	public class explicit {

    		public static void main(String[] args) {
    			ChromeDriver driver = new ChromeDriver();
    	         driver.get("https://www.google.com/");
    	         driver.manage().window().maximize();
    	         WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
    	         wait.until(ExpectedConditions.titleContains("Goo"));
    		     wait.until(ExpectedConditions.titleIs("Google"));

    		     WebElement search= driver.findElement(By.name("q"));
    		     search.sendKeys("India");
    		     search.sendKeys(Keys.ENTER);

    		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[.='India']"))).click();

    		}

    	

		   	    
		   		
		           
		
	
}
