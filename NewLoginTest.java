package demo_accenture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility_files.DriverUtil;
import utility_files.ExcelUtil;

import java.util.concurrent.TimeUnit;

public class NewLoginTest
{
    WebDriver driver;

    @BeforeTest
    public void beforeTest()
    {
        driver= DriverUtil.getBrowserInstance("safari");
        driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
    }

    @Test(dataProvider = "xldata")
    public void testLoginFromXL(String email,String password,String type)
    {
        driver.findElement(By.partialLinkText("SignIn")).click();
        driver.findElement(By.id("userName")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.name("Login")).click();
        boolean signoutDisplayed=driver.findElement(By.partialLinkText("SignOut")).isDisplayed();
        Assert.assertTrue(signoutDisplayed);
        driver.findElement(By.partialLinkText("SignOut")).click();
    }

    @AfterTest
    public void afterTest()
    {
        driver.close();
    }

    @DataProvider(name = "xldata")
    public Object[][] getDataFromXL()
    {
        return ExcelUtil.readDataFromExcel("TestData");
    }



}
