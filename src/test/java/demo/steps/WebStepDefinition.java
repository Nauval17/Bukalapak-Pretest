package demo.steps;

import demo.pages.web.WebHomePage;
import demo.pages.web.WebLoginFacebookPage;
import demo.pages.web.WebLoginGooglePage;
import demo.pages.web.WebLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WebStepDefinition {
    WebHomePage homePage = new WebHomePage();
    WebLoginPage loginPage = new WebLoginPage();
    WebLoginFacebookPage facebookPage = new WebLoginFacebookPage();
    WebLoginGooglePage googlePage = new WebLoginGooglePage();

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

    @And("User choose to login via facebook")
    public void userChooseToLoginViaFacebook() {
        loginPage.viaFacebook();
    }

    @And("User is on facebook login page")
    public void userIsOnFacebookLoginPage() {
        boolean status = facebookPage.loginPage();
        Assert.assertTrue(status);
    }

    @And("User input facebook username {string}")
    public void userInputFacebookUsername(String email) {
        facebookPage.inputEmail(email);
    }

    @And("User input facebook password {string}")
    public void userInputFacebookPassword(String password) {
        facebookPage.inputPassword(password);
        facebookPage.loginButton();
    }

    @And("User confirm facebook account")
    public void userConfirmFacebookAccount() {
        facebookPage.confirmAccount();
    }

    @And("User choose to login via google")
    public void userChooseToLoginViaGoogle() {
        loginPage.viaGoogle();
    }

    @And("User is on google account choosing")
    public void userIsOnGoogleAccountChoosing() {
        boolean status = googlePage.isOnPage();
        Assert.assertTrue(status);
    }

    @And("User choose google account {string}")
    public void userChooseGoogleAccount(String account) {
        googlePage.chooseAccount(account);
    }

    @And("User choose another account {string}")
    public void userChooseAnotherAccount(String account) {
        googlePage.chooseAccount(account);
    }

    @And("User input google email {string}")
    public void userInputGoogleEmail(String email) {
        googlePage.inputEmail(email);
        googlePage.goToPass();
    }

    @And("User input google password {string}")
    public void userInputGooglePassword(String password) {
        googlePage.inputPassword(password);
        googlePage.confirm();
    }
}
