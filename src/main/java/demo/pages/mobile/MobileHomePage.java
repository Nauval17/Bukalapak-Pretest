package demo.pages.mobile;

import demo.locator.mobile.MobileHomePageLocator;
import pageobjects.MobilePageObject;

public class MobileHomePage implements MobileHomePageLocator {
    MobilePageObject pageObject = new MobilePageObject();

    public boolean isOnHome(){
        return pageObject.waitUntilDisplayed(PROFILE);
    }
}
