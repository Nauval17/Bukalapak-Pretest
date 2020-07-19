package demo.steps;

import demo.pages.web.WebHomePage;
import demo.pages.web.WebLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WebStepDefinition {
    WebHomePage homePage = new WebHomePage();
    WebLoginPage loginPage = new WebLoginPage();

    @Given("User open Bukalapak website")
    public void userOpenBukalapakWebsite() {
        homePage.openPage();
    }

    @Given("User is on Bukalapak homepage")
    public void userIsOnBukalapakHomepage() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        boolean status = homePage.isOnPage();
        Assert.assertTrue(status);
    }

    @When("User choose to login")
    public void userChooseToLogin() {
        homePage.chooseLogin();
    }

    @And("User is on Login Page")
    public void userIsOnLoginPage() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        boolean status = loginPage.isOnPage();
        Assert.assertTrue(status);
    }

    @And("User input username {string}")
    public void userInput(String username) {
        loginPage.inputUser(username);
    }

    @And("User input password {string}")
    public void userInputPassword(String password) {
        loginPage.inputPass(password);
    }

    @And("User click login button")
    public void userClickLoginButton() {
        loginPage.clickLogin();
    }

    @And("Profile button is available")
    public void profileButtonIsAvailable() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        boolean status = homePage.profileAvailable();
        Assert.assertTrue(status);
    }

    @And("User click profile button")
    public void userClickProfileButton() {
        homePage.clickProfile();
    }

    @Then("User log out")
    public void userLogOut() {
        homePage.logOut();
    }
}
