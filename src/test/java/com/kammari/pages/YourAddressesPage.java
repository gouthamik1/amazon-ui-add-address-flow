package com.kammari.pages;

import com.kammari.config.AppConfiguration;
import com.kammari.pages.base.BasePage;
import com.kammari.util.DriverHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourAddressesPage extends BasePage {

    @FindBy(css = "#ya-myab-plus-address-icon")
    private WebElement AddAddressLink;

    public YourAddressesPage(WebDriver driver) {
        super(driver);
    }

    public void AtChecker() throws Exception{
        DriverHelper.AssertPageTitleContains("Your Addresses");
        DriverHelper.AssertPageUrlStartsWith(AppConfiguration.BaseUrl);
    }

    public void ClickOnAddAddressLink() {
        AddAddressLink.click();
    }
}
