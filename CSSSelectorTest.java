package demo_accenture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utility_files.DriverUtil;

import java.util.concurrent.TimeUnit;

public class CSSSelectorTest {
    WebDriver driver;

    @BeforeTest
    public void beforeTest()
    {
        driver= DriverUtil.getBrowserInstance("safari");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    }
    @AfterTest
    public void afterTest()
    {
        driver.close();
    }
    @Test
    public void userLoginLogOutUsingCSSSelector()
    {
        driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
        driver.findElement(By.cssSelector("a[href='login.htm']")).click();
        driver.findElement(By.cssSelector("input#userName")).sendKeys("testuser01");
        driver.findElement(By.cssSelector("input#password")).sendKeys("pass123");
        driver.findElement(By.cssSelector("input[value='Login']")).click();
        driver.findElement(By.cssSelector("a[href='logout.htm']")).click();


    }
}

/*
CSS Selector with ID

-> This strategy is used to locate the element using the CSS selector type with an ID attribute

<input type="text" id="username"/>

-> Syntax to locate this element using CSS Selector with ID attribute

WebElement usernameElement = driver.findElement(By.cssSelector("input#username"));
==========================================================================================

CSS Selector with Class

-> This strategy is used to locate the element using the CSS selector type with Class attribute
-> We use this locator type when the element has only class attribute

<input type="text" class="username"/>

-> Syntax to locate this element using CSS Selector with Class attribute

WebElement usernameElement = driver.findElement(By.cssSelector("input.username"));

==========================================================================================

CSS Selector with attribute

-> This strategy is used to locate the element using the CSS selector type with any attribute
-> We use this locator type when the element have an attribute like type, value etc.

<input type="text" class="submit"/>

-> Syntax to locate this element using CSS Selector with any other attribute

WebElement submitBtn = driver.findElement(By.cssSelector("input[type='submit']"));

==========================================================================================

CSS Selector with multiple attribute

-> This strategy is used to locate when the element does not have a unique attribute
-> the single attribute is not sufficient to identify the element

<div class ="ajax_enabled" style="display.block">

-> Syntax to locate this element using CSS Selector with multiple attribute

WebElement submitBtn = driver.findElement(By.cssSelector("div[class ='ajax_enabled'][style='display:block']"));

==========================================================================================

CSS Selector with Sub-string

-> This strategy allows matching of partial string and is very useful with attributes having dynamic values
-> Supports mechanism like starts-with, ends-with and contains

* Match a prefix (starts-with)
<div id="empId_456"> --> css="div[id^='empId']"

* Match a prefix(ends-with)
<div id="123_empId"> --> css="div[id$='empId']"

* Match a sub-string (contains)
<div id="123_empId_456"> --> css="div[id*='_empId_']"
                         --> css="div:contains(_empId_)"

CSS Selector for Child Elements

* Consider a list element which has a list of child elements like below
<ul id="fruit">
    <li>Apple</li>
    <li>Orange</li>
    <li>Banana</li>
</ul>

->To locate the 1st child element: we can use first-child or first-of-type

css="ul#fruit li:first-of-type"

->To locate 2nd child element: We can use nth-child() or nth-of-type
css="ul#fruit li:nth-of-type(2)"

->To locate last child element: We can use last-child or last-of-type
css="ul#fruit li:last-child"

Q. What is XPath?
Ans. XPath is a query language for selecting nodes from an XML document. All the major browsers support XPath and HTML pages are
represented as XHTML documents in DOM

Q. What are the differences between CSS Selector and XPath?
Ans. One of the important differences between XPath and CSS Selector is: With XPath we can search elements backward or forward in the DOM hierarchy
while CSS works only in a forward direction. This means we can locate a parent element using a child element with XPath.

Q. How many types of XPath?
Ans. Two types: 1. Absolute XPath and 2. Relative XPath
1. Absolute XPath: It provides direct access and complete path of an element. Example: html/body/div[1]/div/div/div/div[1]....
2. Relative XPath: It starts from middle of DOM structure and starts with double slash (//) means anywhere in the web page. Example: //input[@name='uid']

$ Locating Web Element by XPath

* Finding elements with absolute path:
Example: /html/body/form

* Finding elements with relative path:
Example: //form

* Finding elements using index:
Example: //form/input[1]

* Finding elements using single attribute value:
Example: //input[@name='username']

* Finding elements using multiple attribute values:
Example: //input[@name='username'][@class='required']
Example: //input[@name='username' and @class='required']
Example: //input[@name='username' or @class='required']

Forward XPath: from parent to child. Example: //div[@class='col-md-12 remove-default-padding']/input
Backward XPath: from child to parent. Example: //input[@id='userName']/..




















 */
