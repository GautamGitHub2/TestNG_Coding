package POM_amazon_com.tests;

import POM_amazon_com.pages.AmazonSearchByCategoryDropDownPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility_files.DriverUtil;

import java.util.concurrent.TimeUnit;

public class AmazonSearchByCategoryDropDownPageTests {
    WebDriver driver;
    AmazonSearchByCategoryDropDownPage amazonSearchByCategoryDropDownPage;


    @Test(priority = 1)
    public void amazonSearchByCategoryDropDownPageTestsMethod() {
        amazonSearchByCategoryDropDownPage=new AmazonSearchByCategoryDropDownPage(driver);
        amazonSearchByCategoryDropDownPage.amazonSearchByCategoryDropDownPageMethod();

        //This Test Case is working 100% fine.
    }

    @Test(priority = 2)
    public void testSelectMethod()
    {
        amazonSearchByCategoryDropDownPage=new AmazonSearchByCategoryDropDownPage(driver);
        amazonSearchByCategoryDropDownPage.amazonSearchByCategoryDropDownSelectMethod();

        /*
        This Test and related method is not working giving error:
        org.openqa.selenium.support.ui.UnexpectedTagNameException: Element should have been "select" but was "OPTION"
        */
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
