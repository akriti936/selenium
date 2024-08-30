package selenium_maven_04;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class rediff1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
EdgeDriver driver =new EdgeDriver();
		
		//open url--get()
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.manage().window().maximize();

	    System.out.println("Launch Browser");
	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	    driver.findElement(By.className("signinbtn")).click();

	    System.out.println("Handle Alert");
	    Alert alert= driver.switchTo().alert();
	    String alertMessage = driver.switchTo().alert().getText();
	    System.out.println(alertMessage);
	    Thread.sleep(3000);
	    //alert.accept();
alert.dismiss();
	    System.out.println("Alert Handled");
	    driver.quit();
	}

}
