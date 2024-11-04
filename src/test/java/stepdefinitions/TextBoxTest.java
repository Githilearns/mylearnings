package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.TextBoxPage;

public class TextBoxTest {
    TextBoxPage textBoxPage = new TextBoxPage();

    @Then("the text box page should be displayed")
    public void checkTextBoxPage() {
        Assert.assertTrue(textBoxPage.state().isDisplayed());
    }

    @When("the user enters their {string} in the Full Name text box")
    public void enterName(String name) {
        textBoxPage.enterFullName(name);
    }

    @And("the user clicks the submit button")
    public void clickSubmit() {
        textBoxPage.clickSubmit();
    }

    @Then("the entered name should be displayed at the bottom of the page")
    public void checkName() {
      Assert.assertTrue(textBoxPage.getBottomName().contains("Name:"));
      System.out.println( textBoxPage.getBottomName());
    }
}
