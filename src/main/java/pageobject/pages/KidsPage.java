package pageobject.pages;

import org.openqa.selenium.By;
import pageobject.BaseFunc;

public class KidsPage {
    private final By HOODIES_BTN = By.xpath(".//a[@href = '/kids/clothing/hoodies']");

    private BaseFunc baseFunc;
    public KidsPage(BaseFunc baseFunc) {this.baseFunc = baseFunc; }

    public void hoodiesCatalogOpen() {baseFunc.click(HOODIES_BTN);}
}
