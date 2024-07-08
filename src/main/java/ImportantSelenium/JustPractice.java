package ImportantSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class JustPractice {

@Test
    public void JustPractice() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register?");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25,TimeUnit.SECONDS);
        Actions actions = new Actions(driver);
        WebElement Computers = driver.findElement(By.xpath("//a[text()='Computers ']"));
        actions.moveToElement(Computers).perform();
        Thread.sleep(1000);

        driver.close();

    }


}
