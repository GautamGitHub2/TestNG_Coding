package POM_amazon_com.tests;

import POM_amazon_com.pages.AmazonYourAccountPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility_files.DriverUtil;

import java.util.concurrent.TimeUnit;

public class AmazonYourAccountPageTests {
    WebDriver driver;
    AmazonYourAccountPage amazonYourAccountPage;

    @Test
    public void AmazonYourAccountPageTestsMethods() throws InterruptedException {
        amazonYourAccountPage=new AmazonYourAccountPage(driver);
        amazonYourAccountPage.amazonYourAccount_Method();
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
