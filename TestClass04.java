package demo_accenture;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestClass04 {

    @BeforeMethod
    public void beforeM()
    {
        System.out.println("In Before Method");
    }
    @AfterMethod
    public void afterM()
    {
        System.out.println("In After Method");
    }

    @Test(dataProvider = "testData")
    public void login(String username,String password){
        System.out.println(username + " " + password);

    }
    @DataProvider
    public Object[][] testData(){

        Object[][] data={
                {"user01","pass123"},
                {"user02","pass12"},
                {"user03","pass11"},

        };
        return data;

    }
}
