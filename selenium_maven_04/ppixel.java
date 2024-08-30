package selenium_maven_04;





import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ppixel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver =new ChromeDriver();
driver.manage().window().minimize();
driver.get("https://www.nopcommerce.com/en/demo");
WebElement w=driver.findElement(By.xpath("/html/body/div[7]/header/nav/div[2]/a/img"));

System.out.println(w.getLocation());

Point p=new Point(87,45);
driver.manage().window().setPosition(p);

System.out.println(w.getLocation());
	}

}
