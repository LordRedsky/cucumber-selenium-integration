package com.redsky.stepdef;

import com.redsky.BaseTest;
import com.redsky.page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;


public class LoginStepDef extends BaseTest {

    protected LoginPage loginPage;

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
    }

    @And("user input username with {string}")
    public void userInputUsernameWith(String username)throws InterruptedException {
        loginPage.inputUsername(username);
        Thread.sleep(1000);
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password) throws InterruptedException{
        loginPage.inputPassword(password);
        Thread.sleep(1000);
    }

    @When("user click login button")
    public void userClickLoginButton() throws InterruptedException {
        loginPage.clickLoginButton();
        Thread.sleep(1000);
    }


    @Then("user see error message {string}")
    public void userSeeErrorMessage(String errorMessage) throws InterruptedException{
        loginPage.validateErrorAppear(errorMessage);
        Thread.sleep(1000);
    }

    @When("user already logged in with valid email")
    public void userAlreadyLoggedInWithValidEmail() throws InterruptedException {
        String username = "standard_user";
        String password = "secret_sauce";

        loginPage = new LoginPage(driver);
        Thread.sleep(1000);
        loginPage.goToLoginPage();
        Thread.sleep(1000);
        loginPage.inputUsername(username);
        loginPage.inputPassword(password);
        Thread.sleep(1000);
        loginPage.clickLoginButton();
    }
}
