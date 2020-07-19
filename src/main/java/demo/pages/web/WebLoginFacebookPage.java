package demo.pages.web;

import demo.locator.web.WebFacebookPageLocator;
import pageobjects.WebPageObject;

public class WebLoginFacebookPage implements WebFacebookPageLocator {
    WebPageObject pageObject = new WebPageObject();

    public boolean loginPage(){
        return pageObject.waitUntilDisplayed(LOGIN_LABEL);
    }

    public void inputEmail(String email){
        pageObject.typeON(INPUT_EMAIL, email);
    }

    public void inputPassword(String password){
        pageObject.typeON(INPUT_PASS, password);
    }

    public void loginButton(){
        pageObject.clickOn(LOGIN_BUTTON);
    }

    public void confirmAccount(){
        pageObject.waitUntilDisplayed(CONFIRM_BUTTON);
        pageObject.clickOn(CONFIRM_BUTTON);
    }
}
