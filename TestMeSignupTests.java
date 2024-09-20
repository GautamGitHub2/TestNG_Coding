package POM_com.tests;

import POM_com.pages.TestMeHomePage;
import POM_com.pages.TestMeSignupPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility_files.DriverUtil;

public class TestMeSignupTests {
    WebDriver driver;
    TestMeHomePage homePage;
    TestMeSignupPage signupPage;


    @Test
    public void testMeSignupTestsMethod()
    {

        homePage=new TestMeHomePage(driver);
        homePage.click_signup();

        signupPage=new TestMeSignupPage(driver);
        signupPage.signup();

    }

    @BeforeClass
    public void beforeClass()
    {
        driver= DriverUtil.getBrowserInstance("safari");
        driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
    }

    @AfterClass
    public void afterClass()
    {
        driver.close();
    }
}
