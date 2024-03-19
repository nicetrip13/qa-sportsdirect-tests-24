package pageobject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pageobject.pages.HomePage;
import pageobject.pages.HoodiesCatalogPage;
import pageobject.pages.KidsPage;

public class InternetShopPagesTest {
    @Test
    public void testOnPages() {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openURL("sportsdirect.com");
        HomePage homePage = new HomePage(baseFunc);
        homePage.acceptCookies();
        homePage.kidsPageOpen();

        KidsPage kidsPage = new KidsPage(baseFunc);
        kidsPage.hoodiesCatalogOpen();

        HoodiesCatalogPage hoodiesCatalogPage = new HoodiesCatalogPage(baseFunc);
        hoodiesCatalogPage.setPriceFilter(25,35);
    }
}
