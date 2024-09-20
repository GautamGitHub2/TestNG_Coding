package demo_accenture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utility_files.DriverUtil;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MultipleWindowsTest {

    WebDriver driver;

    @BeforeTest
    public void beforeTest()
    {
        driver= DriverUtil.getBrowserInstance("safari");
        driver.get("http://demo.automationtesting.in/Windows.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

    }
    @AfterTest
    public void afterTest()
    {
       // driver.close();//current window is closed
        driver.quit();//close all the windows instances in the current session
    }

    @Test
    public void multipleWindowsTestMethod()
    {
        driver.findElement(By.partialLinkText("click")).click();

        String homeWindow=driver.getWindowHandle();//return the current window reference id
        Set<String> windows= driver.getWindowHandles();//return all the windows reference ids and store in a collection

        driver.switchTo().window(windows.toArray()[1].toString());
        driver.findElement(By.linkText("Downloads")).click();
        //driver.findElement(By.xpath("//a[@class='nav-link'][span='Downloads']")).click();
        //driver.switchTo().window((windows.toArray()[0].toString()));
        //driver.switchTo().window(homeWindow);

}}
