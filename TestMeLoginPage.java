package POM_com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestMeLoginPage {

    WebDriver driver;

    public TestMeLoginPage(WebDriver driver)
    {
        this.driver=driver;
    }
    //locator for login page

    By un= By.name("userName");
    By pwd= By.name("password");
    By loginbutton=By.name("Login");

    //login functionality
    public void login()
    {
        driver.findElement(un).sendKeys("testuser01");
        driver.findElement(pwd).sendKeys("pass123");
        driver.findElement(loginbutton).click();
    }

    /* Below approach is also correct for enter un and pwd*/
    /*
    public void enter_un()
    {
        driver.findElement(un).sendKeys("testuser01");
    } */


}
