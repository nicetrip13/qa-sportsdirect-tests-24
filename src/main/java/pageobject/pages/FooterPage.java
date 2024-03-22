package pageobject.pages;

import org.openqa.selenium.By;
import pageobject.BaseFunc;

public class FooterPage {
    private final By KIDS_MENU = By.xpath(".//a[@href = '/kids']");
    private final By SALE_BTN = By.xpath(".//a[@data-id = '3956267'");
    private final By SPORTS_BTN = By.id("lnkTopLevelMenu_4091197");
    private BaseFunc baseFunc;

    public FooterPage(BaseFunc baseFunc) {this.baseFunc = baseFunc;}

    public void sportsPageOpen() {baseFunc.click(SPORTS_BTN);}
}
