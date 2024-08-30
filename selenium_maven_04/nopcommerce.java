package selenium_maven_04;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class nopcommerce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		//driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).click();
		//driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Computers");
		//driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		//driver.findElement(By.xpath("//div[@role='button']")).click();
		
		//driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		
		//driver.findElement(By.xpath("	//span[@class='wishlist-label']")).click();
		//driver.findElement(By.xpath("//span[@class='wishlist-qty']")).click();
		//driver.findElement(By.xpath("//span[@class='cart-label']")).click();
	WebElement web=	driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));
		web.click();
		Select dow=new Select(web);
		dow.selectByVisibleText("Notebooks");
		
		boolean b=driver.findElement(By.xpath("//h1[normalize-space()='Register']")).isDisplayed();
System.out.println(b);
List<WebElement>images=driver.findElements(By.tagName("img"));


System.out.println("Number of images: " + images.size());

List<WebElement>links=driver.findElements(By.tagName("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a"));
System.out.println("Number of links: " + links.size());
Boolean b1=driver.findElement(By.xpath("//strong[normalize-space()='Your Personal Details']")).isDisplayed();
System.out.println(b1);
WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
WebElement female = driver.findElement(By.xpath("//input[@id='gender-female']"));

System.out.println("before select");
female.click();
System.out.println("after select");

boolean l = male.isSelected();
System.out.println(l);
Boolean b4=driver.findElement(By.xpath("//label[normalize-space()='Gender:']")).isDisplayed();
System.out.println(b4);
Boolean b3=driver.findElement(By.xpath("//label[normalize-space()='First name:']")).isDisplayed();
System.out.println(b3);
Boolean textbox=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
System.out.println(textbox);
driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("akriti ");
Boolean b2=driver.findElement(By.xpath("//label[normalize-space()='Last name:']")).isDisplayed();
System.out.println(b2);
//dropdown 
WebElement dropdwn1=driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
dropdwn1.click();
List <WebElement> dropdwn2	=driver.findElements(By.xpath("//select[@name='DateOfBirthDay']//option"));
Select dropdown=new Select(dropdwn1);
dropdown.selectByIndex(24);
driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(" bakshi");

WebElement dropdwn3=driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
Select dropdwn=new Select(dropdwn3);
dropdwn.selectByIndex(5);

WebElement dropdwn5=driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
Select drop=new Select(dropdwn5);
drop.selectByValue("1996");



driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("aakritibakshi1996@gmail.com");
Boolean b7=driver.findElement(By.xpath("//strong[normalize-space()='Company Details']")).isDisplayed();
System.out.println(b7);
Boolean booo=driver.findElement(By.xpath("//label[normalize-space()='Company name:']")).isDisplayed();
System.out.println(booo);
driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("Bebo technologies");
Boolean bool=driver.findElement(By.xpath("//strong[normalize-space()='Options']")).isDisplayed();
System.out.println(bool);
Boolean bools=driver.findElement(By.xpath("//label[normalize-space()='Newsletter:']")).isDisplayed();
System.out.println(bools);
Boolean checkbox=driver.findElement(By.xpath("//input[@id='Newsletter']")).isEnabled();
System.out.println(checkbox);

Boolean pass=driver.findElement(By.xpath("//strong[normalize-space()='Your Password']")).isDisplayed();
System.out.println(pass);
Boolean pass1=driver.findElement(By.xpath("//label[normalize-space()='Password:']")).isDisplayed();
System.out.println(pass1);
driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("pinkbunny@123");
Boolean pass2=driver.findElement(By.xpath("//label[normalize-space()='Confirm password:']")).isDisplayed();
System.out.println(pass2);
driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("pinkbunny@123");
driver.findElement(By.xpath("//button[@id='register-button']")).click();
WebElement e=driver.findElement(By.xpath("//div[@class='footer-block information']//div[@class='title']"));
System.out.println(e.getText());
driver.findElement(By.xpath("//a[normalize-space()='Sitemap']")).click();
driver.findElement(By.xpath("//a[normalize-space()='Shipping & returns']")).click();
driver.findElement(By.xpath("//a[normalize-space()='Shipping & returns']")).click();
driver.findElement(By.xpath("//a[normalize-space()='Conditions of Use']")).click();
driver.findElement(By.xpath("//a[normalize-space()='About us']")).click();
driver.findElement(By.xpath("//a[normalize-space()='Conditions of Use']")).click();

WebElement w=driver.findElement(By.xpath("//div[@class='footer-block customer-service']//div[@class='title']"));
System.out.println(w.getText());
driver.findElement(By.xpath("//a[normalize-space()='Search']")).click();
driver.findElement(By.xpath("//a[normalize-space()='News']")).click();
driver.findElement(By.xpath("//a[normalize-space()='Blog']")).click();
driver.findElement(By.xpath("//a[normalize-space()='Recently viewed products']")).click();
driver.findElement(By.xpath("//a[normalize-space()='Compare products list']")).click();
driver.findElement(By.xpath("//a[normalize-space()='New products']")).click();
WebElement web2=driver.findElement(By.xpath("//div[@class='footer-block my-account']//div[@class='title']"));
System.out.println(web2.getText());
driver.findElement(By.xpath("//a[normalize-space()='My account']")).click();
driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();
driver.findElement(By.xpath("//a[normalize-space()='Addresses']")).click();
driver.findElement(By.xpath("//a[normalize-space()='Shopping cart']")).click();
driver.findElement(By.xpath("//a[normalize-space()='Wishlist']")).click();
driver.findElement(By.xpath("//a[normalize-space()='Apply for vendor account']")).click();

Boolean pas=driver.findElement(By.xpath("//strong[normalize-space()='Follow us']")).isDisplayed();
System.out.println(pas);
driver.findElement(By.xpath("//a[normalize-space()='Facebook']")).click();
driver.findElement(By.xpath("//a[normalize-space()='Twitter']")).click();

driver.findElement(By.xpath("//a[normalize-space()='YouTube']")).click();
driver.findElement(By.xpath("//a[normalize-space()='RSS']")).click();
driver.navigate().to("https://demo.nopcommerce.com/news/rss/1");

driver.navigate().back();  
Boolean o=driver.findElement(By.xpath("//strong[normalize-space()='Newsletter']")).isDisplayed();
System.out.println(o);
driver.findElement(By.xpath("//input[@id='newsletter-email']")).sendKeys("akritibakshi5020@gmail.com");
driver.findElement(By.xpath("//button[@id='newsletter-subscribe-button']")).click();
Boolean r=driver.findElement(By.xpath("//span[@class='footer-disclaimer']")).isDisplayed();
System.out.println(r);
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getPageSource());
System.out.println(driver.getWindowHandle());
String id=driver.getWindowHandle();
System.out.println(id);

driver.close();










	}}
