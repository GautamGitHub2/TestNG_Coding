package demo_accenture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utility_files.DriverUtil;

import java.util.concurrent.TimeUnit;

public class MouseHoverActions {
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
    public void mouseHoverActionsTest()
    {
        driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
        Actions actions=new Actions(driver);
        actions
                .moveToElement(driver.findElement(By.xpath("//span[contains(text(),'AboutUs')]")))
                .moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Offices')]")))
                .moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Bangalore')]")))
                .click().build().perform();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
