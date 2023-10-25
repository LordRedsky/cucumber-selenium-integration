package com.redsky.stepdef;

import com.redsky.BaseTest;
import com.redsky.page.HomePage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomeStepDef extends BaseTest {

    HomePage homePage;

    @Then("user redirect to homepage")
    public void userRedirectToHomepage() {
        homePage = new HomePage(driver);
        homePage.validateOnHomePage();
    }
}
