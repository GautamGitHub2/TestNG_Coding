package demo_accenture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utility_files.DriverUtil;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driver= DriverUtil.getBrowserInstance("safari");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
    }
    @AfterTest
    public void afterTest()
    {
        //driver.close();

    }
    @Test
    public void loginTestMethod()
    {
        driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
        System.out.println(driver.getTitle());

        //Assert.assertEquals(driver.getTitle(),"Home");

        WebElement signInLink=driver.findElement(By.linkText("SignIn"));
        signInLink.click();

        //driver.findElement(By.linkText("SignIn")).click();
        System.out.println(driver.getTitle());

        //Assert.assertEquals(driver.getTitle(),"Login");

        WebElement userNameTxt= driver.findElement(By.name("userName"));
        userNameTxt.sendKeys("testuser01");

        //*[@id="userName"]

        WebElement passwordTxt= driver.findElement(By.name("password"));
        passwordTxt.sendKeys("pass123");

        WebElement loginBtn= driver.findElement(By.name("Login"));
        loginBtn.click();
        System.out.println(driver.getTitle());

        //Assert.assertEquals(driver.getTitle(),"Home");

        WebElement signOutLink= driver.findElement(By.partialLinkText(" SignOut"));
        signOutLink.click();



    }
}
