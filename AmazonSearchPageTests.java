package POM_amazon_com.tests;

import POM_amazon_com.pages.AmazonSearchPage;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility_files.DriverUtil;

import java.util.concurrent.TimeUnit;

public class AmazonSearchPageTests {

    WebDriver driver;

    AmazonSearchPage amazonSearchPage;

    @Test
    public void AmazonSearchPageTestsMethod()
    {
        amazonSearchPage=new AmazonSearchPage(driver);
        amazonSearchPage.clickOnSearchSubmitButton();

        System.out.println("This Test has been passed...");
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
