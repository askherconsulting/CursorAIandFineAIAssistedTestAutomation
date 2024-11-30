package com.test.automation.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private By usernameField = By.name("username");
    private By passwordField = By.name("password");
    private By loginButton = By.cssSelector("button[type='submit']");
    private By dashboardHeader = By.className("oxd-text--h6");  // OrangeHRM dashboard header
    private By errorMessage = By.cssSelector(".error-message"); // Error message element
    private By passwordRecoveryLink = By.linkText("Forgot your password?"); // Password recovery link
    
    public void login(String username, String password) {
        type(usernameField, username);
        type(passwordField, password);
        click(loginButton);
    }
    
    public String getErrorMessage() {
        return waitForElement(errorMessage).getText();
    }
    
    public void navigateToPasswordRecovery() {
        click(passwordRecoveryLink);
    }
    
    public boolean isDashboardDisplayed() {
        return waitForElement(dashboardHeader).isDisplayed();
    }
}