package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    //2.12 Verify the message "Shopping cart"
    By shoppingCartText = By.xpath("//h1[normalize-space()='Shopping cart']");

    //2.13 Verify the quantity is 2
    By verifyQuantity = By.xpath("//input[@class = 'qty-input']");

    //2.14 Verify the Total $698.00
    By verifyTotal = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]");

    //2.15 click on checkbox “I agree with the terms of service”
    By termsOfServiceCheckBox = By.xpath("//input[@id='termsofservice']");

    //2.16 Click on “CHECKOUT”
    By checkOutButton = By.xpath("//button[@id='checkout']");

    //2.18 Click on “REGISTER” tab
    By clickOnRegister =By.xpath("//button[normalize-space()='Register']");


    public String getShoppingCartText(){
        return getTextFromElement(shoppingCartText);
    }
    public String getVerifyQuantity(){
        return getAttributeFromElement(verifyQuantity,"value");
    }
    public String getVerifyTotal(){
        return getTextFromElement(verifyTotal);
    }

    public void clickOnTermsOfServiceCheckBox(){
        clickOnElement(termsOfServiceCheckBox);
    }
    public void clickOnCheckOutButton(){
        clickOnElement(checkOutButton);
    }

    public void clickOnRegister(){
        clickOnElement(clickOnRegister);
    }
}

