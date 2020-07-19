package demo.pages.web;

import demo.locator.web.WebLoginPageLocator;
import pageobjects.WebPageObject;

public class WebLoginPage implements WebLoginPageLocator {
    WebPageObject pageObject = new WebPageObject();

    public boolean isOnPage(){
        return pageObject.waitUntilDisplayed(LOGIN_TEXT);
    }

    public void inputUser(String username){
       pageObject.typeON(INPUT_USERNAME,username);
    }

    public void inputPass(String pass){
        pageObject.typeON(INPUT_PASSWORD,pass);
    }

    public void clickLogin(){
       pageObject.clickOn(LOGIN_BUTTON);
    }

    public void viaFacebook(){
        pageObject.clickOn(LOGIN_VIA_FACEBOOK);
    }

    public void viaGoogle(){
        pageObject.clickOn(LOGIN_VIA_GOOGLE);
    }
}
