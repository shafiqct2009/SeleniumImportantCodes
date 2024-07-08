package ImportantSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Target {
@Test
    public void Target () throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.target.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement search = driver.findElement(By.xpath("//input[@name='searchTerm']"));
        search.sendKeys("Back to School");
        WebElement click = driver.findElement(By.xpath("//button[@type='submit']"));
        click.click();

}
}
