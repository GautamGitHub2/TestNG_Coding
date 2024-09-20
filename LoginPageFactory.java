package POM_com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageFactory {
    WebDriver driver;

    //constructor
    public void LoginPageFactory(WebDriver driver)
    {
        this.driver=driver;
    }

    //locate UI element of login page - TestMe App
    @FindBy(name = "userName") WebElement un1;
    @FindBy(name = "password") WebElement pwd1;
    @FindBy(name = "Login") WebElement login1;

    //Test Methods
    public void enter_un()
    {
        un1.sendKeys("smith@gmail.com");
    }
    public void enter_pwd()
    {
        pwd1.sendKeys("password123");
    }
    public void click_ok()
    {
        login1.click();
    }
}
