package POM_com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestMeHomePage {

    //store web elements of TestMe app Home Page

    //Initialize webdriver
    WebDriver driver;

    //Constructor to call driver

    public TestMeHomePage(WebDriver driver)
    {
        this.driver=driver;
    }

    //store home page webelements using locators

    By signinlink= By.partialLinkText("SignIn");
    By signuplink=By.partialLinkText("SignUp");

    //Test Method or functionality
    public void click_signin()
    {
        driver.findElement(signinlink).click();
    }
    public void click_signup()
    {
        driver.findElement(signuplink).click();
    }
}
