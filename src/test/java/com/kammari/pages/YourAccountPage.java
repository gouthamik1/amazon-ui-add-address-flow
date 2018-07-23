package com.kammari.pages;

import com.kammari.config.AppConfiguration;
import com.kammari.pages.base.BasePage;
import com.kammari.util.DriverHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourAccountPage extends BasePage {

    @FindBy(css = "#a-page .ya-personalized *[data-card-identifier=\"Addresses\"] .a-span-last .a-text-normal")
    private WebElement YourAddressesLink;

    public YourAccountPage(WebDriver driver) {
        super(driver);
    }

    public void AtChecker() throws Exception{
        DriverHelper.AssertPageTitleContains("Your Account");
        DriverHelper.AssertPageUrlStartsWith(AppConfiguration.BaseUrl);
    }

    public void ClickOnYourAddressesLink() {
        YourAddressesLink.click();
    }
}
