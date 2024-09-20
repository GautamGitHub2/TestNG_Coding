package POM_amazon_com.tests;

import POM_amazon_com.pages.AmazonHomePage;
import POM_amazon_com.pages.AmazonLoginPage;
import POM_amazon_com.pages.AmazonSignupPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility_files.DriverUtil;

import java.util.concurrent.TimeUnit;

public class AmazonSignupPageTests {

    WebDriver driver;
    AmazonHomePage amazonHomePage;
    AmazonLoginPage amazonLoginPage;
    AmazonSignupPage amazonSignupPage;

    @Test
    public void amazonSignupPageTestsMethod()
    {
        amazonHomePage=new AmazonHomePage(driver);
        amazonLoginPage=new AmazonLoginPage(driver);
        amazonSignupPage.AmazonSignupPage_Method();
    }

    @BeforeClass
    public void beforeClass()
    {
        driver= DriverUtil.getBrowserInstance("safari");
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    }

    @AfterClass
    public void afterClass()
    {
        driver.close();
    }
}
