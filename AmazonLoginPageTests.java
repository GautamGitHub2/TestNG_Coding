package POM_amazon_com.tests;

import POM_amazon_com.pages.AmazonHomePage;
import POM_amazon_com.pages.AmazonLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility_files.DriverUtil;

import java.util.concurrent.TimeUnit;

public class AmazonLoginPageTests {

    WebDriver driver;

    AmazonHomePage amazonHomePage;
    AmazonLoginPage amazonLoginPage;

    @Test(priority = 0)
    public void AmazonLoginPageTestsMethod()
    {
        //Test Cases
        amazonHomePage=new AmazonHomePage(driver);
        amazonLoginPage=new AmazonLoginPage(driver);

        amazonHomePage.click_signin_homepage();
        amazonLoginPage.clickOnContinue_And_Submit_To_login();
    }
    @Test(priority = 1)
    public void InvalidLoginTest()
    {
        WebElement invalidLoginErrorMessage1= driver.findElement(By.xpath("//div[@class='a-box-inner a-alert-container']/h4[text()='There was a problem']"));
        Assert.assertEquals(invalidLoginErrorMessage1.getText(),"There was a problem");

        //WebElement invalidLoginErrorMessage2= driver.findElement(By.xpath("//li/span[@class='a-list-item']"));
        //Assert.assertEquals(invalidLoginErrorMessage2.getText(), "Your password is incorrect");

        System.out.println("This Test has been passed...");
    }

    @BeforeClass
    public void beforeClass()
    {
        driver= DriverUtil.getBrowserInstance("safari");
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    }
    @AfterClass
    public void afterClass()
    {
        driver.close();
    }
}
