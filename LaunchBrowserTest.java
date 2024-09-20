package demo_accenture;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utility_files.DriverUtil;

public class LaunchBrowserTest {
    WebDriver driver;

    @Test
    public void testDemoShopLaunch()
    {
        driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
        Assert.assertEquals(driver.getTitle(),"Home");
    }

    @BeforeTest
    public void beforeTest()
    {
        driver= DriverUtil.getBrowserInstance("safari");
        driver.manage().window().maximize();
    }

    @AfterTest
    public void afterTest()
    {
        driver.close();

    }
}

         /*
         WebDriverManager.safaridriver().setup();
         driver =new SafariDriver();
         driver.manage().window().maximize();
         */