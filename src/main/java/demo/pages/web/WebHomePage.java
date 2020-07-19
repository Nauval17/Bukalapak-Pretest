package demo.pages.web;

import demo.driver.WebDriverInstance;
import demo.locator.web.WebHomePageLocator;
import pageobjects.WebPageObject;

public class WebHomePage implements WebHomePageLocator {
    WebPageObject pageObject = new WebPageObject();

    public void openPage(){
        WebDriverInstance.webDriver.get("https://www.bukalapak.com");
    }

    public boolean isOnPage(){
        return pageObject.waitUntilDisplayed(BUKALAPAK_LOGO);
    }

    public void chooseLogin(){
       pageObject.clickOn(LOGIN_BUTTON);
    }

    public boolean profileAvailable(){
       return pageObject.checkElement(PROFILE_BUTTON);
    }

    public void clickProfile(){
        pageObject.clickOn(PROFILE_BUTTON);
    }

    public void logOut(){
        pageObject.clickOn(LOGOUT_BUTTON);
    }
}
