package POM_com.tests;

import POM_com.pages.HomePageFactory;
import POM_com.pages.LoginPageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility_files.DriverUtil;

public class LoginPageFactoryTests {
    WebDriver driver;
    HomePageFactory homePageFactory;
    LoginPageFactory loginPageFactory;

    @Test
    public void loginPageFactoryTestsMethod()
    {
        //Test Cases
        homePageFactory.signin_click();
        loginPageFactory.enter_un();
        loginPageFactory.enter_pwd();
        loginPageFactory.click_ok();

    }
    @BeforeClass
    public void beforeClass()
    {
        driver = DriverUtil.getBrowserInstance("safari");
        driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");

        homePageFactory=PageFactory.initElements(driver, HomePageFactory.class);
        loginPageFactory=PageFactory.initElements(driver, LoginPageFactory.class);
    }
    @AfterClass
    public void afterClass()
    {
        driver.close();

    }
}
