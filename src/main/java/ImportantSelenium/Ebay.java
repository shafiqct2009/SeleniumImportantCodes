package ImportantSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Ebay {

    @Test

    public void Ebay () {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25,TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
        search.sendKeys("men watches new");
        WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
        submit.click();




    }
}
