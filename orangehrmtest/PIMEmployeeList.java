package orangehrmtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PIMEmployeeList {
	FirefoxDriver driver;
	@BeforeTest
	//@Test(priority=1)
	public void tearup() throws InterruptedException {
	   driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  
	  Thread.sleep(3000);
	}
	@Test(priority=2)
	public void logo() throws InterruptedException {
	  Thread.sleep(12000);
	 Boolean b= driver.findElement(By.xpath("//div[@class='orangehrm-login-logo']")).isDisplayed();
	 System.out.println(b);
	 if(b) {
		 System.out.println("logo is displayed");
	 }
	 else {
		 System.out.println("logo is not  displayed");
	 }
	}
	@Test(priority=3)
	public void login() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	  Thread.sleep(3000);}

	@Test(priority=4)
	public void adminlink() throws InterruptedException {
		  driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
			Thread.sleep(3000);
	}
	@Test(priority=5)
	public void PIM() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
		Thread.sleep(3000);
	}
	@Test(priority=6)
public void Employeelist() throws InterruptedException {
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a")).click();
		Thread.sleep(3000);
	}
	@Test(priority=7)
	
	public void EmployeeName() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys("sangeetasharma");
		Thread.sleep(3000);
		
	}
	@Test(priority=8)
	public void EmployeeId() throws InterruptedException {
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys("1234678");
		Thread.sleep(3000);
	}
	@Test(priority=9)
	public void EmployeeStatus() throws InterruptedException {
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div[2]/span")).click();
		Thread.sleep(3000);
	}
	@Test(priority=10)
	public void Include() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[2]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div[2]/div[2]/span")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority=11)
	public void SupervisorName() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[5]/div/div[2]/div/div/input")).sendKeys("VNTester");
		Thread.sleep(3000);
	}
	@Test(priority=12)
	public void JobTitle() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div/div[2]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div[2]/div[2]/span")).click();
		Thread.sleep(3000);
	}
	@Test(priority=13)
	
	public void SubUnit() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[7]/div/div[2]/div/div/div[2]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[7]/div/div[2]/div/div[2]/div[3]/span")).click();
		Thread.sleep(3000);
	}
	@Test(priority=14)
	public void search() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
		Thread.sleep(3000);
	}
	@Test(priority=15)
	
	public void addbutton() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
		Thread.sleep(3000);
	}
	@Test(priority=16)
	public void UploadImage() throws InterruptedException {
		WebElement add =driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/div/button/i"));//imagelocation
		add.click();
		Thread.sleep(3000);
		WebElement frame =driver.switchTo().activeElement();
		Thread.sleep(3000);
		  frame.sendKeys("C:\\Users\\akusharma\\Downloads\\abc.jpeg");//uploadimage
		   
		  
		Thread.sleep(3000);
	}
	@Test(priority=17)
	public void EmployeeFullName() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input")).sendKeys("akansha");//employee name
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input")).sendKeys("sharma");//middlename
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input")).sendKeys("sharma");//last name
		Thread.sleep(3000);
		
	}
	@Test(priority=18)
	public void employeeId() throws InterruptedException {
		Thread.sleep(3000);
	WebElement emp=	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input"));
	Thread.sleep(3000);
		emp.sendKeys("123455");
		Thread.sleep(3000);
		emp.clear();
		Thread.sleep(3000);
		emp.sendKeys("123456");
		Thread.sleep(3000);
		
	}
	@Test(priority=19)
	public void CreateLoginDetails() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span")).click();
		Thread.sleep(3000);
	}
	@Test(priority=20)
	public void UserName() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input")).sendKeys("akashit");//username
		Thread.sleep(3000);

	}
	@Test(priority=21)
	public void password() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input")).sendKeys("sharma@123");//password
		Thread.sleep(3000);
	}
	@Test(priority=22)
	
	public void confirmpassword() throws InterruptedException {
		Thread.sleep(3000);
driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input")).sendKeys("sharma@123");//confirm password
		
		Thread.sleep(3000);
	}
	@Test(priority=23)
	
	public void savebutton() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();//save
		Thread.sleep(4000);
		
	}
	@AfterTest
	public void logout() {
		  driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
