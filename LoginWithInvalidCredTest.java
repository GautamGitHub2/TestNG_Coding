package demo_accenture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utility_files.DriverUtil;

import java.util.concurrent.TimeUnit;

public class LoginWithInvalidCredTest {
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
        driver.close();
    }
    @Test
    public void loginWithInvalidCredentialsTest()
    {
        driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
        driver.findElement(By.linkText("SignIn")).click();
        driver.findElement(By.id("userName")).sendKeys("testuser01");
        driver.findElement(By.id("password")).sendKeys("pass1234567");
        driver.findElement(By.name("Login")).click();

        String  errormessage = driver.findElement(By.xpath("//div[@id='errormsg'][2]")).getText();
        Assert.assertEquals(errormessage,"Username or Password is wrong here!!!");
    }

    @Test
    public void loginWithValidCredentialsTest()
    {
        driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
        driver.findElement(By.linkText("SignIn")).click();
        driver.findElement(By.id("userName")).sendKeys("testuser01");
        driver.findElement(By.id("password")).sendKeys("pass123");
        driver.findElement(By.name("Login")).click();

        Assert.assertEquals(driver.getTitle(),"Home");

        String messageOnHomePage=driver.findElement(By.xpath("//ul[@class='nav navbar-nav']")).getText();
        Assert.assertTrue(messageOnHomePage.contains("testuser01"));

    }
}
