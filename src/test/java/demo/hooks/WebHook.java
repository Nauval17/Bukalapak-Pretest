package demo.hooks;

import demo.driver.WebDriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class WebHook {

    @Before(value = "@Web")
    public void initializeBrowser(){
        WebDriverInstance.initialize();
    }

    @After(value = "@Web")
    public void quitBrowser(){
        WebDriverInstance.quit();
    }
}
