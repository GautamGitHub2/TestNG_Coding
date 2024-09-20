package demo_accenture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utility_files.DriverUtil;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class ImplicitAndExplicitWait {
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
    public void implicitAndExplicitWaitTest(Function<? super WebDriver, ? extends Object> ExpectedConditions)
    {
        driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
        driver.findElement(By.linkText("SignIn")).click();
        driver.findElement(By.id("userName")).sendKeys("testuser01");
        driver.findElement(By.id("password")).sendKeys("pass1234567");
        driver.findElement(By.name("Login")).click();
        driver.findElement(By.linkText("SignOut")).click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions);
        driver.findElement(By.linkText("SignIn")).click();
    }
}
