package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicTest extends BaseTest {
    ElectronicsPage electronicsPage = new ElectronicsPage();
    CellPhonePage cellPhonePage = new CellPhonePage();
    NokiaLumiaPage nokiaLumiaPage = new NokiaLumiaPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    LoginLinkPage loginLinkPage = new LoginLinkPage();
    RegisterLinkPage registerLinkPage = new RegisterLinkPage();
    CheckOutPage checkOutPage = new CheckOutPage();


    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        //1.1 Mouse Hover on “Electronics” Tab
        electronicsPage.getElectronicTab();

        //1.2 Mouse Hover on “Cell phones” and "Click"
        electronicsPage.mouseHoverToCellPhones();

        //1.3 Verify the text “Cell phones”
        String actualText = cellPhonePage.getCellPhoneText();
        Assert.assertEquals(actualText, "Cell phones", "Text not Displayed");
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        //2.1 Mouse Hover on “Electronics” Tab
        electronicsPage.getElectronicTab();

        //2.2 Mouse Hover on “Cell phones” and click
        electronicsPage.mouseHoverToCellPhones();

        //2.3 Verify the text “Cell phones”
        String actualText = cellPhonePage.getCellPhoneText();
        Assert.assertEquals(actualText, "Cell phones", "Text not Displayed");

        //2.4 Click on List View Tab
        cellPhonePage.clickOnListViewTab();
        Thread.sleep(2000);

        //2.5 Click on product name “Nokia Lumia 1020” link
        cellPhonePage.clickOnNokiaLumia1020();

        //2.6 Verify the text “Nokia Lumia 1020”
        String actualNokiaLumiaText = nokiaLumiaPage.getNokiaLumiaText();
        Assert.assertEquals(actualNokiaLumiaText, "Nokia Lumia 1020", "Text not Displayed");

        //2.7 Verify the price “$349.00”
        String actualNokiaPriceText = nokiaLumiaPage.getNokiaPriceText();
        Assert.assertEquals(actualNokiaPriceText, "$349.00", "Text not Displayed");

        //2.8 Change quantity to 2
        nokiaLumiaPage.changeQuantity();
        Thread.sleep(2000);

        //2.9 Click on “ADD TO CART” tab
        nokiaLumiaPage.clickOnAddToCartButton();
        Thread.sleep(2000);

        //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar  After that close the bar clicking on the cross button.
        String actualTextShoppingCart = nokiaLumiaPage.getTextFromProductAddedToCart();
        Assert.assertEquals(actualTextShoppingCart, "The product has been added to your shopping cart", "Text not Displayed");
        nokiaLumiaPage.closeTheBarByClickingOnTheCrossButton();
        Thread.sleep(2000);

        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        nokiaLumiaPage.mouseHoverOnShoppingCart();
        nokiaLumiaPage.clickOnShoppingCart();

        //2.12 Verify the message "Shopping cart"
        String actualShoppingCartMessage = shoppingCartPage.getShoppingCartText();
        Assert.assertEquals(actualShoppingCartMessage, "Shopping cart", "error");


        //2.13 Verify the quantity is 2
        String actualQuantity = shoppingCartPage.getVerifyQuantity();
        Assert.assertEquals(actualQuantity, "2", "Error");

        //2.14 Verify the Total $698.00
        String actualTotal = shoppingCartPage.getVerifyTotal();
        Assert.assertEquals(actualTotal, "$698.00", "Error");

        //2.15 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnTermsOfServiceCheckBox();

        //2.16 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckOutButton();

        // 2.17 Verify the text “Welcome to our store”
        String actualWelcomeStoreText = loginLinkPage.verifyText();
        Assert.assertEquals(actualWelcomeStoreText, "Welcome, Please Sign In!", "error");

        //2.18 Click on “REGISTER” tab
        shoppingCartPage.clickOnRegister();

        //2.19 Verify the text “Register”
        String actualRegisterText = registerLinkPage.getRegisterTabText();
        Assert.assertEquals(actualRegisterText, "Register", "Error");

        //2.20 Fill the mandatory fields
        registerLinkPage.inputFirstname("Mary");
        registerLinkPage.inputLastname("John");
        String email ="Maryjohn80@gmail.com";
        registerLinkPage.inputEmail(email);
        //registerLinkPage.enterEmail();

        registerLinkPage.inputPassword("123456");
        registerLinkPage.inputConfirmPassword("123456");
        Thread.sleep(2000);
        //2.21 Click on “REGISTER” Button
        registerLinkPage.clickOnRegisterButton();
        Thread.sleep(2000);
        //2.22 Verify the message “Your registration completed”
        String actualRegisterSuccessMessage = registerLinkPage.getRegisterSuccessText();
        Assert.assertEquals(actualRegisterSuccessMessage, "Your registration completed", "error");
        Thread.sleep(2000);
        //2.23 Click on “CONTINUE” tab
        registerLinkPage.clickOnContinueButton();

        //2.24	Verify the text “Shopping cart”
        String actualShoppingCart = shoppingCartPage.getShoppingCartText();
        String expectedShoppingCart = "Shopping cart";
        Assert.assertEquals(actualShoppingCart, expectedShoppingCart, "Incorrect shopping cart displayed!");

        //Click on login button
        loginLinkPage.clickOnLogin();

        //Enter Email Password And Click on LoginButton
        loginLinkPage.login(email, "123456");

        //2.25 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnTermsOfServiceCheckBox();

        //2.26 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckOutButton();

        //2.27 Fill the Mandatory fields
        checkOutPage.inputFirstname("Mary");
        Thread.sleep(2000);
        checkOutPage.inputLastname("John");
        Thread.sleep(2000);
        checkOutPage.inputEmail("Maryjohn@gmail56.com");
        Thread.sleep(2000);
        checkOutPage.selectCountry("United States");
        Thread.sleep(2000);
        checkOutPage.selectState("Oklahoma");
        checkOutPage.inputCity("Tulsa");
        checkOutPage.inputAddress1("8945 144th Street");
        checkOutPage.inputPostalCode("74101");
        checkOutPage.inputPhoneNumber("918-456-7890");

        //2.28 Click on “CONTINUE”
        checkOutPage.clickOnContinueButton();

        //2.29 Click on Radio Button “2nd Day Air ($0.00)”
        checkOutPage.clickOnRadioButton2ndDayAir();

        // 2.30 Click on “CONTINUE”
        checkOutPage.clickOnContinueButton1();

        // 2.31 Select Radio Button “Credit Card”
        checkOutPage.clickOnCreditCard();
        checkOutPage.clickOnPaymentContinueButton();

        // 2.32 Select “Visa” From Select credit card dropdown
        checkOutPage.selectCreditCard("Visa");

        //2.33 Fill all the details
        checkOutPage.inputCardHolderName("Mr Prime Patel");
        checkOutPage.inputCardNumber("5356 6548 1418 5420");
        checkOutPage.selectExpireMonth("02");
        checkOutPage.selectExpireYear("2028");
        checkOutPage.inputCardCode("123");

        //2.34 Click on CONTINUE CHECKOUT
        checkOutPage.clickOnContinueButton2();

        // 2.35 Verify “Payment Method” is “Credit Card”
        String actualCreditCardMessage = checkOutPage.getCreditCardText();
        Assert.assertEquals(actualCreditCardMessage, "Payment Method: Credit Card", "error");

        // 2.36 Verify “Shipping Method” is “2nd Day Air”
        String actual02DayMessage = checkOutPage.get02ndDayText();
        Assert.assertEquals(actual02DayMessage, "2nd Day Air", "error");

        // 2.37 Verify Total is “$698.00”
        String actualTotalAmountNokiaMessage = checkOutPage.getTotalAmountNokiaText();
        Assert.assertEquals(actualTotalAmountNokiaMessage, "$698.00", "error");

        // 2.38 Click on “CONFIRM”
        checkOutPage.clickOnConfirmButton();

        //2.39 Verify the Text “Thank You”
        String actualThankYouMessage = checkOutPage.getThankYouText();
        Assert.assertEquals(actualThankYouMessage, "Thank you", "error");

        //2.40 Verify the message “Your order has been successfully processed!”
        String actualOrderSuccessProcessedMessage = checkOutPage.getOrderSuccessProcessText();
        Assert.assertEquals(actualOrderSuccessProcessedMessage, "Your order has been successfully processed!", "error");

        // 2.41 Click on “CONTINUE”
        checkOutPage.clickOnContinueButton3();

        // 2.42 Verify the text “Welcome to our store”
        String actualWelcomeOurStoreMessage = loginLinkPage.verifyText2();
        Assert.assertEquals(actualWelcomeOurStoreMessage, "Welcome to our store", "error");

        //2.43 Click on “Logout” link
        loginLinkPage.clickOnLogOut();

        // 2.44 Verify the URL is “https://demo.nopcommerce.com/”
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, "https://demo.nopcommerce.com/", "error");
    }
}
