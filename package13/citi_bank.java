package package13;


		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;


		public class citi_bank{
			public static void main(String[] args) throws Exception {
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		Thread.sleep(3000);
				String file = System.getProperty("user.dir") + "\\TestData\\CITIBank.xlsx";	
				int rows = ExcelUtils.getRowCount(file, "Sheet1");	// no of rows
//					read the data from excel
				for(int i = 1; i<=rows; i++) {
					String Amount = ExcelUtils.getCellData(file, "Sheet1", i, 0);
					String Length = ExcelUtils.getCellData(file, "Sheet1", i, 1);
					String InterestRate = ExcelUtils.getCellData(file, "Sheet1", i, 2);		//textbox
					String Compound = ExcelUtils.getCellData(file, "Sheet1", i, 3);
					String exp = ExcelUtils.getCellData(file, "Sheet1", i, 4);
//					pass the data to application
					WebElement amount = driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]"));
					amount.clear();
					amount.sendKeys(Amount);
					WebElement length = driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]"));
					length.clear();		
					length.sendKeys(Length);
					WebElement rate = driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]"));
					rate.clear();
					rate.sendKeys(InterestRate);
					Thread.sleep(5000);
					WebElement dropdown = driver.findElement(By.xpath("//mat-select[@id='mat-select-0']"));
					dropdown.click();
					WebElement option = driver.findElement(By.xpath("//mat-option[@id='mat-option-4']"));
					option.click(); 
					WebElement calbutton = driver.findElement(By.xpath("//button[@id='CIT-chart-submit']"));
					calbutton.click();
					String act = driver.findElement(By.xpath("//span[@id='cdAPY']")).getText();
					if (Double.parseDouble(act)==Double.parseDouble(exp)) {
						System.out.println("Test passed");		// Printing on console
						ExcelUtils.setCellData(file, "Sheet1", i, 5, "Passed");		// Printing on sheet(excel file)
						ExcelUtils.fillGreenColor(file, "Sheet1", i,5);
					}
					else {
						System.out.println("Test failed");
						ExcelUtils.setCellData(file, "Sheet1", i, 5, "Failed");
						ExcelUtils.fillRedColor(file, "Sheet1", i, 5);
					}
					Thread.sleep(5000);

				}
				driver.close();
			}

		
	}


