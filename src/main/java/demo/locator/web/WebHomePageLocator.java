package demo.locator.web;

import org.openqa.selenium.By;

public interface WebHomePageLocator {
    By BUKALAPAK_LOGO = By.xpath("//img[@class='sigil-logo-full']");
    By PROFILE_BUTTON = By.xpath("//div[@class='bl-avatar sigil-avatar']");
    By LOGIN_BUTTON = By.xpath("//p[contains(text(),'Login')]");
    By LOGOUT_BUTTON = By.xpath("//p[contains(text(),'Logout')]");
}
