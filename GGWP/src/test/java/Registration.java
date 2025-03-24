import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;



public class Registration {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\shilpaul\\Desktop\\Selenium\\chromedriver.exe");
        WebDriver signup = new ChromeDriver();
        signup.get("https://demowebshop.tricentis.com/");
        Thread.sleep(2000);
        signup.manage().window().maximize();
        Thread.sleep(2000);
        signup.findElement(By.xpath("//a[@href=\"/register\"]")).click();
        Thread.sleep(2000);
        signup.findElement(By.xpath("//input[@id=\"gender-male\"]")).click();
        Thread.sleep(1000);
        signup.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys("test");
        Thread.sleep(1000);
        signup.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys("demo");
        Thread.sleep(1000);
        signup.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("testdemo2287@yopmail.com");
        ((JavascriptExecutor) signup).executeScript("window.scrollBy(0, 100)");
        Thread.sleep(1000);
        signup.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("Test@123");
        Thread.sleep(1000);
        signup.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]")).sendKeys("Test@123");
        Thread.sleep(1000);
        signup.findElement(By.xpath("//input[@id=\"register-button\"]")).click();
        Thread.sleep(1000);
        signup.findElement(By.xpath("//input[@class=\"button-1 register-continue-button\"]")).click();
        Thread.sleep(2000);
        signup.quit();
    }

}
