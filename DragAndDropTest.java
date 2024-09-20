package demo_accenture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utility_files.DriverUtil;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DragAndDropTest {
    WebDriver driver;

    @BeforeTest
    public void beforeTest()
    {
        driver= DriverUtil.getBrowserInstance("safari");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

    }
    @AfterTest
    public void afterTest()
    {
        driver.quit();
    }
    @Test
    public void dragAndDropTestMethod()
    {
        driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");

        WebElement dragElement = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadTreeView1\"]/ul/li/ul/li[3]/ul/li[1]/div/div/span"));
        WebElement dropElement = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_priceChecker\"]"));

        Actions actions=new Actions(driver);
        actions.dragAndDrop(dragElement,dropElement).perform();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(180));
        wait.until(ExpectedConditions.invisibilityOfElementWithText
                (By.id("ctl00_ContentPlaceholder1_Label1"),"Drop a package here to check price"));

        String text=driver.findElement(By.id("ctl00_ContentPlaceholder1_Label1")).getText();

        Assert.assertTrue(text.contains("Weekend Package"));
        Assert.assertTrue(text.contains("$"));
}}
