package com.redsky.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
    @Given("user is on login page")
    public void userIsOnLoginPage() {
    }

    @And("user input username with {string}")
    public void userInputUsernameWith(String username) {
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password) {
    }

    @When("user click login button")
    public void userClickLoginButton() {
    }

    @Then("user redirect to homepage")
    public void userRedirectToHomepage() {
    }

    @Then("user stays on the login page")
    public void userStaysOnTheLoginPage() {
    }

    @And("user see error message")
    public void userSeeErrorMessage() {
    }
}
