package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class BuildYourOwnComputerPage extends Utility {

    //1.3 Select Sort By position "Name: Z to A"
    By positions =By.xpath("//select[@id='products-orderby']");

    //2.3 Select Sort By position "Name: A to Z"
    By getPositions = By.xpath("//div[@class='block block-category-navigation']/descendant::a[2]");

    //2.4 Click on "Add To Cart"
    //By addToCart = By.xpath("//a[text() = 'Build your own computer']");
    //By addToCart = By.xpath("(//button[@type='button'][normalize-space()='Add to cart'])[1]");
    By addToCart = By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]");
    //By addToCart = By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");


    // 2.5 Verify the Text "Build your own computer"
    By buildYourOwnComputerMessage = By.xpath("//h1[contains(text(),'Build your own computer')]");

    //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
    //By processor = By.xpath("//select[@id='product_attribute_1']");
    By processor = By.id("product_attribute_1");

    //2.7.Select "8GB [+$60.00]" using Select class.
    By selectRams = By.id("product_attribute_2");

    //2.8 Select HDD radio "400 GB [+$100.00]"
    By hdd = By.id("product_attribute_3_7");

    //2.9 Select OS radio "Vista Premium [+$60.00]"
    By os = By.id("product_attribute_4_9");

    //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
    By softwareBox2 = By.id("product_attribute_5_12");

    //2.11 Verify the price "$1,475.00"
    By verifyPriceText = By.xpath("//span[contains(text(),'$1,475.00')]");

    //2.12 Click on "ADD TO CARD" Button.
    By addToCartNButton = By.xpath("//button[@id='add-to-cart-button-1']");

    //2.13 Verify the Message "The product has been added to your shopping cart" on Top
    //green Bar
    By verifyMessage = By.xpath("//p[@class='content']");

    //After that close the bar clicking on the cross button.
    By closingBarButton = By.xpath("//span[@title='Close']");

    //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    By shoppingCartOption = By.cssSelector(".cart-label");
    By goToCartOption = By.xpath("//a[normalize-space()='shopping cart']");

    //2.15 Verify the message "Shopping cart"
    By verifyShoppingCartText = By.xpath("//h1[normalize-space()='Shopping cart']");

    //2.16 Change the Qty to "2" and Click on "Update shopping cart"
    By toClean = By.xpath("//input[@class = 'qty-input']");
    By changeTheQty = By.xpath("//td[@class=\"quantity\"]/child::input");

    By upgradeCart = By.xpath("//button[@id='updatecart']");

    //2.17 Verify the Total"$2,950.00"
    By getTotalText = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");

    //2.18 click on checkbox “I agree with the terms of service”
    By clickOnCheckBox = By.xpath("//input[@id='termsofservice']");

    //2.19 Click on “CHECKOUT”
    By checkOutButton1 = By.xpath("//button[@id='checkout']");
    public void sortByPosition1(String position){
        selectByVisibleTextFromDropDown(positions,position);
    }


    public void addToCart(){
        clickOnElement(addToCart);
    }

    public String getTextFromBuildYourOwnComputerMessage() {
        return getTextFromElement(buildYourOwnComputerMessage);
    }

    public void selectProcessor() {
       //selectByVisibleTextFromDropDown(processor,"1");
       selectByValueFromDropDown(processor,"1");
    }

    public void selectRams(String ram) {
        selectByVisibleTextFromDropDown(selectRams,ram);
    }

    public void selectHDDRadio() {
        clickOnElement(hdd);
    }

    public void selectOSRadioButton() {
        clickOnElement(os);
    }

    public void clickOnTotalCommander() {
        clickOnElement(softwareBox2);
    }

    public String verifyPriceText() {
        return getTextFromElement(verifyPriceText);
    }

    public void addToCartButton() {
        clickOnElement(addToCartNButton);
    }

    public String verifyMessage() {
        return getTextFromElement(verifyMessage);
    }

    public void closingBarButton() {
        clickOnElement(closingBarButton);
    }

    public void shoppingCartOption() {
        mouseHoverToElement(shoppingCartOption);
    }

    public void goToCartOption() {
        clickOnElement(goToCartOption);
    }

    public String verifyShoppingCartText() {
        return getTextFromElement(verifyShoppingCartText);
    }

    public void changeTheQty() {
        sendTextToElement(changeTheQty, Keys.BACK_SPACE + "2");
    }

    public void upgradeCart() {
        clickOnElement(upgradeCart);
    }

    public String getTotalText() {
        return getTextFromElement(getTotalText);
    }

    public void clickOnCheckBox() {
        clickOnElement(clickOnCheckBox);
    }

    public void checkOutButton() {
        clickOnElement(checkOutButton1);
    }
}
