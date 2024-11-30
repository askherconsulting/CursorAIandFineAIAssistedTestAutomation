package com.test.automation.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private By usernameField = By.name("username");
    private By passwordField = By.name("password");
    private By loginButton = By.cssSelector("button[type='submit']");
    private By dashboardHeader = By.xpath("//h6[contains(@class, 'oxd-text') and text()='Dashboard']");
    private By forgotPasswordLink = By.cssSelector(".orangehrm-login-forgot");
    private By resetPasswordHeader = By.cssSelector(".orangehrm-forgot-password-title");
    private By errorMessage = By.cssSelector(".oxd-alert-content-text"); // Yes, this selector appears correct for capturing error messages in OrangeHRM's login page. It targets the error text container with class 'oxd-alert-content-text'
    
    public void login(String username, String password) {
        type(usernameField, username);
        type(passwordField, password);
        click(loginButton);
    }
    
    public boolean isDashboardDisplayed() {
        return waitForElement(dashboardHeader).isDisplayed();
    }
    
    public boolean isErrorMessageDisplayed() {
        return waitForElement(errorMessage).isDisplayed();
    }
    
    public String getErrorMessage() {
        return waitForElement(errorMessage).getText();
    }
    
    public void navigateToPasswordRecovery() {
        click(forgotPasswordLink);
    }
    
    public boolean isPasswordRecoveryPageDisplayed() {
        return waitForElement(resetPasswordHeader).isDisplayed();
    }
}