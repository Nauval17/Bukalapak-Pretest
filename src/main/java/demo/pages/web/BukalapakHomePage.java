package demo.pages.web;

import demo.driver.WebDriverInstance;
import demo.locator.web.HomePageLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BukalapakHomePage implements HomePageLocator {
    WebDriverWait wait = new WebDriverWait(WebDriverInstance.webDriver, 15);

    public void openPage(){
        WebDriverInstance.webDriver.get("https://www.bukalapak.com");
    }

    public boolean isOnPage(){
        return wait.until(ExpectedConditions.presenceOfElementLocated(BUKALAPAK_LOGO)).isDisplayed();
    }

    public void chooseLogin(){
        WebElement element = WebDriverInstance.webDriver.findElement(LOGIN_BUTTON);
        element.click();
    }

    public boolean profileAvailable(){
        List<WebElement> elements = WebDriverInstance.webDriver.findElements(PROFILE_BUTTON);
        return elements.size() > 0;
    }
}
