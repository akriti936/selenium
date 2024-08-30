package selenium_maven_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WebDriverExample {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();

        // Navigate to the login page
        driver.get("https://opensource-demo.orangehrmlive.com");

        // Print current page title and URL
       // System.out.println("Title: " + driver.getTitle());
        //System.out.println("URL: " + driver.getCurrentUrl());

        // Click on the link with text "OrangeHRM, Inc"
        Thread.sleep(3000);
     driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
      

        // Print updated page title and URL
        System.out.println("Title after click: " + driver.getTitle());
       System.out.println("URL after click: " + driver.getCurrentUrl());

        // Get window handles
      String mainWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowIDs = new ArrayList<>(windowHandles);
       System.out.println("Window IDs: " + windowIDs);

        // Quit the driver
        driver.quit();
    }
}



	


