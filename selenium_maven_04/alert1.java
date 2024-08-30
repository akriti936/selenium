package selenium_maven_04;

import org.openqa.selenium.firefox.FirefoxDriver;

public class alert1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		FirefoxDriver driver = new FirefoxDriver();
		// Navigate to the URL with basic authentication
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(3000);
		driver.close();
}


	}


