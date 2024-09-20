package demo_accenture;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

    @BeforeTest
    public void beforeTest()
    {
        System.out.println("In Before Test");
    }
     @AfterTest
    public void afterTest()
    {
        System.out.println("In After Test");
    }

    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("In Before Suite");
    }

    @AfterSuite
    public void afterSuite()
    {
        System.out.println("In After Suite");
    }
}
