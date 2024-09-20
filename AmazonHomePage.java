package POM_amazon_com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonHomePage {

    WebDriver driver;

    public AmazonHomePage(WebDriver driver)
        {
            this.driver=driver;
        }

    By AccountListHomepage=By.xpath("//a[@id='nav-link-accountList']");
    By ClickOnSignInHomePage=By.xpath("//a[@class='nav-action-signin-button']");

    public void click_signin_homepage()
    {
        driver.findElement(AccountListHomepage).click();
        driver.findElement(ClickOnSignInHomePage).click();
    }

}
