package POM_amazon_com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonSearchSuggestDropDownPage {

    WebDriver driver;

    public AmazonSearchSuggestDropDownPage(WebDriver driver)
    {
        this.driver=driver;
    }
    By searchBox= By.id("twotabsearchtextbox");
    public void amazonSearchSuggestDropDownPage_Method() throws InterruptedException {
        driver.findElement(searchBox).sendKeys("Microtek Inverter");
        Thread.sleep(3000);
    }
}
