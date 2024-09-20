package POM_amazon_com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonLeftPanelFunctionalityPage {
    WebDriver driver;

    public AmazonLeftPanelFunctionalityPage(WebDriver driver)
    {
        this.driver=driver;
    }

    //By leftNavigationHamburgerMenu=By.xpath("//a[@id='nav-hamburger-menu']");

    By amazonMiniTV=By.xpath("//div[@id='nav-xshop']/a[1]");
    By sell=By.xpath("//div[@id='nav-xshop']/a[2]");
    By bestSelleres= By.xpath("//div[@id='nav-xshop']/a[3]");
    By mobiles=By.xpath("//div[@id='nav-xshop']/a[4]");
    By todaysDeals=By.xpath("//div[@id='nav-xshop']/a[5]");
    By prime=By.xpath("//div[@id='nav-xshop']/a[6]");
    By customerService=By.xpath("//div[@id='nav-xshop']/a[7]");
    By electronics=By.xpath("//div[@id='nav-xshop']/a[8]");

    public void amazonLeftPanelFunctionalityPageMethod() throws InterruptedException {

        driver.findElement(amazonMiniTV).click();
        System.out.println("Amazon MiniTV Clicked Successfully...");
        Thread.sleep(3000);
        WebElement amazonMiniTVLogo= driver.findElement(amazonMiniTV);
        System.out.println(amazonMiniTVLogo.getText());
        Thread.sleep(3000);
        driver.navigate().back();

        driver.findElement(sell).click();
        System.out.println("Sell clicked successfully...!!");
        driver.navigate().back();

        driver.findElement(bestSelleres).click();
        System.out.println("Best Sellers Clicked Successfully...");
        driver.navigate().back();

        driver.findElement(mobiles).click();
        System.out.println("Mobiles clicked Successfully...");
        driver.navigate().back();

        driver.findElement(todaysDeals).click();
        System.out.println("Today's Deals clicked Successfully...");
        driver.navigate().back();

        driver.findElement(prime).click();
        System.out.println("Prime clicked Successfully...");
        driver.navigate().back();

        driver.findElement(customerService).click();
        System.out.println("Customer Service clicked Successfully...");
        driver.navigate().back();

        driver.findElement(electronics).click();
        System.out.println("Electronics clicked Successfully...");
        driver.navigate().back();

        System.out.println("Stop Testing...");

    }

    public void amazonLeftPanelFunctionalityPageByDynamicXPathMethod() throws InterruptedException {
        int allNavXshopItems=driver.findElements(By.xpath("//div[@id='nav-xshop']/a")).size();
        System.out.println("The Size of all Nav Xshop Items: "+allNavXshopItems);

        for(int i=1;i<=allNavXshopItems;i++)
        {
            String allNavXshopSelectedItemName=driver.findElement(By.xpath("//div[@id='nav-xshop']/a["+i+"]")).getText();
            Thread.sleep(3000);
            System.out.println("Selected NavXShop Name "+i+" : "+allNavXshopSelectedItemName);
        }
    }

}
