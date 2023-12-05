package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerTest extends BaseTest {
    HomePage homePage = new HomePage();
    DeskTopPage deskTopPage = new DeskTopPage();
    ComputersPage computersPage = new ComputersPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    LoginLinkPage loginLinkPage = new LoginLinkPage();
    CheckOutPage checkOutPage = new CheckOutPage();


    @Test
    public void verifyProductArrangeInAlphabeticalOrder() {

        //1.1 Click on Computer Menu.
        homePage.mouseHoverAndClickOnComputerTab();

        //1.2 Click on Desktop
        computersPage.clickOnDesktopOptionOfComputerTab();


        //get list before filter the name
        List<WebElement> beforeFilterNameZtoAList = driver.findElements(By.xpath("item-grid"));
        List<Double> beforeFileNameZtoAList = new ArrayList<>();
        for (WebElement nameZtoA : beforeFilterNameZtoAList) {
            beforeFileNameZtoAList.add(Double.valueOf(nameZtoA.getText().replace("$", "")));
        }
        // 1.3 Select Sort By position "Name: Z to A"
        buildYourOwnComputerPage.sortByPosition1("Name: Z to A");

        //Get list filter Name
        List<WebElement> afterFilterNameZtoAList = driver.findElements(By.xpath("item-grid"));
        List<Double> afterFileNameZtoAList = new ArrayList<>();
        for (WebElement nameZtoA : afterFilterNameZtoAList) {
            afterFileNameZtoAList.add(Double.valueOf(nameZtoA.getText().replace("$", "")));
        }
        //1.4 Verify the Product will arrange in Descending order.

        Collections.sort(beforeFileNameZtoAList);
        Assert.assertEquals(beforeFilterNameZtoAList, afterFilterNameZtoAList);
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        //2.1 Click on Computer Menu.
        homePage.mouseHoverAndClickOnComputerTab();

        //2.2 Click on Desktop
        computersPage.clickOnDesktopOptionOfComputerTab();

        //2.3 Select Sort By position "Name: A to Z"
        buildYourOwnComputerPage.sortByPosition1("Name: A to Z");
        Thread.sleep(5000);

        //2.4 Click on "Add To Cart"
        //buildYourOwnComputerPage.addToCart();

        //2.5 Verify the Text "Build your own computer"
        String expectedText = "Build your own computer";
        String actualText = buildYourOwnComputerPage.getTextFromBuildYourOwnComputerMessage();
        Assert.assertEquals(actualText, expectedText);

        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        buildYourOwnComputerPage.selectProcessor();

        //2.7.Select "8GB [+$60.00]" using Select class.
        buildYourOwnComputerPage.selectRams("8GB [+$60.00]");

        //2.8 Select HDD radio "400 GB [+$100.00]
        buildYourOwnComputerPage.selectHDDRadio();

        //2.9 Select OS radio "Vista Premium [+$60.00]"
        buildYourOwnComputerPage.selectOSRadioButton();

        //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander   [+$5.00]"
        buildYourOwnComputerPage.clickOnTotalCommander();

        //2.11 Verify the price "$1,475.00"
        String expectedText1="$1,475.00";
        String actualText1 = buildYourOwnComputerPage.verifyPriceText();
        Assert.assertEquals(actualText1,expectedText1);

        //2.12 Click on "ADD TO CARD" Button.
        buildYourOwnComputerPage.addToCartButton();

        //2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar , After that close the bar clicking on the cross button.
        String expectedText2 = "The product has been added to your shopping cart";
        String actualText2 = buildYourOwnComputerPage.verifyMessage();
        Assert.assertEquals(actualText2, expectedText2);

        //close the bar clicking on the cross button.
        buildYourOwnComputerPage.closingBarButton();

        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        buildYourOwnComputerPage.shoppingCartOption();
        buildYourOwnComputerPage.goToCartOption();


        //2.15 Verify the message "Shopping cart"
        String expectedText3 = "Shopping cart";
        String actualText3 = buildYourOwnComputerPage.verifyShoppingCartText();
        Assert.assertEquals(expectedText3, actualText3);

        //2.16 Change the Qty to "2" and Click on "Update shopping cart"
        buildYourOwnComputerPage.changeTheQty();
        buildYourOwnComputerPage.upgradeCart();

        //2.17 Verify the Total"$2,950.00
        String actualTotalMessage = buildYourOwnComputerPage.getTotalText();
        Assert.assertEquals(actualTotalMessage, "$2,950.00", "error");
        Thread.sleep(2000);

        //2.18 click on checkbox “I agree with the terms of service”
        buildYourOwnComputerPage.clickOnCheckBox();
        Thread.sleep(2000);

        // 2.19 Click on “CHECKOUT”
        buildYourOwnComputerPage.checkOutButton();
        Thread.sleep(2000);

        // 2.20 Verify the Text “Welcome, Please Sign In!”
        String actualWelcomeSignInText = loginLinkPage.verifyText();
        Assert.assertEquals(actualWelcomeSignInText, "Welcome, Please Sign In!", "error");

        // 2.21 Click on “CHECKOUT AS GUEST”Tab
        loginLinkPage.CheckoutAsAGuest();

        //2.22 Fill the all mandatory field
        checkOutPage.inputFirstname("Mary");
        checkOutPage.inputLastname("John");
        checkOutPage.inputEmail("Maryjohn@gmail.com");
        checkOutPage.selectCountry("United States");
        checkOutPage.selectState("Oklahoma");
        checkOutPage.inputCity("Tulsa");
        checkOutPage.inputAddress1("8945 144th Street");
        checkOutPage.inputPostalCode("74101");
        checkOutPage.inputPhoneNumber("918-456-7890");

        //2.23 Click on “CONTINUE”
        checkOutPage.clickOnContinueButton();

        //2.24 Click on Radio Button “Next Day Air($0.00)”
        checkOutPage.clickOnNextDayAirRadioButton();

        // 2.25 Click on “CONTINUE”
        checkOutPage.clickOnContinueButton1();

        // 2.26 Select Radio Button “Credit Card”
        checkOutPage.clickOnCreditCard();
        checkOutPage.clickOnPaymentContinueButton();

        //2.27 Select “Master card” From Select credit card dropdown
        checkOutPage.selectCreditCard("Master card");

        //2.28 Fill all the details
        checkOutPage.inputCardHolderName("Mary John");
        checkOutPage.inputCardNumber("0000 0000 0000 0000");
        checkOutPage.selectExpireMonth("05");
        checkOutPage.selectExpireYear("2030");
        checkOutPage.inputCardCode("5623");

        // 2.29 Click on “CONTINUE”
        checkOutPage.clickOnContinueButton2();

        //2.30 Verify “Payment Method” is “Credit Card”
        String actualTotalAmountMessage = checkOutPage.getTotalAmountText();
        Assert.assertEquals(actualTotalAmountMessage, "$2,950.00", "error");

        // 2.32 Verify “Shipping Method” is “Next Day Air”
        String actualShippingMessage = checkOutPage.getNextDayAirText();
        Assert.assertEquals(actualShippingMessage, "Shipping Method: Next Day Air", "error");

        //2.33 Verify Total is “$2,950.00”
        String totalAmountText = checkOutPage.getTotalAmountText();
        Assert.assertEquals(actualTotalMessage, "$2,950.00", "error");

        //2.34 Click on “CONFIRM”
        checkOutPage.clickOnConfirmButton();

        //2.35 Verify the Text “Thank You”
        String actualThankYouText = checkOutPage.getThankYouText();
        Assert.assertEquals(actualThankYouText, "Thank you", "error");

        // 2.36 Verify the message “Your order has been successfully processed!”
        String actualOrderSuccessText = checkOutPage.getOrderSuccessProcessText();
        Assert.assertEquals(actualOrderSuccessText, "Your order has been successfully processed!", "error");

        // 2.37 Click on “CONTINUE”
        checkOutPage.clickOnContinueButton3();

        // 2.38 Verify the text “Welcome to our store”
        String actualWelcomeStoreText = loginLinkPage.verifyText2();
        Assert.assertEquals(actualWelcomeStoreText, "Welcome to our store", "error");
    }
}

