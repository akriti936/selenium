package selenium_maven_04;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class deadlink {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("Number of links: " + links.size());
		int brokenlink=0;
		for(WebElement linkelement:links) {
			String hrefvalue=linkelement.getAttribute("href");
			if(hrefvalue==null|| hrefvalue.isEmpty()){
				continue;
			}
			URL linkurl =new URL(hrefvalue);
				HttpURLConnection conn=(HttpURLConnection ) linkurl.openConnection();
				conn.connect();
				if(conn.getResponseCode()>400) 
				{
					System.out.println(hrefvalue+ " "+ "broken link");	
					brokenlink++;
			}
				else {
					System.out.println(hrefvalue+ " "+ "NOt broken link");
				}
		}
		
		System.out.println("the total no of broken links are:" +brokenlink);
				
	}

}
