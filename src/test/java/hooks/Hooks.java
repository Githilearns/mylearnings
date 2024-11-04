package hooks;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import io.cucumber.java.Before;
import org.testng.annotations.AfterMethod;
import utils.SettingsTestData;

public class Hooks {
    private Browser browser = AqualityServices.getBrowser();

    @Before
    public void setUP() {
        browser = AqualityServices.getBrowser();
        browser.maximize();
        browser.goTo(SettingsTestData.getEnvData().getHost());
    }

    @AfterMethod
    public void tearDown() {
        browser.quit();
    }
}
