package demo.locator.web;

import org.openqa.selenium.By;

public interface WebFacebookPageLocator {
    By LOGIN_LABEL = By.xpath("//div[contains(text(),'Facebook')]");
    By INPUT_EMAIL = By.id ("email");
    By INPUT_PASS = By.id("pass");
    By LOGIN_BUTTON = By.id("loginbutton");
    By CONFIRM_BUTTON = By.id("__CONFIRM__");
}
