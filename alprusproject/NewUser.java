package alprusproject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewUser {
	ChromeDriver driver;
	@BeforeClass
  //@Test(priority=1)
  public void tearup() throws InterruptedException {
	   driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://182.76.176.205/btes/");
	  Thread.sleep(3000);
  }
	@Test(priority=2)
	public void login() throws InterruptedException {
		  Thread.sleep(7000);
	driver.findElement(By.name("username")).sendKeys("admin");
	  Thread.sleep(7000);
	 driver.findElement(By.name("passwd")).sendKeys("admin"); 
	  Thread.sleep(7000);
	  driver.findElement(By.xpath("//*[@id=\"mod_login_remember\"]")).click();
	  Thread.sleep(7000);
	  driver.findElement(By.name("Submit")).click();
	  Thread.sleep(7000);
}
	@Test(priority=3)
	public void newuser() throws InterruptedException {
		Thread.sleep(7000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/div/div/div/form/a[4]")).click();
		Thread.sleep(7000);
	}
	@Test(priority=4)
	public void header() throws InterruptedException {
		Thread.sleep(7000);
WebElement w=	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[2]/form/div"));
	System.out.println(w);
	Thread.sleep(7000);
	}
	@Test(priority=5)
	public void Name() throws InterruptedException {
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id=\"newuser_name\"]")).sendKeys("akriti");
		Thread.sleep(7000);
	}
	
	@Test(priority=6)
	public void username() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"newuser_username\"]")).sendKeys("akritisharma");
		Thread.sleep(3000);
		String actual= driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[2]/form/table/tbody/tr[4]/td[1]")).getText();

		String expected = "Usename";
		
		Assert.assertEquals(actual,expected, "not equal to expected");
		
	}
	@Test(priority=7)
	public void email() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"newuser_email\"]")).sendKeys("akritibakshi5020@gmail.com");
		Thread.sleep(3000);
	}
	@Test(priority=8)
	public void Telephone() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"telephone\"]")).sendKeys("9896234678");
		Thread.sleep(3000);
	}
	@Test(priority=9)
	public void  Zip() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"zip\"]")).sendKeys("135002");
		Thread.sleep(3000);
	}
	@Test(priority=10)
	public void Newpassword() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"newuser_password\"]")).sendKeys("pinkbunny@123");
		Thread.sleep(3000);
	}
	@Test(priority=11)
	public void verifypassword() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"newuser_password2\"]")).sendKeys("pinkbunny@123");
		Thread.sleep(3000);
	}
	
	
	@Test(priority=12)
	public void savebutton() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mysave\"]")).click();
		Thread.sleep(3000);
	}
	@Test(priority=13)
	
	public void message() throws InterruptedException {
		Thread.sleep(3000);
	WebElement w=	driver.findElement(By.xpath("//*[@id=\"maincol-wide-800\"]/div[2]/span"));
	System.out.print(w.getText());
	Thread.sleep(3000);
	}
	
	@AfterClass

	public void logout() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/div/div/div/form/div/input")).click();
		Thread.sleep(3000);
	}
	
}