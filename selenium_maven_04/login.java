package selenium_maven_04;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		
driver.findElement(By.name("username")).sendKeys("Admin");
driver.findElement(By.name("password")).sendKeys("admin123");


driver.findElement(By.className("oxd-button")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

String windowhandles=driver.getWindowHandle();
Set<String> windowHandles = driver.getWindowHandles(); // Get all window handles
for (String handle : windowHandles) {
    if (!handle.equals(windowHandles)) {
        driver.switchTo().window(handle); // Switch to the pop-up window
        break;}}
  System.out.println( driver.getTitle());
    driver.close();
    driver.switchTo().window(windowhandles);
    }

//driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='oxd-table-filter']/div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[7]/div[1]/div[2]/div[1]/div[1]")).click();
//List<WebElement>links=driver.findElements(By.xpath("//div[@class='oxd-table-filter']"));
//System.out.println("Number of links: " + links.size());
//for (WebElement option : links) {
   // System.out.println(option.getText());
      //  if(option.getText().equals("select")||option.getText().equals("Sales & Marketing"))
       // {
        //clicking on the option
       //// option.click();
        //breaking the loop
        //break;
	}

	

