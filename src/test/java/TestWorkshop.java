import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestWorkshop {
    WebDriver webDriver;
    WebDriverWait webDriverWait;

    @Before
    public void beforeTest(){
        // Create Chrome
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();

        webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
    }

    @After
    public void afterTest(){
        webDriver.quit();
    }


    @Test
    public void Test1() throws InterruptedException {
        // Go to Apple website
        webDriver.get("https://www.apple.com/");

        // Assign locator
        By iphoneLinkLocator = By.className("ac-gn-link-iphone");

        // Wait iphoneLink to present
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(iphoneLinkLocator));

        // Find iphoneLink
        WebElement iphoneLink = webDriver.findElement(iphoneLinkLocator);

        // Click iphoneLink
        iphoneLink.click();

        // Assign locator
        By iphone14ProLinkLocator = By.className("chapternav-item-iphone-14-pro");

        // Wait iphone14ProLink to present
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(iphone14ProLinkLocator));

        // Find iphone14ProLink
        WebElement iphone14ProLink = webDriver.findElement(iphone14ProLinkLocator);

        // Click iphone14ProLink
        iphone14ProLink.click();

        // Assign locator
        By iphone14ProOrderButtonLocator = By.className("ac-ln-action-button");

        // Wait iphone14ProLink to present
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(iphone14ProOrderButtonLocator));

        // Find iphone14ProOrderButton
        WebElement iphone14ProOrderButton = webDriver.findElement(iphone14ProOrderButtonLocator);

        // Click iphone14ProOrderButton
        iphone14ProOrderButton.click();

        // sleep 5 sec
        Thread.sleep(5000);

        // Quit Chrome
//        webDriver.quit();
    }

    @Test
    public void Test2() throws InterruptedException {
        // Go to Apple website
        webDriver.get("https://www.apple.com/");

        // Assign locator
        By searchButtonLocator = By.id("ac-gn-link-search");

        // Wait searchButton to present
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(searchButtonLocator));

        // Find searchButton
        WebElement searchButton = webDriver.findElement(searchButtonLocator);

        // Click searchButton
        searchButton.click();

        // Assign locator
        By searchInputLocator = By.id("ac-gn-searchform-input");

        // Wait searchInput to present
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(searchInputLocator));

        // Find searchInput
        WebElement searchInput = webDriver.findElement(searchInputLocator);

        // Input text
        searchInput.sendKeys("iphone 14 pro max");

        // sleep 5 sec
        Thread.sleep(5000);

        searchInput.sendKeys(Keys.ENTER);

//        // Assign locator
//        By searchSubmitButtonLocator = By.id("ac-gn-searchform-submit");
//
//        // Wait searchSubmitButton to present
//        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(searchSubmitButtonLocator));
//
//        // Find searchSubmitButton
//        WebElement searchSubmitButton = webDriver.findElement(searchSubmitButtonLocator);
//
//        // Click searchSubmitButton
//        searchSubmitButton.click();
    }
}
