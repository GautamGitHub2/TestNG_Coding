package practice_automation_testing.homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utility_files.DriverUtil;

import java.util.concurrent.TimeUnit;

public class HomePageWithThreeSlidersOnly {
    WebDriver driver;

    /*
    1) Open the browser
    2) Enter the URL “http://practice.automationtesting.in/”
    3) Click on Shop Menu
    4) Now click on Home menu button
    5) Test whether the Home page has Three Sliders only
    6) The Home page must contains only three sliders
    */

    @BeforeTest
    public void beforeTest()
    {
        driver= DriverUtil.getBrowserInstance("safari");
        driver.get("https://practice.automationtesting.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    }

    @AfterTest
    public void afterTest()
    {
        driver.close();
    }

    @Test
    public void homePageWithThreeSlidersOnlyMethod() throws InterruptedException {
        driver.findElement(By.xpath("//nav[@id='main-nav-wrap']/ul/li/a[text()='Shop']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@id='content']//a[text()='Home']")).click();

        Thread.sleep(5000);
        //WebElement seleniumRuby= driver.findElement(By.xpath("//div[@id='text-22-sub_row_1-0-2-0-0']/div/ul/li/a[1]h3"));
        String seleniumRuby= driver.findElement(By.partialLinkText("Ruby")).getText();
        Assert.assertTrue(seleniumRuby.contains("Selenium Ruby"));
        System.out.println("The 1st Slider has been captured...!!");

        Thread.sleep(5000);
        String thinkinginHTML= driver.findElement(By.partialLinkText("HTML")).getText();
        Assert.assertTrue(thinkinginHTML.contains("Thinking in HTML"));
        System.out.println("The 2nd Slider has been captured...!!");

        Thread.sleep(5000);
        String masteringJavaScript= driver.findElement(By.partialLinkText("JavaScript")).getText();
        Assert.assertTrue(masteringJavaScript.contains("Mastering JavaScript"));
        System.out.println("The 3rd Slider has been captured...!!");

    }
}

