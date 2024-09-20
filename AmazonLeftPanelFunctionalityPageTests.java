package POM_amazon_com.tests;

import POM_amazon_com.pages.AmazonLeftPanelFunctionalityPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility_files.DriverUtil;

import static java.util.concurrent.TimeUnit.SECONDS;

public class AmazonLeftPanelFunctionalityPageTests {
    WebDriver driver;
    AmazonLeftPanelFunctionalityPage amazonLeftPanelFunctionalityPage;

   /*
    @Test(priority = 1)
    public void amazonLeftPanelFunctionalityPageTestsMethod() throws InterruptedException {
        amazonLeftPanelFunctionalityPage=new AmazonLeftPanelFunctionalityPage(driver);
        try {
            amazonLeftPanelFunctionalityPage.amazonLeftPanelFunctionalityPageMethod();
        }catch (ElementNotInteractableException e)
        {
            System.out.println("Element Not Interactable Exception "+e.getMessage());
        }
    }*/

    @Test
    public void amazonLeftPanelFunctionalityPageTestsByDynamicXPath() throws InterruptedException {
        amazonLeftPanelFunctionalityPage=new AmazonLeftPanelFunctionalityPage(driver);
        amazonLeftPanelFunctionalityPage.amazonLeftPanelFunctionalityPageByDynamicXPathMethod();
    }

    @BeforeClass
    public void beforeClass()
    {
        driver= DriverUtil.getBrowserInstance("safari");
        driver.get("https://www.amazon.in/ref=nav_logo");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(180, SECONDS);
    }

    @AfterClass
    public void afterClass()
    {
        driver.close();
    }
}
