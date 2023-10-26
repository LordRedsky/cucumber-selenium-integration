package com.redsky.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckoutPage {

    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    By selectedItem = By.xpath("//*[@id=\"item_1_title_link\"]");
    By addToCart = By.cssSelector("#add-to-cart-sauce-labs-bolt-t-shirt");
    By totalOrderItem = By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a/span");
//    By cartQuantity = By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[1]");
    By cartIcon = By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a");
    By successIcon = By.xpath("/html/body/div/div/div/div[2]/img");
    By checkoutBtn = By.xpath("//*[@id=\"checkout\"]");
    By continueBtn = By.xpath("//*[@id=\"continue\"]");
    By finishBtn = By.xpath("//*[@id=\"finish\"]");
    By fnameTextBox = By.xpath("//*[@id=\"first-name\"]");
    By lnameTextBox = By.xpath("//*[@id=\"last-name\"]");
    By zipcodeTextBox = By.xpath("//*[@id=\"postal-code\"]");


    public void clickSelectedItem(String titleProduct) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement selectedProduct = wait.until(ExpectedConditions.visibilityOfElementLocated(selectedItem));
        assertTrue(selectedProduct.isDisplayed());
        assertEquals(titleProduct, selectedProduct.getText());

        WebElement selected = wait.until(ExpectedConditions.elementToBeClickable(addToCart));
        selected.click();
    }

    public void validateNumberOrderItem(String numberOfItem) {
        String totalOrderByCartIcon = driver.findElement(totalOrderItem).getText();
//        String totalOrderByCartPage = driver.findElement(cartQuantity).getText();

        assertTrue(numberOfItem.contains(totalOrderByCartIcon));
    }

    public void clickCartIcon() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement cart = wait.until(ExpectedConditions.elementToBeClickable(cartIcon));
        cart.click();
    }
    public void clickCheckoutBtn() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement checkout = wait.until(ExpectedConditions.elementToBeClickable(checkoutBtn));
        checkout.click();
    }

    public void fillInShippingAdress(String fname, String lname, String zipcode) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement fullNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(fnameTextBox));
        WebElement lastNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(lnameTextBox));
        WebElement zipCodeField = wait.until(ExpectedConditions.visibilityOfElementLocated(zipcodeTextBox));

        fullNameField.sendKeys(fname);
        lastNameField.sendKeys(lname);
        zipCodeField.sendKeys(zipcode);
    }

    public void clickContinueBtn() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
        continueButton.click();
    }

    public void clickFinishBtn() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement finishButton = wait.until(ExpectedConditions.elementToBeClickable(finishBtn));
        finishButton.click();
    }
    public void validateSuccess() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement notification = wait.until(ExpectedConditions.visibilityOfElementLocated(successIcon));
        System.out.println(notification.getText());
        assertTrue(notification.isDisplayed());
//        assertEquals(icon, notification.getText());
    }

    public void validateErrorMessage(String errorMessage) {
        assertTrue(driver.getPageSource().contains(errorMessage));
    }


}


