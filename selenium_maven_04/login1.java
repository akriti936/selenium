package selenium_maven_04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class login1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		WebElement dropdwn=driver.findElement(By.xpath("//select[@id='country-list']"));
		dropdwn.click();
		
		Select dropdown=new Select(dropdwn);
		dropdown.selectByVisibleText("France");
		
		List <WebElement> dropdwn1	=driver.findElements(By.xpath("//select[@id='country-list']//option"));
		for (WebElement option : dropdwn1) {
            String text = option.getText();
            System.out.println(text);
		
		
		WebElement dropdwn3=driver.findElement(By.xpath("//select[@id='state-list']"));
		dropdwn3.click();
		
		List <WebElement> dropdwn2	=driver.findElements(By.xpath("//select[@id='state-list']//option"));
		for (WebElement option1 : dropdwn2) {
            String text1 = option1.getText();
            System.out.println(text1);
            if (text.equals("Select State") || text.equals("haryana")) {
                option.click();
            }
        
}}}}