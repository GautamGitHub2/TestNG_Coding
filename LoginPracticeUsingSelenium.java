package practice_automation_testing.homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utility_files.DriverUtil;

import java.time.Duration;

public class LoginPracticeUsingSelenium {
    WebDriver driver;

    @BeforeTest
    public void beforeTest()
    {
        driver= DriverUtil.getBrowserInstance("safari");
        driver.get("https://www.linkedin.com/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @AfterTest
    public void afterTest()
    {
        driver.close();
    }
    @Test
    public void loginPracticeUsingSelenium_Method()
    {
        WebElement username= driver.findElement(By.id("username"));
        WebElement password= driver.findElement(By.id("password"));
        WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
        username.sendKeys("example@gmail.com");
        password.sendKeys("password");
        login.click();
        String actualUrl="https://www.linkedin.com/checkpoint/lg/login-submit";
        String expectedUrl= driver.getCurrentUrl();

        //Assert Method
        //Assert.assertEquals(expectedUrl,actualUrl);

        //If-Else Method
        if (actualUrl.equalsIgnoreCase(expectedUrl))
        {
            System.out.println("Test has been PASSED...!!");
        }
        else {
            System.out.println("Test has been FAILED...!!");
        }
    }
}
