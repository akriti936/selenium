package selenium_maven_04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://testautomationpractice.blogspot.com/");
Thread.sleep(3000);
List<WebElement> allRows= driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));

// We will start from 2nd row as 1st row is header
for(int i=2;i<=allRows.size();i++)
{
   List<WebElement> allColumnsInRow=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td"));
   System.out.println("Number of columns in "+(i-1)+" data row is:"+allColumnsInRow.size());
}
//Finding number of rows in a web table. We need to exclude header to get actual number of data rows
System.out.println("Retrieving total number of data rows:");
List<WebElement> allRows1= driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
System.out.println("Total data rows found in table:"+ (allRows1.size()-1));
System.out.println("==");
// Find the number of columns in each row

System.out.println("Retrieving total number of columns for each row:");
for(int i=2;i<=allRows1.size();i++)
{
   List<WebElement> allColumnsInRow=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td"));
   System.out.println("Number of columns in "+(i-1)+" data row is:"+allColumnsInRow.size());
}
System.out.println("=======");

//Print each row and columns from web table

System.out.println("Printing all column value: ");
for(int i=2;i<=allRows.size();i++)
{
   List<WebElement> allColumnsInRow=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td"));
   for(int j=0;j<allColumnsInRow.size();j++)
   {
      System.out.print(((WebElement) allColumnsInRow.get(j)).getText()+" ");
   }
   System.out.println();
}
List<WebElement> columnOfLastRow= driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[last()]/td"));
for(WebElement e:columnOfLastRow)
{
   System.out.println(e.getText());
}
System.out.println("========");

//find sum of cost of all books listed
List<WebElement> costColumns= driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/td[4]"));
int sum_price=0;
for(WebElement e:costColumns)
{
   sum_price= sum_price+Integer.parseInt(e.getText());
}
System.out.println("total price: "+sum_price);
System.out.println("");

	}

}
