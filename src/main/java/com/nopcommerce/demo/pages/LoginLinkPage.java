package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginLinkPage extends Utility {
    By LoginLinkPage = By.xpath("//a[normalize-space()='Log in']");

    By verifyText = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");

    By checkoutAsAGuest = By.xpath("//button[normalize-space()='Checkout as Guest']");

    By clickOnLogOut = By.xpath("//a[contains(text(),'Log out')]");

    By WelcomeToOurStore = By.xpath("//h2[normalize-space()='Welcome to our store']");

    By emailId = By.xpath("//input[@id='Email']");
    By password = By.xpath("//input[@id='Password']");

    public String getLogInText() {
        return getTextFromElement(LoginLinkPage);
    }

    public void clickOnLogin() {
        clickOnElement(LoginLinkPage);
    }

    public String verifyText() {
        return getTextFromElement(verifyText);
    }

    public void CheckoutAsAGuest() {
        clickOnElement(checkoutAsAGuest);
    }

    public void clickOnLogOut() {
        clickOnElement(clickOnLogOut);
    }

    public String verifyText2() {
        return getTextFromElement(WelcomeToOurStore);
    }

    public void login(String Email, String PWD) {
        sendTextToElement(emailId, Email);
        sendTextToElement(password, PWD);
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));
    }
}