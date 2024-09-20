package POM_com.tests;

import POM_com.pages.TestMeHomePage;
import POM_com.pages.TestMeLoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility_files.DriverUtil;

public class TestMeLoginTests {
    WebDriver driver;
    TestMeHomePage homePage;
    TestMeLoginPage loginPage;

    @Test
    public void testMeLoginTestsMethod()
    {
        //Test Case

        homePage=new TestMeHomePage(driver);
        loginPage=new TestMeLoginPage(driver);

        //call the test methods from page class to perform the operations

        //click on signin
        homePage.click_signin();
        //perform login
        loginPage.login();

    }
    @BeforeClass
    public  void beforeClass()
    {
        driver = DriverUtil.getBrowserInstance("safari");
        driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
    }

    @AfterClass
    public void afterClass()
    {
        //closing browser, applications
        driver.close();
    }

}
