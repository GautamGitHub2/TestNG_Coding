package practice_automation_testing.homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utility_files.DriverUtil;

import java.util.concurrent.TimeUnit;

public class HomePageImagesShouldNavigateToBasket {

    /*
    1) Open the browser
    2) Enter the URL “http://practice.automationtesting.in/”
    3) Click on Shop Menu
    4) Now click on Home menu button
    5) Test whether the Home page has Three Arrivals only
    6) The Home page must contains only three Arrivals
    7) Now click the image in the Arrivals
    8) Test whether it is navigating to next page where the user can add that book into his basket.
    9) Image should be clickable and shoul navigate to next page where user can add that book to his basket
    */

    WebDriver driver;

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
    public void homePageImagesShouldNavigateToBasketMethod()throws InterruptedException {
        driver.findElement(By.xpath("//nav[@id='main-nav-wrap']/ul/li/a[text()='Shop']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@id='content']//a[text()='Home']")).click();

        Thread.sleep(5000);
        String seleniumRuby = driver.findElement(By.partialLinkText("Ruby")).getText();
        Assert.assertTrue(seleniumRuby.contains("Selenium Ruby"));
        System.out.println("The 1st Arrival has been captured...!!");

        Thread.sleep(5000);
        String thinkinginHTML = driver.findElement(By.partialLinkText("HTML")).getText();
        Assert.assertTrue(thinkinginHTML.contains("Thinking in HTML"));
        System.out.println("The 2nd Arrival has been captured...!!");

        Thread.sleep(5000);
        String masteringJavaScript = driver.findElement(By.partialLinkText("JavaScript")).getText();
        Assert.assertTrue(masteringJavaScript.contains("Mastering JavaScript"));
        System.out.println("The 3rd Arrival has been captured...!!");

        System.out.println("This Test of Three Arrivals has been verified...");

        Thread.sleep(5000);
        WebElement thinkingInHTMLImg=driver.findElement(By.xpath("//a/img[@alt='Thinking in HTML']"));
        thinkingInHTMLImg.click();
        System.out.println("The IMG of Thinking in HTML has been clicked...");

        Thread.sleep(5000);
        WebElement thinkingInHTMLButton= driver.findElement(By.xpath("//div//button[@type='submit']"));
        thinkingInHTMLButton.click();
        System.out.println("Thinking in HTML Button 'Add To Basket' has been clicked...");

        Thread.sleep(5000);
        WebElement viewBasket= driver.findElement(By.xpath("//div[@class='woocommerce-message']/a"));
        System.out.println("Thinking in HTML has been added to the basket and View Basket Button is enabled: "+viewBasket.getText());

    }
}