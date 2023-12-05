package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterLinkPage extends Utility {
    //2.19 Verify the text “Register”
    By RegisterLinkPage = By.xpath("//a[normalize-space()='Register']");

    //2.20 Fill the mandatory fields
    By firstNameTextBox = By.id("FirstName");
    By lastNameTextBox = By.id("LastName");
    By emailTextBox = By.id("Email");
    By passwordTextBox = By.id("Password");
    By confirmPasswordTextBox = By.id("ConfirmPassword");

    //2.21 Click on “REGISTER” Button
    By registerButton = By.id("register-button");

    //2.22 Verify the message “Your registration completed”
    By registerSuccessText = By.className("result");

    //2.23 Click on “CONTINUE” tab
    By continueButton = By.xpath("//a[contains(text(),'Continue')]");

    public String getRegisterTabText() {
        return getTextFromElement(RegisterLinkPage);
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

    public void inputPassword(String password) {
        sendTextToElement(passwordTextBox, password);
    }

    public void inputConfirmPassword(String confirmpassword) {
        sendTextToElement(confirmPasswordTextBox, confirmpassword);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
    }

    public String getRegisterSuccessText() {
        return getTextFromElement(registerSuccessText);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

    //final String randomEmail = randomEmail();
    By email = By.id("Email");
//    public void enterEmail(){
//        Random randomPartOfEmailGenerator = new Random(5000);
//        int randomNumberInEmail = randomPartOfEmailGenerator.nextInt();
//        //random string generator - to use in email
//        RandomString randomString = new RandomString(5);
//        String randomStringInEmailGenerator = randomString.nextString();
//        String generatedEmail = "robert" + randomNumberInEmail + randomStringInEmailGenerator + "mouse@gmail.com";
//        sendTextToElement(email, generatedEmail);
    // }

}


