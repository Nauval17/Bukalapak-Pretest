package pageobjects;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static demo.driver.AndroidDriverInstance.androidDriver;

public class MobilePageObject {
    /**
     * Perform action to click button or clickable element,
     * will wait until the element is enabled.
     * @param id
     */
    public void clickOn(By id) {
        waitUntilEnabled(id);
        AndroidElement button = androidDriver.findElement(id);
        button.click();
    }

    /**
     * Perform type action of input field elements,
     * will wait until element is displayed.
     *
     * @param id   locator of element
     * @param text user input text
     */
    public void typeON(By id, String text) {
        waitUntilDisplayed(id);
        AndroidElement field = androidDriver.findElement(id);
        field.clear();
        field.sendKeys(text);
    }

    /**
     * Perform wait condition until the element is presented.
     *
     * @param id locator of element
     */
    public boolean waitUntilDisplayed(By id) {
        WebDriverWait wait = new WebDriverWait(androidDriver, 30);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(id));
        return element.isDisplayed();
    }

    /**
     * Perform waiting condition until the element is available.
     *
     * @param id locator of element
     */
    public boolean waitUntilEnabled(By id) {
        WebDriverWait wait = new WebDriverWait(androidDriver, 5);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(id));
        return element.isEnabled();
    }

    /**
     * Perform checking if element status is displayed and returning true condition
     *
     * @param id locator of element
     * @return return condition
     */
    public boolean checkIfDisplayed(By id) {
        AndroidElement element = androidDriver.findElement(id);
        return element.isDisplayed();
    }

    /**
     * Perform checking if element status is enabled and returning true condition
     *
     * @param id locator of element
     * @return return condition
     */
    public boolean checkIfEnabled(By id) {
        AndroidElement element = androidDriver.findElement(id);
        return element.isEnabled();
    }

    /**
     * Perform checking if toast is appeared and returning true condition
     *
     * @param id locator of element
     * @return return condition
     */
    public String checkToast(By id) {
        AndroidElement toast = androidDriver.findElement(id);
        return toast.getAttribute("name");
    }

    /**
     *
     * @param name string inside locator
     * @param locator locator where the element is
     */
    public void multipleID(String name, By locator) {
        List<AndroidElement> filters = androidDriver.findElements(locator);
        for (AndroidElement filter : filters) {
            if (filter.getText().contains(name)) {
                filter.click();
                break;
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param locator locator that want to be checked
     * @return return the size of locator that appeared
     */
    public boolean checkElement(By locator) {
        List<AndroidElement> elements = androidDriver.findElements(locator);
        return elements.size() > 0;
    }
}
