package demo.locator.web;

import org.openqa.selenium.By;

public interface HomePageLocator {
    By BUKALAPAK_LOGO = By.xpath("//img[@class='sigil-logo-full']");
    By PROFILE_BUTTON = By.className("bl-avatar sigil-avatar");
    By LOGIN_BUTTON = By.xpath("//p[contains(text(),'Login')]");
}
