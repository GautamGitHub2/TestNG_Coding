package POM_amazon_com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonAllLinksLeftPanelPage {
    WebDriver driver;

    public AmazonAllLinksLeftPanelPage(WebDriver driver)
    {
        this.driver=driver;
    }

    By leftNavigationHamburgerMenu= By.xpath("//a[@id='nav-hamburger-menu']");
   // By helloSignIn=By.xpath("//a[@id='hmenu-customer-profile-link']");
    By helloSignIn1=By.xpath("//div[@id='hmenu-canvas']//div[@id='hmenu-customer-profile']//b");
    //div[@id='hmenu-canvas']//div[@id='hmenu-customer-profile']//b
    By trending=By.xpath("//div[@id='hmenu-content']/ul/li/div[text()='Trending']");
    By digitalContentAndDevices=By.xpath("//div[@id='hmenu-content']/ul/li/div[text()='Digital Content and Devices']");
    By shopByCategory=By.xpath("//div[@id='hmenu-content']/ul/li/div[text()='Shop by Category']");
    By programsAndFeatures=By.xpath("//div[@id='hmenu-content']/ul/li/div[text()='Programs & Features']");
    By helpAndSettings=By.xpath("//div[@id='hmenu-content']/ul/li/div[text()='Help & Settings']");
    By leftNavigationPageClose=By.xpath("//div[@id='hmenu-container']//div[@class='nav-sprite hmenu-close-icon']");

    public void amazonAllLinksLeftPanelPageMethod()
    {
        driver.findElement(leftNavigationHamburgerMenu).click();
        System.out.println(driver.findElement(helloSignIn1).getText());
        System.out.println(driver.findElement(trending).getText());
        System.out.println(driver.findElement(digitalContentAndDevices).getText());
        System.out.println(driver.findElement(shopByCategory).getText());
        System.out.println(driver.findElement(programsAndFeatures).getText());
        System.out.println(driver.findElement(helpAndSettings).getText());
        driver.findElement(leftNavigationPageClose).click();
    }
}
