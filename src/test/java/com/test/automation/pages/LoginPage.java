package com.test.automation.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private By usernameField = By.name("username");
    private By passwordField = By.name("password");
    private By loginButton = By.cssSelector("button[type='submit']");
    
    public void login(String username, String password) {
        type(usernameField, username);
        type(passwordField, password);
        click(loginButton);
    }
    
    public boolean isDashboardDisplayed() {
        return waitForElement(By.className("oxd-text--h6")).isDisplayed();
    }
} 