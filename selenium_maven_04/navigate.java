package selenium_maven_04;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class navigate {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("https://www.amazon.in/?");/
		driver.navigate().to("https://www.amazon.in/?");
	//	URL url =new URL("https://www.amazon.in/?");
		//driver.navigate().to(url);
		System.out.println(driver.getCurrentUrl());
		
		
		
		driver.navigate().to("https://www.flipkart.com/");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();  
		driver.navigate().to("https://www.google.com/intl/en-US/gmail/about/");  
		  
        //Refresh browser  
        driver.navigate().refresh();  
    
        //Closing browser  
        driver.close();   
        
	}

}
