package selenium_maven_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://jqueryui.com/datepicker/");
				driver.switchTo().frame(0);
				driver.findElement(By.xpath("//input[@id='datepicker']")).click();
				String date ="24";
				String year="2025";
				String month="August";
			
				while(true)
				{
					String mon=driver.findElement(By.xpath("/html/body/div/div/div/span[1]")).getText();
					String y=driver.findElement(By.xpath("/html/body/div/div/div/span[2]")).getText();
					
				if(year.equals(y) && month.equals(mon)) {
					
					break;
					
				}
				
				driver.findElement(By.xpath("/html/body/div/div/a[2]/span")).click();
	}
				
				

	}
}