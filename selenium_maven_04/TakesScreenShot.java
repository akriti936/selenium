package selenium_maven_04;



import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import java.io.*;

import org.openqa.selenium.*;

public class TakesScreenShot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		TakesScreenshot ts = driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("C:\\Users\\akusharma\\Pictures\\full.png");	
		Files.copy(src, trg);
	}

}
