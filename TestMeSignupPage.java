package POM_com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestMeSignupPage {
    WebDriver driver;

    //constructor
    public  TestMeSignupPage(WebDriver driver)
    {
        this.driver=driver;
    }

    By un1= By.id("userName");
    By fn=By.id("firstName");
    By ln=By.id("lastName");
    By pwd2=By.id("password");
    By cnfpwd2=By.id("pass_confirmation");
    By gender=By.id("gender"); //Checkbox
    By gender_male=By.xpath("//input[@id='gender'][@value='Male']");
    By gender_female=By.xpath("//input[@id='gender'][@value='Female']");
    By email=By.id("emailAddress");
    By mobilenumber=By.id("mobileNumber");
    By dateofbirth=By.name("dob");
    By add=By.id("address");
    By securityquestion=By.id("securityQuestion");//drop-down
    By ans=By.id("answer");
    By sbmt=By.name("Submit");
    By cncl=By.name("Cancel");

    public void signup()
    {
        driver.findElement(un1).sendKeys("gautam1102");
        driver.findElement(fn).sendKeys("Gautam");
        driver.findElement(ln).sendKeys("Kumar");
        driver.findElement(pwd2).sendKeys("pwd@123");
        driver.findElement(cnfpwd2).sendKeys("pwd@123");
        driver.findElement(gender_male).click();
        driver.findElement(email).sendKeys("kumar123@gmail.com");
        driver.findElement(mobilenumber).sendKeys("23232323");
        driver.findElement(dateofbirth).sendKeys("03/23/1997");
        driver.findElement(add).sendKeys("Hariharganj");
        Select s1=new Select((WebElement) securityquestion);
        s1.selectByIndex(3);
        driver.findElement(ans).sendKeys("testing");
        driver.findElement(sbmt).click();

    }

}
