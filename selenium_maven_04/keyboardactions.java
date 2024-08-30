package selenium_maven_04;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://text-compare.com/");
Actions act=new Actions(driver);
act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();


//cntrol+shift+A
act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A");
act.keyDown(Keys.SHIFT).keyUp(Keys.CONTROL).sendKeys("A");

	}

}
