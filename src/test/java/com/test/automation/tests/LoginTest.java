package com.test.automation.tests;

import org.testng.annotations.Test;
import com.test.automation.pages.LoginPage;
import org.testng.Assert;

public class LoginTest extends BaseTest {
    
    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("Admin", "admin123");
        Assert.assertTrue(loginPage.isDashboardDisplayed(), "Dashboard should be visible after successful login");
    }
    
    @Test
    public void testInvalidLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("InvalidUser", "InvalidPass");
        Assert.assertFalse(loginPage.isDashboardDisplayed(), "Dashboard should not be visible after unsuccessful login");
    }
    
    @Test
    public void testEmptyFieldsLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("", "");
        Assert.assertFalse(loginPage.isDashboardDisplayed(), "Dashboard should not be visible when login fields are empty");
    }
}