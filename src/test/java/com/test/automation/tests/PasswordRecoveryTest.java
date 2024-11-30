package com.test.automation.tests;

import org.testng.annotations.Test;
import com.test.automation.pages.LoginPage;
import org.testng.Assert;

public class PasswordRecoveryTest extends BaseTest {

    @Test
    public void testNavigateToPasswordRecovery() {
        LoginPage loginPage = new LoginPage();
        loginPage.navigateToPasswordRecovery();
        
        // Assuming there is a specific element on the password recovery page to verify navigation
        // This could be a header or a specific form element unique to the password recovery page
        By passwordRecoveryHeader = By.className("password-recovery-header");
        Assert.assertTrue(loginPage.waitForElement(passwordRecoveryHeader).isDisplayed(), 
                          "Password recovery page should be displayed after navigation");
    }
}
