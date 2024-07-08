package ImportantSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Guru99 {
@Test
public void Guru () throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebElement flight = driver.findElement(By.xpath("//a[@href='reservation.php']"));
        flight.click();
        Thread.sleep(1000);
        Select passenger = new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
        passenger.selectByValue("2");
        Thread.sleep(1000);
        Select from = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
        from.selectByVisibleText("New York");
        Thread.sleep(1000);
        Select month = new Select(driver.findElement(By.xpath("//select[@name='fromMonth']")));
        month.selectByVisibleText("June");
        Thread.sleep(1000);
        Select date = new Select(driver.findElement(By.xpath("//select[@name='fromDay']")));
        date.selectByValue("31");
        Select arrive = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
        arrive.selectByVisibleText("Paris");
        Thread.sleep(1000);
        Select back = new Select(driver.findElement(By.xpath("//select[@name='toMonth']")));
        back.selectByVisibleText("November");
        Thread.sleep(1000);
        Select home = new Select(driver.findElement(By.xpath("//select[@name='toDay']")));
        home.selectByValue("10");
        Thread.sleep(1000);
        WebElement FlightType =driver.findElement(By.xpath("//input[@value='roundtrip']"));
        FlightType.click();
        Thread.sleep(1000);
        WebElement Preferences = driver.findElement(By.xpath("//input[@value='Business']"));
        Preferences.click();
        Thread.sleep(1000);
        Select Airlines = new Select(driver.findElement(By.xpath("//select[@name='airline']")));
        Airlines.selectByVisibleText("Unified Airlines");
        Thread.sleep(1000);
        WebElement FindFlights = driver.findElement(By.xpath("//input[@name='findFlights']"));
        FindFlights.click();



    }
}
