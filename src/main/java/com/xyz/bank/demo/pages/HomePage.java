package com.xyz.bank.demo.pages;

import com.xyz.bank.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Bank Manager Login']")
    WebElement managerLogin;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Customer Login']")
    WebElement customerLogin;


    public void setManagerLogin() {
        clickOnElement(managerLogin);
    }


    public void setCustomerLogin() {
        clickOnElement(customerLogin);
    }

}
