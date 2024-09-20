package demo_accenture;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utility_files.DriverUtil;

import java.util.concurrent.TimeUnit;

public class KeyboardAndMouseTest {
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
        driver.quit();
    }
    @Test
    public void keyboardAndMouseTestMethod()
    {
        driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");

        Actions actions=new Actions(driver);
        actions
                .keyDown(Keys.SHIFT)
                .click(driver.findElement(By.partialLinkText("SignIn")))
                .keyUp(Keys.SHIFT)
                .build()
                .perform();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
