package selenium_maven_04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
	WebElement dropdwn=driver.findElement(By.xpath("//select[@id='country']"));
		//dropdwn.click();
		//List <WebElement> dropdwn1	=driver.findElements(By.xpath("//select[@id='country']//option"));
		//System.out.println(dropdwn1.size());
		// for (WebElement option : dropdwn1) {
	            //String text = option.getText();
	            //System.out.println(text);
		
		//for(WebElement chk:checkboxes) {
	
		Select dropdown=new Select(dropdwn);
//select by value:-
//dropdown.selectByValue("uk");
//dropdown.selectByIndex(4);
//total no of elements:-

	}

	}


