package demo_accenture;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestClass03 {
    @Test(dataProvider = "testDataGenerator")
    public void method01(Integer n, String s){
        System.out.println(n + " " + s);

    }
    @DataProvider
    public Object[][] testDataGenerator()
    {
        return new Object[][]
                {
                        new Object[]{1,"a"},
                        new Object[]{2,"b"}

                };
    }
}
