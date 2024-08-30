package testng;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameter {

    ChromeDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
    }

    @Test(priority = 2)
    public void testUrl() {
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://demo.nopcommerce.com/login?returnUrl=%2F", "URLs must be equal");
        System.out.println("Current URL: " + URL);
    }

    @DataProvider(name = "dp")
    public Object[][] loginData() {
        return new Object[][] {
            {"akritibakshi5020@gmail.com", "pinkbunny@123"},
            {"bakshiakriti4@gmail.com", "critcal@123456"},
            {"akriti@123", "akritibakshi@gmail.com"}
        };
    }

    @Test(priority = 3, dataProvider = "dp")
    public void login(String email, String pwd) {
        try {
            driver.findElement(By.id("Email")).sendKeys(email);
            driver.findElement(By.id("Password")).sendKeys(pwd);
            driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
            // Add assertions or further steps if needed to verify the login
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit(); // Use quit() to close all browser windows and end the WebDriver session
        }
    }
}
