package selenium_maven_04;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
				FirefoxDriver driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("https://www.orangehrm.com/");
				
				
				JavascriptExecutor js=driver;
				
				//js.executeScript("window.scrollBy(0,250)", " ");
				
				
				js.executeScript("window.scrollBy(0,250)", "");
				
				Thread.sleep(5000);
				
				//System.out.println(js.executeScript("return window.pageYoffset;"));
				
			System.out.println(js.executeScript("return window.pageYoffset;"));
				
		//scroll down specific element
				//WebElement text=driver.findElement(By.xpath("/html/body/div/div/div/section[2]/div[1]/div/div[1]/div/h3"));
				//js.executeScript("arguments[0].scrollIntoview", text);
				//System.out.println(js.executeScript(" return window.pageXoffset;"));
			
				
	}

}
