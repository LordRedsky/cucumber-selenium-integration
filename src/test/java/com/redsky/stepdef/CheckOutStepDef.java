package com.redsky.stepdef;

import com.redsky.BaseTest;
import com.redsky.page.CheckoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.Map;

public class CheckOutStepDef extends BaseTest {

    CheckoutPage checkoutPage;

    @And("user click add to cart for one item {string}")
    public void userClickAddToCartForOneItem(String titleProduct) throws InterruptedException {
        checkoutPage = new CheckoutPage(driver);
        Thread.sleep(1000);
        checkoutPage.clickSelectedItem(titleProduct);
    }

    @And("user validate number of item shows correct number with {string}")
    public void userValidateNumberOfItemShowsCorrectNumberWith(String numberOfItem) throws  InterruptedException {
        Thread.sleep(1000);
        checkoutPage.validateNumberOrderItem(numberOfItem);
    }

    @And("user click cart icon")
    public void userClickCartIcon() throws InterruptedException {
        Thread.sleep(1000);
        checkoutPage.clickCartIcon();
    }
    @And("use click checkout button")
    public void useClickCheckoutButton() throws  InterruptedException {
        Thread.sleep(2000);
        checkoutPage.clickCheckoutBtn();
    }


    @And("user click continue")
    public void userClickContinue() {
        checkoutPage.clickContinueBtn();
    }

    @And("user fill in the shipping address with:")
    public void userFillInTheShippingAddressWith(Map<String, String> shippingData) throws InterruptedException {
        String first_name = shippingData.get("First name");
        String last_name = shippingData.get("Last name");
        String zip_code = shippingData.get("Zip code");

        checkoutPage.fillInShippingAdress(first_name, last_name, zip_code);
        Thread.sleep(1000);
    }

    @And("user fill in the shipping address with empty data")
    public void userFillInTheShippingAddressWithEmptyData() {
        checkoutPage.fillInShippingAdress("", "", "");
    }

    @And("user click finish")
    public void userClickFinish() {
        checkoutPage.clickFinishBtn();
    }

    @Then("user transaction is successfully and there will appear icon Pony Express")
    public void userTransactionIsSuccessfullyAndThereWillAppearIconPonyExpress() throws  InterruptedException {
        Thread.sleep(1000);
        checkoutPage.validateSuccess();
    }

    @Then("user user see error message {string}")
    public void userUserSeeErrorMessage(String errorMessage) throws  InterruptedException {
        Thread.sleep(1000);
        checkoutPage.validateErrorMessage(errorMessage);
    }



}
