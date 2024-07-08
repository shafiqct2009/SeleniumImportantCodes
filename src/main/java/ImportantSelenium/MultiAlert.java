package ImportantSelenium;

import org.openqa.selenium.Alert;
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.testng.annotations.AfterMethod;
    import org.testng.annotations.BeforeMethod;
    import org.testng.annotations.Test;

    import java.util.concurrent.TimeUnit;

public class MultiAlert {

    WebDriver driver=null;
    @BeforeMethod
    public void SetUp ()throws InterruptedException {

    driver = new ChromeDriver();
    driver.get("https://demo.guru99.com/test/delete_customer.php");
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    Thread.sleep(1000);
    }
    @AfterMethod
public void close(){
    driver.quit();
    }
    @Test
    public void Accept () throws InterruptedException {
    WebElement Id = driver.findElement(By.xpath("//input[@name='cusid']"));
    Id.sendKeys("123456");
    WebElement Submit = driver.findElement(By.xpath("//input[@type='submit']"));
    Submit.click();
    Alert Ok = driver.switchTo().alert();
    Ok.accept();
    Alert Yes = driver.switchTo().alert();
    Yes.accept();
    }
    @Test
    public void Cancel () throws InterruptedException {
    WebElement Cancel = driver.findElement(By.xpath("//input[@name='cusid']"));
    Cancel.sendKeys("55555");
    WebElement Submit = driver.findElement(By.xpath("//input[@value='Submit']"));
    Submit.click();Thread.sleep(5000);
    Alert alert = driver.switchTo().alert();
    alert.dismiss();
    }
    @Test
    public void Message () throws InterruptedException {
    WebElement Cancel = driver.findElement(By.xpath("//input[@name='cusid']"));
    Cancel.sendKeys("55555");
    WebElement Submit = driver.findElement(By.xpath("//input[@value='Submit']"));
    Submit.click();
    Alert alert = driver.switchTo().alert();
    alert.accept();
    String alertMessage = driver.switchTo().alert().getText();
    System.out.println(alertMessage);
    }
    }
