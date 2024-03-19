package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import pageobject.BaseFunc;

import java.math.BigDecimal;
import java.sql.Driver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class SportsDirectCom {


    private final By ACCEPT_COOKIES_BTN = By.id("onetrust-accept-btn-handler");
    private final By KIDS_MENU = By.xpath(".//a[@href = '/kids']");
    private final By HOODIES_BTN = By.xpath(".//a[@href = '/kids/clothing/hoodies']");
    private final By MIN_PRICE_INPUT_FIELD = By.id("PriceFilterTextEntryMin");
    private final By MAX_PRICE_INPUT_FIELD = By.id("PriceFilterTextEntryMax");
    private final By EMAIL_INPUT_FIELD = By.xpath(".//input[@type = 'email']");
    private final By EMAIL_SUBMIT_BTN = By.xpath(".//button[@type = 'submit']");
    private final By PRICE_CHECK_BTN = By.id("PriceFilterTextEntryApply");
    private final By ADD_TO_BAG_BTN = By.id("ProductStandardAddToBag");
    private final By CART_ICON = By.id("bagQuantityContainer");
    private final By CART_SUBMENU_VIEWBAG_BTN = By.id("aViewBag");
    private final By MENS_MENU = By.id("lnkTopLevelMenu_3956400");
    private final By UNDERWEAR_BTN = By.xpath(".//a[contains(@href, '/mens/clothing/underwear')]");
    private final By CALVIN_KLEIN_CHECKBOX = By.xpath(".//a[@href = '/mens/clothing/underwear/calvin-klein']");
    private final By TWO_PACK_TRUNKS_ITEM = By.xpath(".//a[@href = '/calvin-klein-2-pack-trunks-422065#colcode=42206540']");
    private final By BLK_BLU_COLOR_ITEM = By.xpath(".//img[@alt = 'Blk/Blu 6ZR']");
    private final By L_SIZE_BTN = By.xpath(".//li[@data-text = 'Large']");
    private final By CHECKOUT_BTN = By.id("aCheckout"); //not works
    private final By TEEN_HOODIE = By.xpath(".//a[@href = '/adidas-fi-aop-hd-537394#colcode=53739403']");
    private final By MIN_AGE_SIZE_BTN = By.id("liItem");
    private final By PAY_BTN_IN_CART = By.id("divContinueSecurely");
    private final By PRICES_FILTERED_LIST = By.id("navlist");
    private final By TOP_MENU_LIST = By.id("ulTopLevelMenu");
    private final String KIDS_MENU_ELEMENT = "kids";

    @Test
    public void shoppingCartHappyPathAutomatedTest() {
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://sportsdirect.com");
        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(ACCEPT_COOKIES_BTN));
        WebElement acceptBtn = browser.findElement(ACCEPT_COOKIES_BTN);
        acceptBtn.click();
        WebElement menuBlock = browser.findElement(TOP_MENU_LIST);
        List<WebElement> items = menuBlock.findElements(TOP_MENU_LIST);
        boolean isSectionFound = false;
        for (WebElement we : items) {
            if (we.getText().equals(KIDS_MENU_ELEMENT)) {
                isSectionFound = true;
                we.click();
                break;
            }
        }
        WebElement kidsMenu = browser.findElement(KIDS_MENU);
        kidsMenu.click();
        WebElement hoodiesBtn = browser.findElement(HOODIES_BTN);
        hoodiesBtn.click();
        WebElement minPriceField = browser.findElement(MIN_PRICE_INPUT_FIELD);
        minPriceField.sendKeys("25");
        WebElement maxPriceField = browser.findElement(MAX_PRICE_INPUT_FIELD);
        maxPriceField.sendKeys("35");
        wait.until(ExpectedConditions.presenceOfElementLocated(PRICE_CHECK_BTN));
        WebElement goBtn = browser.findElement(PRICE_CHECK_BTN);
        goBtn.click();
        //check that filter works - how? boolean?
        WebElement teenHoodie = browser.findElement(TEEN_HOODIE);
        teenHoodie.click();
        WebElement minAgeSizeBtn = browser.findElement(MIN_AGE_SIZE_BTN);
        minAgeSizeBtn.click();
        WebElement addToBagBtn = browser.findElement(ADD_TO_BAG_BTN);
        addToBagBtn.click();
        WebElement mensMenu = browser.findElement(MENS_MENU);
        mensMenu.click();
        WebElement underwearBtn = browser.findElement(UNDERWEAR_BTN);
        underwearBtn.click();
        WebElement cKCheckbox = browser.findElement(CALVIN_KLEIN_CHECKBOX);
        cKCheckbox.click();
        WebElement trunksItem = browser.findElement(TWO_PACK_TRUNKS_ITEM);
        trunksItem.click();
        WebElement blkBluColorSelectImg = browser.findElement(BLK_BLU_COLOR_ITEM);
        blkBluColorSelectImg.click();
        WebElement sizeBtnL = browser.findElement(L_SIZE_BTN);
        sizeBtnL.click();
        addToBagBtn = browser.findElement(ADD_TO_BAG_BTN);
        addToBagBtn.click();
        WebElement cartIcon = browser.findElement(CART_ICON);
        cartIcon.click();
        WebElement payBtn = browser.findElement(PAY_BTN_IN_CART);
        payBtn.click();

        //WebElement emailSubmitBtn = browser.findElement(EMAIL_SUBMIT_BTN);
        //emailSubmitBtn.click();
        //    WebElement checkoutBtn = browser.findElement(CHECKOUT_BTN);
        //    checkoutBtn.click();

        //check item in cart,check price - how?

    }

    @Test
    public void priceValuesCheck() {
        List<BigDecimal> prices = new ArrayList<>();


    }


}
