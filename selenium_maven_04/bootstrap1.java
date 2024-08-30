package selenium_maven_04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bootstrap1 {
	public static void main(String[] args) {
		
		
		        FirefoxDriver driver = new FirefoxDriver();

		        // Maximize the browser window
		        driver.manage().window().maximize();

		        // Navigate to the page
		        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");

		        // Click on the dropdown to open options
		        driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();

		        // Find all options in the dropdown
		        List<WebElement> dropdwn1 = driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li"));

		        System.out.println(dropdwn1.size());

		        // Iterate through each option
		        for (WebElement option : dropdwn1) {
		            String text = option.getText();
		            System.out.println(text);

		            // Click on options "Java" or "Python"
		            if (text.equals("Java") || text.equals("Python")) {
		                option.click();
		            }
		        }

		        // Close the browser
		        driver.quit();
		    }
		}
