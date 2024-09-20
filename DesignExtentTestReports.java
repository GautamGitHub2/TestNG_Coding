package demo_accenture;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DesignExtentTestReports {
    ExtentSparkReporter sparkReporter;
    ExtentReports reports;
    ExtentTest testLog;

    @BeforeTest
    public void beforeTest()
    {
        String filepath=System.getProperty("user.dir")+"/src/test/resources/extent-reports/myreport.html";
        sparkReporter=new ExtentSparkReporter(filepath);

        reports=new ExtentReports();
        reports.attachReporter(sparkReporter);
    }
    @Test
    public void test1()
    {
        testLog= reports.createTest("test1");
        //testLog.log(Status.PASS,"This is in test1");
        Assert.assertTrue(true);
    }

    @Test
    public void test2()
    {
        testLog= reports.createTest("test2");
        //testLog.log(Status.WARNING,"This is in test2");
        Assert.assertTrue(true);
    }

    @Test
    public void test3()
    {
        testLog= reports.createTest("test3");
        //testLog.log(Status.INFO,"This is in test3");
        Assert.assertTrue(true);
    }

    @Test
    public void test4()
    {
        testLog= reports.createTest("test4");
        Assert.assertTrue(false);
        //testLog.log(Status.FAIL,"This is in test4");
    }

    @Test
    public void test5()
    {
        testLog= reports.createTest("test5");
        //testLog.log(Status.PASS,"This is in test5");
        Assert.assertTrue(true);
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
        }
    }
    @AfterTest
    public void afterTest()
    {
        reports.flush();
    }
}
