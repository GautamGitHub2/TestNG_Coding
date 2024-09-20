package POM_amazon_com.tests;

import POM_amazon_com.pages.AmazonAllLinksLeftPanelPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility_files.DriverUtil;

import java.util.concurrent.TimeUnit;

public class AmazonAllLinksLeftPanelPageTests {
    WebDriver driver;
    AmazonAllLinksLeftPanelPage amazonAllLinksLeftPanelPage;

    @Test
    public void AmazonAllLinksLeftPanelPageTestsMethod()
    {
        amazonAllLinksLeftPanelPage=new AmazonAllLinksLeftPanelPage(driver);
        amazonAllLinksLeftPanelPage.amazonAllLinksLeftPanelPageMethod();

        System.out.println("This Test has been successfully passed...");
    }
    /*
    **** This Test Case is not working properly...***
    @Test(priority = 2)
    public void AmazonAllItemsNamesLeftPanelPageTestMethod() throws InterruptedException {
        Thread.sleep(3000);
        int allItemsLeftPanel=driver.findElements(By.xpath("//div[@id='hmenu-content']/ul[@class='hmenu hmenu-translateX hmenu-visible']/li[1]")).size();
        System.out.println("Number of all Items in Left Panel:"+allItemsLeftPanel);

        for (int i=2;i<=allItemsLeftPanel;i++)
        {
            String selectedItemLeftPanel=driver.findElement(By.xpath("//div[@id='hmenu-content']/ul[@class='hmenu hmenu-translateX hmenu-visible']/li["+i+"]")).getText();
            System.out.println("Left Panel Item Name"+i+" "+selectedItemLeftPanel);

            if(i==32)
            {
                System.out.println("Stop Searching...");
                break;
            }
        }

    }*/

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
