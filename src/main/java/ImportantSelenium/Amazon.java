package ImportantSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Amazon {

@Test
    public void Practice () throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25,TimeUnit.SECONDS);
        driver.manage().window().fullscreen();

    WebElement searchbtn = driver.findElement(By.xpath("//input[@Class='search-box-text ui-autocomplete-input']"));
    searchbtn.sendKeys("Camera & photo");

    WebElement search = driver.findElement(By.xpath("//button[@class='button-1 search-box-button']"));
    search.click();
    Thread.sleep(10000);

    WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
    register.click();



    }
}
