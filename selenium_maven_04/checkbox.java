package selenium_maven_04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//how to select one checkbox
		//driver.findElement(By.xpath("//input[@value='monday']")).click();
		//how to select multiple checkboxes
	
		List <WebElement> checkboxes	=driver.findElements(By.xpath("//*[@class='form-check-input'and @type='checkbox']"));
	//for(WebElement chk:checkboxes) {
		//chk.click();
		//for(int i=0;i<checkboxes.size();i++) {
			//checkboxes.get(i).click();
		//for(int i=4;i<checkboxes.size();i++) {
			//checkboxes.get(i).click();
		for(int i=0;i<3;i++) {
			checkboxes.get(i).click();
			
		}

		Thread.sleep(2000);
		
		for(int i=0;i<checkboxes.size();i++) {
			
		
		
			if(checkboxes.get(i).isSelected()) {
				checkboxes.get(i).click();
			}
			
		}}}
		
		
		
	


