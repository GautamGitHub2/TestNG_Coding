package POM_amazon_com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class AmazonSearchPage {

    WebDriver driver;

    By searchBox= By.id("twotabsearchtextbox");
    By searchSubmitButton=By.id("nav-search-submit-button");
    //By addToCart=By.id("a-autoid-1-announce");

    public AmazonSearchPage(WebDriver driver) {this.driver=driver;
    }

    public void clickOnSearchSubmitButton() {
        driver.findElement(searchBox).sendKeys("iPhone");
        driver.findElement(searchSubmitButton).click();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        //driver.findElement(addToCart).click();
    }
}
