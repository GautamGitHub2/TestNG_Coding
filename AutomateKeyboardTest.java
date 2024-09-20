package demo_accenture;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utility_files.DriverUtil;

import java.util.concurrent.TimeUnit;

public class AutomateKeyboardTest {
    WebDriver driver;

    @BeforeTest
    public void beforeTest()
    {
        driver= DriverUtil.getBrowserInstance("safari");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

    }
    @AfterTest
    public void afterTest()
    {
        driver.quit();
    }
    @Test
    public void automateKeyboardTestMethod()
    {
        driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");

        WebElement searchBox= driver.findElement(By.id("myInput"));
        Actions actions=new Actions(driver);
        actions.keyDown(searchBox, Keys.SHIFT)
                .sendKeys(searchBox,"b").pause(3000)
                .sendKeys(searchBox,"a").pause(3000)
                .sendKeys(searchBox,"g").pause(3000).build().perform();

       driver.findElement(By.xpath("//div[contains(text(),'Hand bag')]")).click();
       driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }}
