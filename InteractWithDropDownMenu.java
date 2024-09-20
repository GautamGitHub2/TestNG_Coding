package demo_accenture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utility_files.DriverUtil;

import java.util.concurrent.TimeUnit;

public class InteractWithDropDownMenu {
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
    public void InteractWithDropDownMenuTest()
    {
        driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
        driver.findElement(By.linkText("SignUp")).click();

        Select s1=new Select(driver.findElement(By.id("securityQuestion")));
        //s1.selectByVisibleText("What is your Pet Name?");

        //s1.selectByVisibleText("411011");
        s1.selectByIndex(3);

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

/*

Implicit Wait: An implicit wait polls DOM for a certain amount of time when trying to find an element or elements if they are not immediately available
However, an implicit wait may slow down your tests when an application responds normally, as it will wait for each element appearing in DOM and increases overall execution time.

driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

Explicit Wait: It is used for synchronizing tests on a particular web element, which provides better control when compared with an implicit wait.

-> It is the code defined to wait for a certain condition to occur before proceeding to further execution of test steps
-> It can only be implimented in cases where synchronizations is required only for a specific WebElement
-> The Selenium WebDriver provides library classes like WebDriverWait and ExpectedConditions for implementing an explicit wait.
-> Used mainly for AJAX-based web elements

Example:

WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("SignIn")));







 */