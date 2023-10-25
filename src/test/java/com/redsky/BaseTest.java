package com.redsky;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    protected static WebDriver driver;
    protected void getDriver() {
        driver = WebDriverManager.chromiumdriver().create();
    }
}
