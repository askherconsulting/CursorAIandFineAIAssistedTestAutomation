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
    
    //FINE.AI GENERATED TEST REQUIRED ASSERTION TO BE MODIFIED TO BECOME VALID TEST
    @Test
    public void testInvalidLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("InvalidUser", "InvalidPass");
        Assert.assertTrue(loginPage.isErrorMessageDisplayed(), "Error message should be displayed when login is invalid");
    }
    //FINE.AI GENERATED TEST BUT NOT VALID - THERE IS NO ERROR MESSAGE DISPLAYED
/*     @Test
    public void testEmptyFieldsLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("", "");
        Assert.assertTrue(loginPage.isErrorMessageDisplayed(), 
            "Error message should be displayed when login fields are empty");
    } */
}