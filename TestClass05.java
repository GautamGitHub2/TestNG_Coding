package demo_accenture;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass05 {

    @Test
    public void method01()
    {
        System.out.println("Start of method 01");
        Assert.assertTrue(20<10);
        System.out.println("End of method 01");
    }

    @Test
    public void methodA()
    {
        System.out.println("Start of method A");
        Assert.assertTrue(20<1);
        System.out.println("End of method A");
    }

    @Test
    public void method02()
    {
        System.out.println("Start of method 02");
        Assert.assertEquals("Gautam","Gautam","Message Mismatch");
        System.out.println("End of method 02");
    }

    @Test
    public void method03()
    {
        System.out.println("Start of method 03");
        Assert.assertEquals("testNG","TestNG","Not Matching");
        System.out.println("End of method 03");

    }
}
