package POM_amazon_com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonYourAccountDetailedPage {
    WebDriver driver;

    public AmazonYourAccountDetailedPage(WebDriver driver)
    {
        this.driver=driver;
    }

    By yourAccountHeader= By.xpath("//div[@class='a-row a-spacing-base']/h1");

    By yourOrders=By.xpath("//div[@class='ya-card-cell']//div[@data-card-identifier='YourOrders']");
    By loginAndSecurity=By.xpath("//div[@class='ya-card-cell']//div[@data-card-identifier='SignInAndSecurity']");
    By primeMemberships=By.xpath("//div[@class='ya-card-cell']//div[@data-card-identifier='Prime']");
    By yourAddresses=By.xpath("//div[@class='ya-card-cell']//div[@data-card-identifier='AddressesAnd1Click']");
    By yourBusinessAccount=By.xpath("//div[@class='ya-card-cell']//div[@data-card-identifier='AmazonBusiness']");
    By paymentOptions=By.xpath("//div[@class='ya-card-cell']//div[@data-card-identifier='PaymentOptions']");
    By amazonPayBalance=By.xpath("//div[@class='ya-card-cell']//div[@data-card-identifier='AmazonPay']");

    public void amazonYourAccountDetailedPageMethod()
    {
        System.out.println(driver.findElement(yourAccountHeader).getText());
        System.out.println(driver.findElement(yourOrders).getText());
        System.out.println(driver.findElement(loginAndSecurity).getText());
        System.out.println(driver.findElement(primeMemberships).getText());
        System.out.println(driver.findElement(yourAddresses).getText());
        System.out.println(driver.findElement(yourBusinessAccount).getText());
        System.out.println(driver.findElement(paymentOptions).getText());
        System.out.println(driver.findElement(amazonPayBalance).getText());
    }
}
