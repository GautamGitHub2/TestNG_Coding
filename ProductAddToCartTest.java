package demo_accenture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utility_files.DriverUtil;

import java.util.concurrent.TimeUnit;

public class ProductAddToCartTest {
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
    public void productSearchUsingXPathSelector()
    {
        driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
        driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("testuser01");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("pass123");
        //driver.findElement(By.xpath("//input[@name='Login']")).click();
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("Gift set");
        driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
        driver.findElement(By.xpath("//a[@class='btn btn-success btn-product']")).click();
        driver.findElement(By.xpath("//a[@href='displayCart.htm']")).click();

        String productName=driver.findElement(By.xpath("//*[@id=\"cart\"]/tbody/tr/td[1]/div/div/h4")).getText();
        Assert.assertEquals(productName,"Gift Set");
        driver.findElement(By.xpath("//a[@href='logout.htm']")).click();

    }
}

