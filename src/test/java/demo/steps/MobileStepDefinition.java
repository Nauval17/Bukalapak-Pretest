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

    @When("User input app username {string}")
    public void userInputAppUsername(String email) {
        loginPage.inputEmail(email);
    }

    @And("User input app password {string}")
    public void userInputAppPassword(String password) {
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


    @Then("User see toast message")
    public void userSeeToastMessage() {
        boolean displayed = loginPage.toastMessage();
        Assert.assertTrue(displayed);
    }

    @Then("User see warning message")
    public void userSeeWarningMessage() {
        boolean displayed = loginPage.warningMessage();
        Assert.assertTrue(displayed);
    }
}
