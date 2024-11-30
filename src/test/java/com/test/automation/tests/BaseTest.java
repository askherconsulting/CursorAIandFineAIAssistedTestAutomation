package com.test.automation.tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import com.test.automation.utils.DriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;

import com.test.automation.config.Configuration;

public class BaseTest {
    protected WebDriver driver;
    
    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        DriverManager.setDriver(driver);
        driver = DriverManager.getDriver();
        driver.manage().window().maximize();
        driver.get(Configuration.getUrl());
    }
    
    @AfterMethod
    public void tearDown() {
        DriverManager.quitDriver();
    }
} 