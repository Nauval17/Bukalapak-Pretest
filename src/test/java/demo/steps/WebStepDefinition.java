package demo.steps;

import demo.pages.web.BukalapakHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WebStepDefinition {
    BukalapakHomePage homePage = new BukalapakHomePage();

    @Given("User open Bukalapak website")
    public void userOpenBukalapakWebsite() {
        homePage.openPage();
    }

    @Given("User is on Bukalapak homepage")
    public void userIsOnBukalapakHomepage() {
        boolean status = homePage.isOnPage();
        Assert.assertTrue(status);
    }

    @When("User choose to login")
    public void userChooseToLogin() {
        homePage.chooseLogin();
    }

    @And("User is on Login Page")
    public void userIsOnLoginPage() {
    }

    @And("User input {string}")
    public void userInput(String arg0) {
    }
}
