package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BaseFunc {
    private WebDriver browser;
    private WebDriverWait wait;
    public BaseFunc(){
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        wait = new WebDriverWait(browser, Duration.ofSeconds(5));
    }

    public void openURL(String url) {
       if (!url.startsWith("http://") && !url.startsWith("https://")) {
           url = "http://" + url;
       }

        browser.get(url);
    }
    public void click(By locator){wait.until(ExpectedConditions.elementToBeClickable(locator)).click();}

    public WebElement findElement(By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
    public List<WebElement> findElements(By locator) {return browser.findElements(locator);}

    public void waitForText (By locator, String text) {wait.until(ExpectedConditions.textToBe(locator, text));}

    public void typeText (By locator, String text) {
        WebElement input = findElement(locator);
        input.clear();
        input.sendKeys(text);
    }


}
