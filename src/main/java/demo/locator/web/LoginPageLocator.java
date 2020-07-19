package demo.locator.web;

import org.openqa.selenium.By;

public interface LoginPageLocator {
    By LOGIN_TEXT = By.xpath("//div[contains(text(),'masuk')]");
    By INPUT_USERNAME = By.id("user_session_username");
    By INPUT_PASSWORD = By.id("user_session_password");
    By LOGIN_BUTTON =By.xpath("//i[contains(@class,'c-btn--spinner__icon')]");
    By LOGIN_VIA_FACEBOOK = By.xpath("//a[contains(text(), 'Facebook')]");
    By LOGIN_VIA_GOOGLE = By.xpath("//body//a[2]");
    By WARNING_MESSAGE = By.xpath("//span[contains(text(),'salah')]");
}
