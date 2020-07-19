package demo.locator.web;

import org.openqa.selenium.By;

public interface WebGooglePageLocator {
    By CHOOSE_ACCOUNT = By.xpath("//div[@class='pQ0lne']//li");
    By LOGIN_LABEL = By.xpath("//span[contains(text(),'Login')]");
    By INPUT_EMAIL = By.id("identifierId");
    By NEXT_TO_PASS = By.xpath("//div[@id='identifierNext']//div[2]");
    By INPUT_PASS = By.xpath("//input[@name='password']");
    By NEXT_BUTTON = By.xpath("//div[@id='passwordNext']//div[2]");
}
