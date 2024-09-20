package POM_amazon_com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonSearchByCategoryDropDownPage {
    WebDriver driver;

    public AmazonSearchByCategoryDropDownPage(WebDriver driver)
    {
        this.driver=driver;
    }
    By searchDropDownNames= By.xpath("//div[@class='nav-search-scope nav-sprite']");

    public void amazonSearchByCategoryDropDownPageMethod() {

        driver.findElement(searchDropDownNames).click();
        int allSearchByCategory=driver.findElements(By.xpath("//select[@id='searchDropdownBox']/option")).size();
        System.out.println("Total numbers of Search By Category: "+allSearchByCategory);

        for (int i=1;i<=allSearchByCategory;i++)
        {
            String allSearchByCategoryNames=driver.findElement(By.xpath("//select[@id='searchDropdownBox']/option["+i+"]")).getText();
            System.out.println("Search By Category Name "+i+" : "+allSearchByCategoryNames);
        }

    }
    public void amazonSearchByCategoryDropDownSelectMethod()
    {
        driver.findElement(searchDropDownNames).click();

        int amazonListItem=driver.findElements(By.xpath("//select[@id='searchDropdownBox']/option")).size();
        System.out.println("The Number of all drop-down list elements are: "+amazonListItem);

        for (int i=1;i<=amazonListItem;i++)
        {
        Select selectDropDownName= new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']/option["+i+"]")));
        System.out.println("Drop Down Names are "+i+":"+selectDropDownName);

        if (i==5)
        {
            //selectDropDownName.selectByVisibleText("Amazon Pharmacy");
            selectDropDownName.selectByIndex(i);
            System.out.println("The Selected / Visible List Element has been selected...!!");
        }
        }
}
}




