package POM_amazon_com.tests;

import POM_amazon_com.pages.AmazonYourAccountDetailedPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility_files.DriverUtil;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AmazonYourAccountDetailedPageTests {

    WebDriver driver;
    AmazonYourAccountDetailedPage amazonYourAccountDetailedPage;

    @Test(priority = 1)
    public void amazonYourAccountDetailedPageTestsMethod()
    {
        amazonYourAccountDetailedPage=new AmazonYourAccountDetailedPage(driver);
        amazonYourAccountDetailedPage.amazonYourAccountDetailedPageMethod();
    }

    @Test(priority = 2)
    public void amazonYourAccountDetailedAllHyperlinksTestsMethod()
    {
        List<WebElement> allHyperlinks=driver.findElements(By.tagName("a"));
        int countOfAllHyperlinks=allHyperlinks.size();
        System.out.println("There are:" +countOfAllHyperlinks+ "Number Of Links");

        for (int i=0;i<countOfAllHyperlinks;i++)
        {
            String textValue=allHyperlinks.get(i).getText();
            String hrefValue=allHyperlinks.get(i).getAttribute("href");
            System.out.println(textValue+":"+hrefValue);
        }

    }

    @BeforeClass
    public void beforeClass()
    {
        driver= DriverUtil.getBrowserInstance("safari");
        driver.get("https://www.amazon.in/gp/css/homepage.html?ref_=nav_AccountFlyout_ya");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    }
    @AfterClass
    public void afterClass()
    {
        driver.close();
    }
}
