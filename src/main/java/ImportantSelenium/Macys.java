package ImportantSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Macys {

    @Test
    public void Macy () {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.macys.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25,TimeUnit.SECONDS);
        driver.manage().window().fullscreen();

    }

}
