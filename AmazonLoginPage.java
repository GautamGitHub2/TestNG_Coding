package POM_amazon_com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonLoginPage {

    WebDriver driver;

    public AmazonLoginPage(WebDriver driver)
    {
        this.driver=driver;
    }

    By emailMobilePhoneNumberTextBox= By.name("email");
    By continueButton=By.id("continue");
    By passwordTextBox=By.name("password");
    By signin_button=By.id("signInSubmit");

    public void clickOnContinue_And_Submit_To_login()
    {
        driver.findElement(emailMobilePhoneNumberTextBox).sendKeys("7654567989");
        driver.findElement(continueButton).click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(passwordTextBox)).sendKeys("pass@123");
        driver.findElement(signin_button).click();
    }

}
