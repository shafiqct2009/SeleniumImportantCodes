package ImportantSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SubmenuSelect {
    @Test

    public void DropDown() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        WebElement menuOptions = driver.findElement(By.xpath("//a[text()='Computers '][1]"));
        actions.moveToElement(menuOptions).perform();
        Thread.sleep(1000);
        WebElement DesktopComputers = driver.findElement(By.xpath("//a[text()='Desktops '][1]"));
        actions.moveToElement(DesktopComputers).perform();
        Thread.sleep(1000);
        WebElement desktops = driver.findElement(By.xpath("//a[text()='Desktops '][1]"));
        desktops.click();
        Thread.sleep(1000);
        WebElement Computers = driver.findElement(By.xpath("//a[text()='Computers '][1]"));
        actions.moveToElement(Computers).perform();
        Thread.sleep(1000);
        WebElement Notebooks = driver.findElement(By.xpath("//a[text()='Notebooks '][1]"));
        Notebooks.click();
        Thread.sleep(1000);
        WebElement Computer = driver.findElement(By.xpath("//a[text()='Computers '][1]"));
        actions.moveToElement(Computer).perform();
        Thread.sleep(1000);
        WebElement Software = driver.findElement(By.xpath("//a[text()='Software '][1]"));
        Software.click();
        Thread.sleep(5000);
        driver.close();


    }
}