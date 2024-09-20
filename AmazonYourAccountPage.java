package POM_amazon_com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonYourAccountPage {
    WebDriver driver;

    public AmazonYourAccountPage(WebDriver driver)
    {
        this.driver=driver;
    }

    By AccountListHomepage=By.xpath("//a[@id='nav-link-accountList']");
    By YourAccountLink=By.xpath("//div[@id='nav-al-your-account']/div");
    By YourAccountLink1=By.partialLinkText("Your Account");

    public void amazonYourAccount_Method() throws InterruptedException {

        Thread.sleep(5000);

        Actions actions=new Actions(driver);
        actions
                .moveToElement(driver.findElement(AccountListHomepage))
                .moveToElement(driver.findElement(YourAccountLink1))
                .build().perform();

        driver.findElement(YourAccountLink1).click();
    }
}
