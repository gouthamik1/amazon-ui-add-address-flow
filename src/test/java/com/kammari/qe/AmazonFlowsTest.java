package com.kammari.qe;

import com.kammari.config.AppConfiguration;
import com.kammari.pages.*;
import com.kammari.qe.base.FunctionalTest;
import org.junit.Test;

import com.kammari.util.WaitHelper;

import static junit.framework.TestCase.assertTrue;

public class AmazonFlowsTest extends FunctionalTest {

    @Test
    public void AddAddress() throws Exception {

        HomePage homePage = new HomePage(driver);
        homePage.AtChecker();
        homePage.ClickOnSignIn();
        WaitHelper.WaitForPageLoad();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.AtChecker();

        loginPage.EnterEmail(AppConfiguration.Email);
        WaitHelper.WaitForPageLoad();

        loginPage.ClickOnContinueButton();
        WaitHelper.WaitForPageLoad();

        loginPage.EnterPassword(AppConfiguration.Password );
        WaitHelper.WaitForPageLoad();

        loginPage.ClickOnSignInSubmitButton();
        WaitHelper.WaitForPageLoad();

        LandingPage landingPage = new LandingPage(driver);
        landingPage.AtChecker();
        landingPage.hoverOnAccountListDropDownLink();

        landingPage.ClickOnYourAccountLink();
        WaitHelper.WaitForPageLoad();

        YourAccountPage yourAccountPage = new YourAccountPage(driver);
        yourAccountPage.AtChecker();
        yourAccountPage.ClickOnYourAddressesLink();
        WaitHelper.WaitForPageLoad();

        YourAddressesPage yourAddressesPage = new YourAddressesPage(driver);
        yourAddressesPage.AtChecker();
        yourAddressesPage.ClickOnAddAddressLink();
        WaitHelper.WaitForPageLoad();

        AddNewAddressPage addNewAddressPage = new AddNewAddressPage(driver);
        addNewAddressPage.AtChecker();

        addNewAddressPage.EnterFullName("< Enter full name >");
        WaitHelper.WaitForPageLoad();

        addNewAddressPage.EnterStreetAddressTextBox("< Enter valid street address >");
        WaitHelper.WaitForPageLoad();

        addNewAddressPage.EnterCityTextBox("< Enter City >");
        WaitHelper.WaitForPageLoad();

        addNewAddressPage.EnterStateTextBox("< Enter State >");
        WaitHelper.WaitForPageLoad();

        addNewAddressPage.EnterZipCodeTextBox("< Enter Zip Code > ");
        WaitHelper.WaitForPageLoad();

        addNewAddressPage.EnterPhoneNumberTextBox("< Enter Phone num > ");
        WaitHelper.WaitForPageLoad();

        addNewAddressPage.ClickOnAddAddressButton();
        WaitHelper.WaitForPageLoad();

        landingPage.hoverOnAccountListDropDownLink();
        landingPage.ClickOnSignOutLink();
        WaitHelper.WaitForPageLoad();

        //Check you are back on home page
        homePage.AtChecker();
    }
}