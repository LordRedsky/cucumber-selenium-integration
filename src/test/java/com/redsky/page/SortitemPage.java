package com.redsky.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SortitemPage {
    WebDriver driver;

    public SortitemPage(WebDriver driver) {this.driver = driver;}

    By sortIcon = By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select");
    By options = By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select/option[4]");
    By highPrice = By.cssSelector("div.inventory_item:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1)");


    public void clickSortIcon() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement sort_icon = wait.until(ExpectedConditions.visibilityOfElementLocated(sortIcon));
        assertTrue(sort_icon.isDisplayed());

        sort_icon.click();
    }

    public void selectOptionsHiloPrice(String hiloOptions) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement optionsElement = wait.until(ExpectedConditions.visibilityOfElementLocated(options));
        assertTrue(optionsElement.isDisplayed());
        assertEquals(hiloOptions, optionsElement.getText());

        optionsElement.click();
    }

    public void validateSort() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement hiloPrice = wait.until(ExpectedConditions.visibilityOfElementLocated(highPrice));
        assertTrue(hiloPrice.isDisplayed());
    }
}
