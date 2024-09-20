package POM_amazon_com.tests;

import POM_amazon_com.pages.AmazonHomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility_files.DriverUtil;

import java.util.concurrent.TimeUnit;

public class AmazonHomePageTests {

    WebDriver driver;
    AmazonHomePage amazonHomePage;

    @Test
    public void AmazonHomePageTestsMethod()
    {
        amazonHomePage=new AmazonHomePage(driver);
        amazonHomePage.click_signin_homepage();
    }
    @BeforeClass
    public void beforeClass()
    {
        driver= DriverUtil.getBrowserInstance("safari");
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
    }
    @AfterClass
    public void afterClass()
    {
        driver.close();
    }
}
