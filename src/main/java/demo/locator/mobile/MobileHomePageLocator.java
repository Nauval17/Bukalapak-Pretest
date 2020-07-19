package demo.locator.mobile;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface MobileHomePageLocator {
    By PROFILE = MobileBy.xpath("//android.widget.TextView[3]");
}
