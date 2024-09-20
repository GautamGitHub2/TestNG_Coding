package POM_com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageFactory {

    WebDriver driver;

    //constructor
    public HomePageFactory(WebDriver driver)
    {
        this.driver=driver;
    }
    //Locate web elements using @FindBy annotation
    @FindBy(partialLinkText = "SignIn") WebElement signin;
    @FindBy(partialLinkText = "SignUp") WebElement signup;

    //Test Methods
    public void signin_click()
    {
        signin.click();
    }
    public void signup_click()
    {
        signup.click();
    }
}
