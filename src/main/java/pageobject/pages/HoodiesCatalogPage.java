package pageobject.pages;

import org.openqa.selenium.By;
import pageobject.BaseFunc;

public class HoodiesCatalogPage {
    private BaseFunc baseFunc;
    public HoodiesCatalogPage(BaseFunc baseFunc) {this.baseFunc = baseFunc;}

    private final By PRICE_FROM = By.id("PriceFilterTextEntryMin");
    private final By PRICE_TO = By.id("PriceFilterTextEntryMax");

    public void setPriceFilter(double priceFrom,double priceTo) {
        baseFunc.typeText(PRICE_FROM, String.valueOf(priceFrom));
        baseFunc.pressEnter(PRICE_FROM);
        baseFunc.typeText(PRICE_TO, String.valueOf(priceTo));
        baseFunc.pressEnter(PRICE_TO);
    }

}
