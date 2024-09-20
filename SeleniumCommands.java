package demo_accenture;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utility_files.DriverUtil;

import java.util.concurrent.TimeUnit;

public class SeleniumCommands {
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
    public void testMethods()
    {
        driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
        System.out.println("Page Title: "+ driver.getTitle());
        System.out.println("Page URL: " + driver.getCurrentUrl());

        driver.navigate().to("https://lkmdemoaut.accenture.com/TestMeApp/login.htm");
        System.out.println("Page Title: "+ driver.getTitle());
        System.out.println("Page URL: " + driver.getCurrentUrl());

        driver.navigate().back();
        System.out.println("Page Title: "+ driver.getTitle());
        System.out.println("Page URL: " + driver.getCurrentUrl());

        driver.navigate().refresh();
    }
}
