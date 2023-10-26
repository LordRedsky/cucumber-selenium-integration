package com.redsky.stepdef;

import com.redsky.BaseTest;
import com.redsky.page.SortitemPage;
import io.cucumber.java.en.And;

public class SortItemDef extends BaseTest {

    SortitemPage sortitemPage;

    @And("user click sort icon")
    public void userClickSortIcon() throws InterruptedException {
        sortitemPage = new SortitemPage(driver);
        Thread.sleep(1000);
        sortitemPage.clickSortIcon();
    }

    @And("user click options {string}")
    public void userClickOptions(String hiloOptions) throws InterruptedException {
        Thread.sleep(1000);
        sortitemPage.selectOptionsHiloPrice(hiloOptions);
    }

    @And("validate that the items are sorted properly")
    public void validateThatTheItemsAreSortedProperly() throws  InterruptedException {
        Thread.sleep(1000);
        sortitemPage.validateSort();
    }


}
