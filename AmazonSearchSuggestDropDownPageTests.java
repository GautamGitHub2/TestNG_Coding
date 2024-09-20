package POM_amazon_com.tests;

import POM_amazon_com.pages.AmazonSearchSuggestDropDownPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility_files.DriverUtil;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AmazonSearchSuggestDropDownPageTests {

    WebDriver driver;

    AmazonSearchSuggestDropDownPage amazonSearchSuggestDropDownPage;

    @Test
    public void amazonSearchSuggestDropDownPageTest() throws InterruptedException {
        amazonSearchSuggestDropDownPage=new AmazonSearchSuggestDropDownPage(driver);
        amazonSearchSuggestDropDownPage.amazonSearchSuggestDropDownPage_Method();

        List<WebElement> list=driver.findElements(By.xpath("//div[@class='left-pane-results-container']//div[1]"));
        System.out.println("Size of Auto Suggestions:" + list.size());

        /* Read all the auto suggested items
        for (WebElement amazonAutoSuggestedListItem:list)
        {
            if (amazonAutoSuggestedListItem.getText().contains("inverter 900"))
            {
                amazonAutoSuggestedListItem.click();
                System.out.println("Clicked on auto suggested item:");
                System.out.println("This Test Case is working fine...");
                break;
            }

        }*/


        int allSuggestedItems=driver.findElements(By.xpath("//div[@class='left-pane-results-container']//div[1]")).size();
        System.out.println("Number of All Suggested Items:"+allSuggestedItems);

        for (int r=0;r<=allSuggestedItems;r++)
        {
            //List<WebElement> list
            String selectedItemName= driver.findElement(By.xpath("//div[@class='left-pane-results-container']//div["+1+"+"+r+"]")).getText();
            Thread.sleep(3000);
            System.out.println("Item Name:"+r+" "+selectedItemName);

            if (r==9)
            {
                System.out.println("Stop Searching...");
                System.out.println("This Test Case (Code) is working 100% perfectly...");
                break;
            }

        }
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
