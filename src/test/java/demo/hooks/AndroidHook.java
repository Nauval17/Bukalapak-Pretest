package demo.hooks;

import demo.driver.AndroidDriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AndroidHook {

    @Before(value = "@Android")
    public void initialize(){
        AndroidDriverInstance.initialize();
    }

    @After(value = "@Android")
    public void quit(){
        AndroidDriverInstance.quit();
    }
}
