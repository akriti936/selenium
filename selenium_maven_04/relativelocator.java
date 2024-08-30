package selenium_maven_04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativelocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		List <WebElement> pre = driver.findElements(By.xpath("//input[@id='email']//preceding::*"));
		
		System.out.println("Preceding is " + pre.size());
		
		List <WebElement> fol = driver.findElements(By.xpath("//input[@id='email']//following::*"));
		
		System.out.println("Following is " + fol.size());
		
		System.out.println("/////////////////////// PRECEDING /////////////////////////////////");
		
		for ( WebElement i : pre)
		{
			System.out.println(i.getText());
		}
		
		System.out.println("/////////////////////// FOLLOWING /////////////////////////////////");
		
		for ( WebElement j : fol)
		{
			System.out.println(j.getText());
		}
		
		driver.close();
	}


	}


