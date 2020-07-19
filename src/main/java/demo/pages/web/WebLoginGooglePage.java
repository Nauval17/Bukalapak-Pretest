package demo.pages.web;

import demo.locator.web.WebGooglePageLocator;
import pageobjects.WebPageObject;

public class WebLoginGooglePage implements WebGooglePageLocator {
    WebPageObject pageObject = new WebPageObject();

    public boolean isOnPage(){
        return pageObject.waitUntilDisplayed(LOGIN_LABEL);
    }

    public void chooseAccount(String account){
        pageObject.multipleID(account,CHOOSE_ACCOUNT);
    }

    public void inputEmail(String email){
        pageObject.typeON(INPUT_EMAIL, email);
    }

    public void inputPassword(String password){
        pageObject.typeON(INPUT_PASS, password);
    }

    public void goToPass(){
        pageObject.clickOn(NEXT_TO_PASS);
    }

    public void confirm(){
        pageObject.clickOn(NEXT_BUTTON);
    }
}
