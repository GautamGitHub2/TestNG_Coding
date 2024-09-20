package demo_accenture;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utility_files.DriverUtil;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DesignExtentTestReportsSelenium {
    WebDriver driver;

    ExtentSparkReporter sparkReporter;
    ExtentReports reports;
    ExtentTest testLog;

    @BeforeTest
    public void beforeTest()
    {
        driver= (WebDriver) DriverUtil.getBrowserInstance("safari");

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss-ms");

        String filepath=System.getProperty("user.dir")+"/src/test/resources/extent-reports/"+simpleDateFormat.format(new Date())+".html";
        sparkReporter=new ExtentSparkReporter(filepath);

        reports=new ExtentReports();
        reports.attachReporter(sparkReporter);

        reports.setSystemInfo("user","Gautam Kumar");
        reports.setSystemInfo("environment","test env");
        reports.setSystemInfo("location","Kolkata");

        sparkReporter.config().setDocumentTitle("QE Team");
        sparkReporter.config().setTheme(Theme.DARK);
    }
    @Test(priority = 1)
    public void testMeApp()
    {
        testLog=reports.createTest("testMeApp");
        driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
        driver.manage().window().maximize();
        Assert.assertEquals(driver.getTitle(),"Home");
    }
    @Test(priority = 2)
    public void testGoogleHomePage()
    {
        testLog=reports.createTest("google");
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        Assert.assertEquals(driver.getTitle(),"Google Test");

    }
    @Test(priority = 3)
    public void testYahooHomePage()
    {
        testLog=reports.createTest("yahoo");
        driver.get("https://in.search.yahoo.com/");
        driver.manage().window().maximize();
        throw new SkipException("This function is skipped...");
    }
    @Test(priority = 4)
    public void testFacebookHomePage()
    {
        testLog=reports.createTest("facebook");
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Assert.assertEquals(driver.getTitle(),"Facebook - लॉग इन या साइन अप करें");
    }
    @AfterMethod
    public void afterMethod(ITestResult result)
    {
        if (result.getStatus()==ITestResult.SUCCESS)
        {
            testLog.log(Status.PASS,"This is in "+result.getMethod().getMethodName());
        } else if (result.getStatus()==ITestResult.FAILURE)
        {
            testLog.log(Status.FAIL,"This is in "+result.getMethod().getMethodName());
            TakesScreenshot screenshot=(TakesScreenshot) driver;
            File scrfile=screenshot.getScreenshotAs(OutputType.FILE);
            String destFile=System.getProperty("user.dir")+"/src/test/resources/extent-reports/capture-screenshots/"+result.getMethod().getMethodName()+".png";

            try {
                FileUtils.copyFile(scrfile,new File(destFile));
                testLog.addScreenCaptureFromPath(destFile);
                testLog.log(Status.FAIL, MarkupHelper.createLabel("This is Failed Method", ExtentColor.RED));
                testLog.log(Status.FAIL,result.getThrowable().getMessage());

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (result.getStatus()==ITestResult.SKIP)
        {
            testLog.log(Status.SKIP,"This is in "+result.getMethod().getMethodName());


        }
    }

    @AfterTest
    public void afterTest()
    {
        driver.close();
        reports.flush();
    }

// This is working 100% correct


}
