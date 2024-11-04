package stepdefinitions;

import aquality.selenium.browser.AqualityServices;
import io.cucumber.java.en.Given;
import utils.SettingsTestData;

import static io.qameta.allure.Allure.step;

public class MainPage {
    @Given("the user is on the text box page")
    public void goToMainPage() {
        step("Go to the text box page");
        String url = SettingsTestData.getEnvData().getHost();
        AqualityServices.getBrowser().goTo(url);
    }
}
