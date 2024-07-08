package ImportantSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NopRegister {
    @Test

    public void Nopcommerce() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
        register.click();Thread.sleep(1000);
        WebElement Male = driver.findElement(By.xpath("//input[@value='M']"));
        Male.click();Thread.sleep(1000);
        WebElement firstname = driver.findElement(By.xpath("//input[@id='FirstName']"));
        firstname.sendKeys("Shafiq");
        Thread.sleep(1000);
        WebElement lastname = driver.findElement(By.xpath("//input[@name='LastName']"));
        lastname.sendKeys("Alam");
        Thread.sleep(1000);
        Select day = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")));
        day.selectByIndex(25);
        Thread.sleep(1000);
        Select month = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")));
        month.selectByVisibleText("March");
        Thread.sleep(1000);
        Select year = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")));
        year.selectByValue("1991");
        Thread.sleep(1000);
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("shafiqemail@yaoo.com");
        Thread.sleep(1000);
        WebElement company = driver.findElement(By.xpath("//input[@name='Company']"));
        company.sendKeys("Mega Techs IT Solutions");
        Thread.sleep(1000);
        WebElement Newsletter = driver.findElement(By.xpath("//label[@for='Newsletter']"));
        Newsletter.click();
        Thread.sleep(1000);
        WebElement Checkbox = driver.findElement(By.xpath("//input[@id='Newsletter']"));
        Checkbox.click();
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("12345");
        Thread.sleep(1000);
        WebElement confirm = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confirm.sendKeys("12345");
        Thread.sleep(1000);
        WebElement Register = driver.findElement(By.xpath("//button[@type='submit']"));
        Register.click();
        Thread.sleep(2000);






    }
    }

