package ImportantSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MouseOver {

@Test

public void Actions () throws InterruptedException {

            WebDriver driver = new ChromeDriver();
            driver.get("https://demo.nopcommerce.com/register?");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(25,TimeUnit.SECONDS);
            Actions actions = new Actions(driver);
            WebElement menuOption = driver.findElement(By.xpath("//a[text()='Computers '][1]"));
            actions.moveToElement(menuOption).perform();
            Thread.sleep(2000);
            WebElement Electronics = driver.findElement(By.xpath("//a[text()='Electronics '][1]"));
            actions.moveToElement(Electronics).perform();
            Thread.sleep(1000);
            WebElement Apparel = driver.findElement(By.xpath("//a[text()='Apparel '][1] "));
            actions.moveToElement(Apparel).perform();
            Thread.sleep(1000);
            WebElement Digital = driver.findElement(By.xpath("//a[text()='Digital downloads '][1]"));
            actions.moveToElement(Digital).perform();
            Thread.sleep(1000);
            WebElement Books = driver.findElement(By.xpath("//a[text()='Books '][1]"));
            actions.moveToElement(Books).perform();
            Thread.sleep(1000);
            WebElement Jewlry = driver.findElement(By.xpath("//a[text()='Jewelry '][1]"));
            actions.moveToElement(Jewlry).perform();
            Thread.sleep(1000);
            WebElement GiftCards = driver.findElement(By.xpath("//a[text()='Gift Cards '][1]"));
            actions.moveToElement(GiftCards).perform();
            Thread.sleep(1000);
            driver.close();


    }
}
