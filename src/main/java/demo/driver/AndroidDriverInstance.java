package demo.driver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AndroidDriverInstance {
    public static AndroidDriver<AndroidElement> androidDriver;

    public static void initialize() {
        String appiumUrl = "http://127.0.0.1:4723/wd/hub/";
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "device");
        caps.setCapability("udid", "29dc02f");
        caps.setCapability("autoGrantPermissions", true);
        caps.setCapability("noReset", true);
        caps.setCapability("wdaStartupRetries", "4");
        caps.setCapability("wdaStartupRetryInterval", "20000");
        caps.setCapability("newCommandTimeout", 120);
        caps.setCapability("app",
                System.getProperty("user.dir") + File.separator + "APP" + File.separator
                        + "SampleAPK.apk");
        caps.setCapability("automationName", "UiAutomator2");
        try {
            androidDriver = new AndroidDriver<>(new URL(appiumUrl), caps);
            androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static AndroidDriver<AndroidElement> getWebDriver() {
        if (androidDriver == null) {
            initialize();
        }
        return androidDriver;
    }

    public static void quit() {
        androidDriver.quit();
    }
}
