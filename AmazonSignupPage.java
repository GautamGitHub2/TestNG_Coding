package POM_amazon_com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonSignupPage {

    WebDriver driver;

    //Create Constructor
    public AmazonSignupPage(WebDriver driver)
    {
        this.driver=driver;
    }

    By AccountListHomepage=By.xpath("//a[@id='nav-link-accountList']");
    By createAmazonAccount=By.xpath("//a[@id='createAccountSubmit']");
    By yourName_First_And_Last_Name=By.xpath("//input[@id='ap_customer_name']");
    By mobileNumber=By.xpath("//input[@id='ap_phone_number']");
    By password=By.xpath("//input[@id='ap_password']");
    By verifyMobileNumber_continue_button=By.xpath("//input[@id='continue']");

    public void AmazonSignupPage_Method()
    {
        driver.findElement(AccountListHomepage).click();
        driver.findElement(createAmazonAccount).click();
        driver.findElement(yourName_First_And_Last_Name).sendKeys("Gautam Kumar");
        driver.findElement(mobileNumber).sendKeys("776757788");
        driver.findElement(password).sendKeys("Test@321#$*");
        driver.findElement(verifyMobileNumber_continue_button).click();
    }

}
