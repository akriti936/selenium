package selenium_maven_04;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class maven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver d=new ChromeDriver();
d.get("http://www.automationpractice.pl/index.php");	
//d.findElement(By.id("search_query_top")).sendKeys("top");
//d.findElement(By.name("submit_search")).click();
//d.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
//d.findElement(By.partialLinkText("Faded Short")).click();
//locator-2


List<WebElement>slider=d.findElements(By.className("homeslider-container"));
System.out.print(slider.size());

List<WebElement>images=d.findElements(By.tagName("img"));


System.out.println("Number of images: " + images.size());

List<WebElement>links=d.findElements(By.tagName("a"));
System.out.println("Number of links: " + links.size());

d.close();
}

}
