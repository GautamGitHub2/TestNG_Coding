package demo_accenture;

import org.testng.annotations.*;

public class TestClass08 extends BaseClass{

    @BeforeMethod
    public void beforeM()
    {
        System.out.println("TestClass08: In before method");
    }

    @AfterMethod
    public void afterM()
    {
        System.out.println("TestClass08: In after method");
    }

    @BeforeClass
    public void beforeC()
    {
        System.out.println("TestClass08: In before class");
    }

    @AfterClass
    public void afterC()
    {
        System.out.println("TestClass08: In after class");
    }

    @Test
    public void method01()
    {
        System.out.println("TestClass08: In test method 01");
    }

    @Test
    public void method02()
    {
        System.out.println("TestClass08: In test method 02");
    }

    @Test
    public void method03()
    {
        System.out.println("TestClass08: In test method 03");
    }
}
