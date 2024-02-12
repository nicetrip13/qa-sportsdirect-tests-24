package pageobject;

import org.testng.annotations.Test;
import pageobject.pages.HomePage;

public class InternetShopPagesTest {
    @Test
    public void testOnPages() {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openURL("sportsdirect.com");
        HomePage homePage = new HomePage(baseFunc);
        homePage.acceptCookies();
        homePage.kidsMenuOpen();
    }
}
