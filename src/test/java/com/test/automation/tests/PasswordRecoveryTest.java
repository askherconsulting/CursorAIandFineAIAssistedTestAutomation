package com.test.automation.tests;

import org.testng.annotations.Test;
import com.test.automation.pages.LoginPage;
import org.testng.Assert;

public class PasswordRecoveryTest extends BaseTest {
    //FINE.AI GENERATED TEST REQUIRED METHODS TO BE DEFINED IN LOGIN PAGE CLASS (BY CURSOR.AI) FOR TEST TO BE VALID
    @Test
    public void testNavigateToPasswordRecovery() {
        LoginPage loginPage = new LoginPage();
        loginPage.navigateToPasswordRecovery();
        Assert.assertTrue(loginPage.isPasswordRecoveryPageDisplayed(), 
            "Password recovery page should be displayed after navigation");
    }
}
