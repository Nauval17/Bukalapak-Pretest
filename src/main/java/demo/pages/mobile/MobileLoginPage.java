package demo.pages.mobile;

import demo.locator.mobile.MobileLoginPageLocator;
import pageobjects.MobilePageObject;

public class MobileLoginPage implements MobileLoginPageLocator {
    MobilePageObject pageObject = new MobilePageObject();

    public boolean isOnPage(){
        return pageObject.waitUntilDisplayed(APPS_LOGO);
    }

    public void inputEmail(String email){
        pageObject.typeON(INPUT_EMAIL, email);
    }

    public void inputPass(String password){
        pageObject.typeON(INPUT_PASS, password);
    }

    public void clickLogin(){
        pageObject.clickOn(LOGIN_BUTTON);
    }

    public boolean warningMessage(){
        return pageObject.checkIfDisplayed(WARNING_EMAIL);
    }

    public boolean toastMessage(){
        return pageObject.checkIfDisplayed(TOAST_MESSAGE);
    }
}
