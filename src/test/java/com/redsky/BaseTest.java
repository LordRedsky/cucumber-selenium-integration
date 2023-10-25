package com.redsky;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseTest {
    protected static WebDriver driver;
    protected void getDriver() {
//        FirefoxOptions options = new FirefoxOptions();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
//        WebDriverManager.chromedriver().setup();
//        WebDriverManager.firefoxdriver().setup();
//        driver = new ChromeDriver(options);
//        driver = new FirefoxDriver(options);
    }
}
