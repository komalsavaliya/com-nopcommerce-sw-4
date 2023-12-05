package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class NokiaLumiaPage extends Utility {
    //2.6 Verify the text “Nokia Lumia 1020”
    By nokiaLumiaText = By.xpath("//h1[normalize-space()='Nokia Lumia 1020']");

    //2.7 Verify the price “$349.00”
    By nokiaPriceText = By.xpath("//span[@id='price-value-20']");

    //2.8 Change quantity to 2
    By cartQuantity = By.xpath("//input[@id='product_enteredQuantity_20']");

    //2.9 Click on “ADD TO CART” tab
    By addToCartButton =By.xpath("//button[@id='add-to-cart-button-20']");

    //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
    By productAddedToCartText = By.xpath("// p[@class='content']");

    //close the bar clicking on the cross button.
    By closeTheBarMsg = By.xpath("//span[@title='Close']");

    //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    By shoppingCartElement = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCartElement = By.xpath("//button[contains(text(),'Go to cart')]");

    public String getNokiaLumiaText() {
        return getTextFromElement(nokiaLumiaText);
    }

    public String getNokiaPriceText() {
        return getTextFromElement(nokiaPriceText);
    }

    public void changeQuantity() {
        sendTextToElement(cartQuantity, Keys.BACK_SPACE + "2");
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public String getTextFromProductAddedToCart() {
        return getTextFromElement(productAddedToCartText);
    }

    public void closeTheBarByClickingOnTheCrossButton() {
        clickOnElement(closeTheBarMsg);
    }

    public void mouseHoverOnShoppingCart() {
        mouseHoverToElement(shoppingCartElement);
    }

    public void clickOnShoppingCart() {
        clickOnElement(goToCartElement);
    }
}

