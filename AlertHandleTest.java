package demo_accenture;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utility_files.DriverUtil;

import java.util.concurrent.TimeUnit;

public class AlertHandleTest {

    WebDriver driver;

    @BeforeTest
    public void beforeTest()
    {
        driver= DriverUtil.getBrowserInstance("safari");
        driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

    }
    @AfterTest
    public void afterTest()
    {
        driver.quit();
    }

    @Test
    public void alertHandleTestMethod()
    {
        driver.findElement(By.cssSelector("input[value='FIND DETAILS']")).click();

        if (ExpectedConditions.alertIsPresent()!=null)
        {
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        Assert.assertEquals(alert.getText(),"Please enter some product name");
        alert.accept();
    }
}}

/*
Other automation site for alerts: demo.automationtesting.in/Alerts.html



 */
