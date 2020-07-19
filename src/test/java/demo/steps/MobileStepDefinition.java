package demo.steps;

import demo.pages.mobile.MobileHomePage;
import demo.pages.mobile.MobileLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MobileStepDefinition {
    MobileLoginPage loginPage = new MobileLoginPage();
    MobileHomePage homePage = new MobileHomePage();

    @Given("User is on app login page")
    public void userIsOnAppLoginPage() {
        boolean status = loginPage.isOnPage();
        Assert.assertTrue(status);
    }

    @When("User input registered username {string}")
    public void userInputRegisteredUsername(String email) {
        loginPage.inputEmail(email);
    }

    @And("User input registered password {string}")
    public void userInputRegisteredPassword(String password) {
        loginPage.inputPass(password);
    }

    @And("User click app login button")
    public void userClickAppLoginButton() {
        loginPage.clickLogin();
    }

    @Then("User is on app home page")
    public void userIsOnAppHomePage() {
        boolean status = homePage.isOnHome();
        Assert.assertTrue(status);
    }
}
