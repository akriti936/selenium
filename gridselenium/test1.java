package gridselenium;

import java.net.URL;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class test1 {

	RemoteWebDriver driver;
	
	@Test
	void setup() throws MalformedURLException, URISyntaxException
	{
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setBrowserName("chrome");
	cap.setPlatform(Platform.WINDOWS);
	
	//URL ur=new URL();
	driver=new RemoteWebDriver(new URI("http://192.168.0.7:4444").toURL(),cap);
	
	driver.get("https://www.google.co.in");
	System.out.println(driver.getTitle());

}
}