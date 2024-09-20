package demo_accenture;

import org.testng.annotations.Test;

public class TestClass02 {

    @Test (priority = 0)
    public void registration(){
        System.out.println("In registration test method");
    }

    @Test (priority = 1)
    public void login(){
        System.out.println("In login test method");
    }

    @Test (priority = 2, enabled = false)
    public void logout(){
        System.out.println("In logout test method");
    }

    //Default test methods runs in alphabetical order
    //So when we have to go through the desired test methods then priority comes to the picture, by default priority value is 0

    // Enabled: By default all the methods in the TestNG are enabled, so if we use enabled =false that test method will not execute
    //
}
