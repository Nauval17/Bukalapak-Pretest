package demo.locator.mobile;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface MobileLoginPageLocator {
    By APPS_LOGO = MobileBy.xpath("//android.widget.ImageView");
    By APPS_VERSION = MobileBy.xpath("//android.widget.TextView[1]");
    By INPUT_EMAIL = MobileBy.id("textInputEditTextEmail");
    By INPUT_PASS = MobileBy.id("textInputEditTextPassword");
    By LOGIN_BUTTON = MobileBy.id("appCompatButtonLogin");
    By CREATE_ACCOUNT = MobileBy.id("textViewLinkRegister");
    By WARNING_EMAIL = MobileBy.xpath("//TextInputLayout//android.widget.TextView");
    By TOAST_MESSAGE = MobileBy.id("snackbar_text");
}
