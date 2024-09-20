package demo_accenture;

import org.testng.annotations.*;

public class TestClass01 {

    @BeforeClass
    public void beforeC()
    {
        System.out.println("In before class");
    }

    @AfterClass
    public void afterC()
    {
        System.out.println("In after class");
    }

    @BeforeMethod
    public void beforeM()
    {
        System.out.println("In before method");
    }

    @AfterMethod
    public void afterM()
    {
        System.out.println("In after method");
    }

    @Test
    public void method01()
    {
        System.out.println("In test method 01");
    }

    @Test
    public void method02()
    {
        System.out.println("In test method 02");
    }

    @Test
    public void method03()
    {
        System.out.println("In test method 03");
    }

}
