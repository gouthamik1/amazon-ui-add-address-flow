package com.kammari.pages;

import com.kammari.config.AppConfiguration;
import com.kammari.pages.base.BasePage;
import com.kammari.util.DriverHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddNewAddressPage extends BasePage {

    @FindBy(css = "#address-ui-widgets-enterAddressFullName")
    private WebElement FullNameTextBox;

    @FindBy(css = "#address-ui-widgets-enterAddressLine1")
    private WebElement StreetAddressTextBox;

    @FindBy(css = "#address-ui-widgets-enterAddressCity")
    private WebElement CityTextBox;

    @FindBy(css = "#address-ui-widgets-enterAddressStateOrRegion")
    private WebElement StateTextBox;

    @FindBy(css = "#address-ui-widgets-enterAddressPostalCode")
    private WebElement ZipCodeTextBox;

    @FindBy(css = "#address-ui-widgets-enterAddressPhoneNumber")
    private WebElement PhoneNumberTextBox;

    @FindBy(css = " .a-button-input")
    private WebElement AddAddressButton;

    public AddNewAddressPage(WebDriver driver) {
        super(driver);
    }

    public void AtChecker() throws Exception{
        DriverHelper.AssertPageTitleContains("Your Addresses");
        DriverHelper.AssertPageUrlStartsWith(AppConfiguration.BaseUrl);
    }


    public void EnterFullName(String SearchTerm) {
        FullNameTextBox.sendKeys(SearchTerm);

    }

    public void EnterStreetAddressTextBox(String SearchTerm) {
        StreetAddressTextBox.sendKeys(SearchTerm);

    }

    public void EnterCityTextBox(String SearchTerm) {
        CityTextBox.sendKeys(SearchTerm);

    }

    public void EnterStateTextBox(String SearchTerm) {
        StateTextBox.sendKeys(SearchTerm);

    }

    public void EnterZipCodeTextBox(String SearchTerm) {
        ZipCodeTextBox.sendKeys(SearchTerm);

    }
    public void EnterPhoneNumberTextBox(String SearchTerm){
        PhoneNumberTextBox.sendKeys(SearchTerm);
    }

    public void ClickOnAddAddressButton(){
        AddAddressButton.click();
    }
}
