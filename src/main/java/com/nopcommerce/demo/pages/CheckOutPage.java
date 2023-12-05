package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {
    //2.21Click on “CHECKOUT AS GUEST” Tab
    By clickOnCheckOutAsGuest = By.xpath("//button[normalize-space()='Checkout as Guest']");

    //2.22 Fill the all mandatory field
    By firstNameTextBox = By.id("BillingNewAddress_FirstName");
    By lastNameTextBox = By.id("BillingNewAddress_LastName");
    By emailTextBox = By.id("BillingNewAddress_Email");
    By countryDropDown = By.id("BillingNewAddress_CountryId");
    By stateDropDown = By.id("BillingNewAddress_StateProvinceId");
    By cityTextBox = By.id("BillingNewAddress_City");
    By address1TextBox = By.id("BillingNewAddress_Address1");
    By postalCodeTextBox = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumberTextBox = By.id("BillingNewAddress_PhoneNumber");

    //2.23 Click on “CONTINUE”
    By continueButton = By.xpath("//button[@onclick='Billing.save()']");

    //2.24 Click on Radio Button “Next Day Air($0.00)”
    By nextDayAirRadioButton = By.xpath("//label[normalize-space()='Next Day Air ($0.00)']");

    //2.25 Click on “CONTINUE”
    By continueButton1 = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");

    //2.26 Select Radio Button “Credit Card”
    By creditCard = By.id("paymentmethod_1");
    By paymentContinue = By.xpath("//button[@class='button-1 payment-method-next-step-button']");

    //2.27 Select “Master card” From Select credit card dropdown
    By creditCardDropDown = By.id("CreditCardType");

    //2.28 Fill all the details
    By cardHolderName = By.id("CardholderName");
    By cardNumber = By.id("CardNumber");
    By expireMonthDropdown = By.id("ExpireMonth");
    By expireYearDropdown = By.id("ExpireYear");
    By cardCode = By.id("CardCode");

    //2.29 Click on “CONTINUE”
    By continueButton2 = By.xpath("(//button[@class='button-1 payment-info-next-step-button'])[1]");

    //2.30 Verify “Payment Method” is “Credit Card"
    By creditCardText = By.xpath("//li[@class='payment-method']");

    //2.32 Verify “Shipping Method” is “Next Day Air”
    By nextDayAirText = By.xpath("//li[@class='shipping-method']");

    //2.33 Verify Total is “$2,950.00”
    By totalAmountText = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");

    //2.34 Click on “CONFIRM”
    By confirmButton = By.xpath("//button[normalize-space()='Confirm']");

    //2.35 Verify the Text “Thank you”
    By thankYouText = By.xpath("//h1[normalize-space()='Thank you']");

    //2.36 Verify the message “Your order has been successfully processed!”
    By orderSuccessProcessText = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");

    //2.37 Click on “CONTINUE”
    By continueButton3 = By.xpath("//button[normalize-space()='Continue']");
    By radioButton2ndDayAir = By.id("shippingoption_2");
    By secondDayAirText = By.xpath("//span[contains(.,'2nd Day Air')]");
    By totalAmountNokiaText = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]");

    public void clickOnCheckOutAsGuest() {
        clickOnElement(clickOnCheckOutAsGuest);
    }

    public void inputFirstname(String firstname) {
        sendTextToElement(firstNameTextBox, firstname);
    }

    public void inputLastname(String lastname) {
        sendTextToElement(lastNameTextBox, lastname);
    }

    public void inputEmail(String email) {
        sendTextToElement(emailTextBox, email);
    }

    public void selectCountry(String countryname) {
        selectByVisibleTextFromDropDown(countryDropDown, countryname);
    }

    public void selectState(String statename) {
        selectByVisibleTextFromDropDown(stateDropDown, statename);
    }

    public void inputCity(String cityname) {
        sendTextToElement(cityTextBox, cityname);
    }

    public void inputAddress1(String address) {
        sendTextToElement(address1TextBox, address);
    }

    public void inputPostalCode(String postcode) {
        sendTextToElement(postalCodeTextBox, postcode);
    }

    public void inputPhoneNumber(String phone) {
        sendTextToElement(phoneNumberTextBox, phone);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

    public void clickOnNextDayAirRadioButton() {
        clickOnElement(nextDayAirRadioButton);
    }

    public void clickOnContinueButton1() {
        clickOnElement(continueButton1);
    }

    public void clickOnCreditCard() {
        clickOnElement(creditCard);
    }

    public void clickOnPaymentContinueButton() {
        clickOnElement(paymentContinue);
    }

    public void selectCreditCard(String card) {
        selectByVisibleTextFromDropDown(creditCardDropDown, card);
    }

    public void inputCardHolderName(String holdername) {
        sendTextToElement(cardHolderName, holdername);
    }

    public void inputCardNumber(String card) {
        sendTextToElement(cardNumber, card);

    }

    public void selectExpireMonth(String expirymonth) {
        selectByVisibleTextFromDropDown(expireMonthDropdown, expirymonth);
    }

    public void selectExpireYear(String expiryyear) {
        selectByVisibleTextFromDropDown(expireYearDropdown, expiryyear);
    }

    public void inputCardCode(String cvc) {
        sendTextToElement(cardCode, cvc);
    }

    public void clickOnContinueButton2() {
        clickOnElement(continueButton2);
    }

    public String getCreditCardText() {
        return getTextFromElement(creditCardText);
    }

    public String getNextDayAirText() {
        return getTextFromElement(nextDayAirText);
    }

    public String getTotalAmountText() {
        return getTextFromElement(totalAmountText);
    }

    public void clickOnConfirmButton() {
        clickOnElement(confirmButton);
    }

    public String getThankYouText() {
        return getTextFromElement(thankYouText);
    }

    public String getOrderSuccessProcessText() {
        return getTextFromElement(orderSuccessProcessText);
    }

    public void clickOnContinueButton3() {
        clickOnElement(continueButton3);
    }

    public void clickOnRadioButton2ndDayAir() {
        clickOnElement(radioButton2ndDayAir);
    }

    public String get02ndDayText() {
        return getTextFromElement(secondDayAirText);
    }

    public String getTotalAmountNokiaText() {
        return getTextFromElement(totalAmountNokiaText);
    }
}




