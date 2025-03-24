import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class EndToEndFlow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\shilpaul\\Desktop\\Selenium\\chromedriver.exe");
        WebDriver endToEnd = new ChromeDriver();
        endToEnd.get("https://demowebshop.tricentis.com/");
        endToEnd.manage().window().maximize();

        endToEnd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // Waits up to 10 seconds


        endToEnd.findElement(By.xpath("//a[@href=\"/login\"]")).click();

        endToEnd.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("testdemo288@yopmail.com");

        endToEnd.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("Test@123");
        endToEnd.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
        endToEnd.findElement(By.xpath("//input[@id=\"small-searchterms\"]")).sendKeys("Book");
        endToEnd.findElement(By.xpath("//input[@type=\"submit\"]")).click(); //search
        endToEnd.findElement(By.xpath("//input[@value=\"Add to cart\"]")).click();
        endToEnd.findElement(By.xpath("//a[@href=\"/apparel-shoes\"]")).click();
        endToEnd.findElement(By.xpath("//a[@href=\"/apparel-shoes?pagenumber=2\"]")).click();
        endToEnd.findElement(By.xpath("//div[@data-productid=\"81\"]")).click();
        endToEnd.findElement(By.xpath("//input[@data-productid=\"81\"]")).click();
        endToEnd.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[3]/a")).click();
        endToEnd.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[2]/div/h2/a")).click();
        endToEnd.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input")).click();
        endToEnd.findElement(By.xpath("(//*[text()='Shopping cart'])[1]")).click();
        endToEnd.findElement(By.xpath("//button[@id=\"checkout\"]")).click();
        endToEnd.findElement(By.xpath("//span[@class=\"ui-button-icon-primary ui-icon ui-icon-closethick\"]")).click();
        endToEnd.findElement(By.xpath("//input[@id=\"termsofservice\"]")).click();
        endToEnd.findElement(By.xpath("//button[@id=\"checkout\"]")).click();
        endToEnd.findElement(By.xpath("//input[@onclick=\"Billing.save()\"]")).click(); //billing add
        endToEnd.findElement(By.xpath("//input[@onclick=\"Shipping.save()\"]")).click(); // shipping add
        endToEnd.findElement(By.xpath("//input[@onclick=\"ShippingMethod.save()\"]")).click(); //shipping meth
        endToEnd.findElement(By.xpath("//input[@onclick=\"PaymentMethod.save()\"]")).click(); // payment meth
        endToEnd.findElement(By.xpath("//input[@onclick=\"PaymentInfo.save()\"]")).click(); //payment info
        endToEnd.findElement(By.xpath("//input[@onclick=\"ConfirmOrder.save()\"]")).click(); //order confirmation
        endToEnd.findElement(By.xpath("//a[starts-with(@href,\"/orderdetails\")]")).click();


    }
}
