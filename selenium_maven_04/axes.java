package selenium_maven_04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class axes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		List <WebElement> e=driver.findElements(By.xpath("//*[@id='email']//preceding::*"));
		System.out.println("Number of elements: " + e.size());
		//List <WebElement> elements=driver.findElements(By.xpath("//*[@id='pass']//preceding::*"));
		//System.out.println("Number of elements: " + elements.size());
		//List <WebElement> elements1=driver.findElements(By.xpath("//*[@id='pass']//following::*"));
		//System.out.println("Number of elements: " + elements1.size());
	List <WebElement> e1=driver.findElements(By.xpath("//*[@id='email']//following::*"));
		System.out.println("Number of elements: " + e1.size());
	
		System.out.println("////////////////////////////////////preceding///////////////////////////////////////////")	;
		for(WebElement i:e) {
		System.out.println(i.getText());
		}
		System.out.println("////////////////////////////////////following///////////////////////////////////////////")	;
	
		for(WebElement j:e1) {
			System.out.println(j.getText());
			}
	
}}
